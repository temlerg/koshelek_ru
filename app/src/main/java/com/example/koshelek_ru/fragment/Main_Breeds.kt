package com.example.koshelek_ru.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.koshelek_ru.R
import com.example.koshelek_ru.models.Repository
import com.example.koshelek_ru.network.Post
import com.example.koshelek_ru.views.Adapter
import kotlinx.android.synthetic.main.activity_main_fragment.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.example.koshelek_ru.fragment.Sub_breeds


class Main_Breeds : BaseFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val repository_main = Repository()
        val repository_sub = Repository()

        repository_main.getMainBreeds().enqueue(object : Callback<Post> {
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                if (response.body() != null) {
                    val listRepo = response.body()!!.message
                    recycleList.layoutManager = LinearLayoutManager(context)
                    val adapter = Adapter(listRepo) {
                        val s = it

                        repository_sub.getSubBreeds(s).enqueue(object : Callback<Post> {
                            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                                if (response.body() != null) {
                                    if (response.body()!!.message.isNotEmpty())
                                        openPage(Sub_breeds.getInstance(s))
                                    else openPage(Image.getInstance(s))

                                }
                            }

                            override fun onFailure(call: Call<Post>, t: Throwable) {
                                TODO("Not yet implemented")
                            }
                        })
                    }
                    recycleList.adapter = adapter
                }
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })

        return inflater.inflate(
            R.layout.activity_main_fragment,
            container,
            false
        )
    }

    private fun openPage(fragment: BaseFragment) {
        Activity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack("")
            .commit()
    }

}
package com.example.koshelek_ru.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.koshelek_ru.Activity.dialog_erroe
import com.example.koshelek_ru.R
import com.example.koshelek_ru.models.Repository
import com.example.koshelek_ru.network.Post
import com.example.koshelek_ru.views.Adapter
import kotlinx.android.synthetic.main.activity_main_fragment.*
import kotlinx.android.synthetic.main.sub_breeds.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Sub_breeds : BaseFragment() {
    private var breed: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    companion object {
        const val BREED = "breed"

        fun getInstance(breed: String): Sub_breeds {
            val fragment = Sub_breeds()
            val args = Bundle()
            args.putString(BREED, breed)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        breed = arguments?.getString(BREED)

        val repository = Repository()
        repository.getSubBreeds(breed.toString()).enqueue(object : Callback<Post> {
            override fun onResponse(call: Call<Post>, response: Response<Post>) {

                val listRepo = response.body()!!.message
                recycleList_sub.layoutManager = LinearLayoutManager(context)
                val adapter = Adapter(listRepo) {
                    val s = it
                    openPage(Image_sub.getInstance(s, breed.toString()))
                }
                recycleList_sub.adapter = adapter

                if(response.body()!!.status == "error") dialog_erroe()
                    .show(Activity.supportFragmentManager, "dialog")
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })

        return inflater.inflate(R.layout.sub_breeds, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        main_breed.text = breed.toString()

        all_breeds.setOnClickListener{
            openPage(Main_Breeds())
        }

    }

    private fun openPage(fragment: BaseFragment) {
        Activity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack("")
            .commit()
    }

}
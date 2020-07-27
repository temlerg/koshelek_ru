package com.example.koshelek_ru.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.koshelek_ru.R
import com.example.koshelek_ru.models.Repository
import com.example.koshelek_ru.network.Post
import com.example.koshelek_ru.views.Adapter
import com.example.koshelek_ru.views.Adapter_image
import kotlinx.android.synthetic.main.image.*
import kotlinx.android.synthetic.main.sub_breeds.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Image_sub : BaseFragment() {
    private var sub: String? = null
    private var main_b: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            sub = it.getString(SUB)
            main_b = it.getString(M_B)
        }
    }

    companion object {
        const val SUB = "sub"
        const val M_B = "M_B"

        fun getInstance(sub: String, main_b: String) =
            Image_sub().apply {
                arguments = Bundle().apply {
                    putString(SUB, sub)
                    putString(M_B, main_b)
                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val repository = Repository()
        repository.getSubBreedImage(sub.toString(), main_b.toString())
            .enqueue(object : Callback<Post> {
                override fun onResponse(call: Call<Post>, response: Response<Post>) {

                    val listRepo = response.body()!!.message
                    image_id.layoutManager = LinearLayoutManager(context)
                    val adapter = Adapter_image(listRepo)
                    image_id.adapter = adapter
                }

                override fun onFailure(call: Call<Post>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })

        return inflater.inflate(R.layout.image, container, false)
    }

    private fun openPage(fragment: BaseFragment) {
        Activity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack("")
            .commit()
    }
}
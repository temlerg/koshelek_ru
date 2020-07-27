package com.example.koshelek_ru.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.koshelek_ru.Activity.dialog_erroe
import com.example.koshelek_ru.Activity.dialog_share
import com.example.koshelek_ru.R
import com.example.koshelek_ru.models.Repository
import com.example.koshelek_ru.network.Post
import com.example.koshelek_ru.views.Adapter_image_sub
import kotlinx.android.synthetic.main.image.*
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
                    val adapter = Adapter_image_sub(listRepo, this@Image_sub)
                    image_id.adapter = adapter

                    if(response.body()!!.status == "error") dialog_erroe()
                        .show(Activity.supportFragmentManager, "dialog")
                }

                override fun onFailure(call: Call<Post>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })

        return inflater.inflate(R.layout.image, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        main_breed_image.text = main_b.toString()

        share.setOnClickListener {
            dialog_share().show(Activity.supportFragmentManager, "dialog")
        }

        back.setOnClickListener{
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
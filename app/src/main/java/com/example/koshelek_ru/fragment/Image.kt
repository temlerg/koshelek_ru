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


class Image : BaseFragment() {
    private var breed: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    companion object {
        const val BREED = "breed"

        fun getInstance(breed: String): Image {
            val fragment = Image()
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
        breed = arguments?.getString(Sub_breeds.BREED)
        val repository = Repository()
        repository.getMainBreedImage(breed.toString()).enqueue(object : Callback<Post> {
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
package com.example.koshelek_ru.fragment

import android.os.Bundle
import android.provider.SyncStateContract.Helpers.insert
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.koshelek_ru.Activity.dialog_erroe
import com.example.koshelek_ru.Activity.dialog_share
import com.example.koshelek_ru.App
import com.example.koshelek_ru.DB.*
import com.example.koshelek_ru.R
import com.example.koshelek_ru.models.Repository
import com.example.koshelek_ru.network.Post
import com.example.koshelek_ru.views.Adapter_image
import kotlinx.android.synthetic.main.image.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Image : BaseFragment() {
    private var breed: String? = null

    var db: AppDatabase? = App.instance!!.database
    var Dao: Dao_b = db!!.dao_b()


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
                val adapter = Adapter_image(listRepo, this@Image) {
                    val s = it
                    val like_db = Like_DB(breed_like = breed.toString(), im = s, size = 1)
                    Dao.insert(like_db)
                }
                image_id.adapter = adapter


                if (response.body()!!.status == "error") dialog_erroe()
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
        main_breed_image.text = breed.toString()

        share.setOnClickListener {
            dialog_share().show(Activity.supportFragmentManager, "dialog")
        }

        back.setOnClickListener {
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
package com.example.koshelek_ru.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.koshelek_ru.Activity.dialog_share
import com.example.koshelek_ru.App
import com.example.koshelek_ru.DB.AppDatabase
import com.example.koshelek_ru.DB.Dao_b
import com.example.koshelek_ru.R
import kotlinx.android.synthetic.main.activity_main_fragment.*
import kotlinx.android.synthetic.main.image_like.*


class Image_like : BaseFragment() {
    private var imag: String? = null
    var db: AppDatabase? = App.instance!!.database
    var Dao: Dao_b = db!!.dao_b()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    companion object {
        const val IM = "imeg"

        fun getInstance(imag: String): Image_like {
            val fragment = Image_like()
            val args = Bundle()
            args.putString(IM, imag)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        imag = arguments?.getString(Image_like.IM)
        return inflater.inflate(R.layout.image_like, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Favourites.setOnClickListener { openPage(Like()) }
        share.setOnClickListener {
            dialog_share().show(Activity.supportFragmentManager, "dialog")
        }
        val im_dog = Dao.getById(imag.toString())
        main_breed_f.text = im_dog.breed_like
        Glide
            .with(this)
            .load(imag.toString())
            .into(image_f);

        like_f.setOnClickListener {
            like_f.setImageResource(R.drawable.ic_baseline_favorite_border_24)
            Dao.delete(im_dog)
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
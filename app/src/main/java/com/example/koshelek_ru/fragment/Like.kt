package com.example.koshelek_ru.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.koshelek_ru.App
import com.example.koshelek_ru.DB.AppDatabase
import com.example.koshelek_ru.DB.Dao_b
import com.example.koshelek_ru.DB.Like_DB
import com.example.koshelek_ru.R
import com.example.koshelek_ru.models.List_DB
import com.example.koshelek_ru.views.Adapter_like
import kotlinx.android.synthetic.main.activity_main_fragment.like
import kotlinx.android.synthetic.main.activity_main_fragment.list
import kotlinx.android.synthetic.main.like.*
import java.util.*


class Like : BaseFragment() {
    var db: AppDatabase? = App.instance!!.database
    var dao: Dao_b = db!!.dao_b()
    var like_db_list: List<Like_DB> = dao.getAll()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.like, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        list.setOnClickListener { openPage(Main_Breeds()) }
        like.setOnClickListener { openPage(Like()) }


        val list = like_db_list
        recycleList_like.layoutManager = LinearLayoutManager(context)
        val adapter = Adapter_like(list){
            val s = it
            openPage(Image_like.getInstance(s))
        }
        recycleList_like.adapter = adapter
    }

    private fun openPage(fragment: BaseFragment) {
        Activity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack("")
            .commit()
    }


}



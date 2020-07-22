package com.example.koshelek_ru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.koshelek_ru.network.Post
import com.example.koshelek_ru.views.Adapter
import com.example.ttt.data.network.NetworkService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun showSuccess(temp: List<Post>) {
            val adapter = Adapter(temp)
            recycleList.adapter = adapter
        }

    }

}
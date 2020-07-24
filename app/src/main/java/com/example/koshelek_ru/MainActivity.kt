package com.example.koshelek_ru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.koshelek_ru.models.Repository
import com.example.koshelek_ru.network.Post
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.example.koshelek_ru.views.Adapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()

        repository.getBreeds().enqueue(object : Callback<Post> {
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                if (response.body() != null) {
                    val listRepo = response.body()!!.message
                    recycleList.layoutManager =LinearLayoutManager(this@MainActivity)
                    val adapter = Adapter(listRepo)
                    recycleList.adapter = adapter
                }
            }
            override fun onFailure(call: Call<Post>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

}
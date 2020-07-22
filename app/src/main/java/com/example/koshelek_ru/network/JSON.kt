package com.example.koshelek_ru.network


import com.example.ttt.data.network.Post
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface JSON {
    @GET("/all")
    fun getPostWithID(): Call<Post>
}
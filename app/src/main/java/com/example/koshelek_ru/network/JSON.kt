package com.example.koshelek_ru.network


import com.example.koshelek_ru.network.Post
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface JSON {
    @GET("/api/breeds/list/all")
    fun getPostWithID(): Call<Post>
}
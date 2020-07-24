package com.example.koshelek_ru.network

import retrofit2.Call
import retrofit2.http.GET

interface JSONMainBreeds {
    @GET("/api/breeds/list")
    fun getPostWithID(): Call<Post>
}
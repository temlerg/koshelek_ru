package com.example.koshelek_ru.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JSONImage_main {
    @GET("/api/{breed}/image")
    fun reposForUser(@Path("breed") breed: String): Call<Post>
}
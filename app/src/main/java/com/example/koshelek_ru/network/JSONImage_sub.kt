package com.example.koshelek_ru.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JSONImage_sub {
    @GET("/api/breed/{sub_breed}/image")
    fun reposForUser(@Path("sub_breed") sub_breed: String): Call<Post>
}
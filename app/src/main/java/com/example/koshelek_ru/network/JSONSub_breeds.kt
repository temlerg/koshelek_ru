package com.example.koshelek_ru.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JSONSub_breeds{
    @GET("/api/breed/{breed}/list")
    fun reposForUser(@Path("breed") breed: String): Call<Post>
}
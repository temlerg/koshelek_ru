package com.example.koshelek_ru.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JSONImage_sub {
    @GET("/api/breed/{breed}/{sub_breed}/images")
    fun getPostWithID(
        @Path("sub_breed") sub_breed: String,
        @Path("breed") breed: String
    ): Call<Post>
}
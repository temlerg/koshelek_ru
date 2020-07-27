package com.example.koshelek_ru.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkService {
    private const val BASE_URL = "https://dog.ceo"

    private val loggingInterceptor = run {
        val interceptor = HttpLoggingInterceptor()
        interceptor.apply {
            interceptor.level = HttpLoggingInterceptor.Level.BODY
        }
    }

    private val client = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .build()

    fun getApiRepositoriesMain(): JSONMainBreeds {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(JSONMainBreeds::class.java)
    }

    fun getApiRepositoriesSub(): JSONSub_breeds {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(JSONSub_breeds::class.java)
    }

    fun getApiRepositoriesMainImage(): JSONImage_main {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(JSONImage_main::class.java)
    }

    fun getApiRepositoriesSubBreedImage(): JSONImage_sub{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(JSONImage_sub::class.java)
    }
}
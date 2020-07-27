package com.example.koshelek_ru.models

import com.example.koshelek_ru.models.MainBreeds
import com.example.koshelek_ru.network.Post
import com.example.koshelek_ru.network.NetworkService
import retrofit2.Call

class Repository {
    fun getMainBreeds(): Call<Post> {
        return NetworkService.getApiRepositoriesMain().getPostWithID()
    }

    fun getSubBreeds(sub: String): Call<Post> {
        return NetworkService.getApiRepositoriesSub().getPostWithID(sub)
    }

    fun getMainBreedImage(sub: String): Call<Post> {
        return NetworkService.getApiRepositoriesMainImage().getPostWithID(sub)
    }

    fun getSubBreedImage(sub: String, main_b: String): Call<Post>{
        return NetworkService.getApiRepositoriesSubBreedImage().getPostWithID(sub, main_b)
    }
}
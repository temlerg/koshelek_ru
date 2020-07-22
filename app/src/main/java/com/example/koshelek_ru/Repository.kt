package com.example.koshelek_ru

import com.example.koshelek_ru.models.MainBreeds
import com.example.koshelek_ru.network.Post
import com.example.ttt.data.network.NetworkService
import retrofit2.Call

class Repository {
    fun getBreeds(): Call<Post>{
        return NetworkService.getApiRepositories().getPostWithID()
    }
    fun getMianBreeds(post: Post): MainBreeds? {

    }
}
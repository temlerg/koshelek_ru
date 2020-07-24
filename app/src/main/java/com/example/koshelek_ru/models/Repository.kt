package com.example.koshelek_ru.models

import com.example.koshelek_ru.models.MainBreeds
import com.example.koshelek_ru.network.Post
import com.example.koshelek_ru.network.NetworkService
import retrofit2.Call

class Repository {
    fun getBreeds(): Call<Post>{
        return NetworkService.getApiRepositories().getPostWithID()
    }
    fun getMianBreeds(post: Post): MainBreeds? {
        return MainBreeds(
            main_breeds = post.message
        )
    }
}
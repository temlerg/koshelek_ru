package com.example.koshelek_ru.DB

import androidx.room.*


@Dao
interface Dao_b {
    @Query("SELECT * FROM like_db")
    fun getAll(): List<Like_DB>

    @Query("SELECT * FROM Like_DB WHERE im = :id")
    fun getById(id: String): Like_DB

    @Insert
    fun insert(vararg like_DB: Like_DB)

    @Update
    fun update(like_DB: Like_DB)

    @Delete
    fun delete(like_DB: Like_DB)
}
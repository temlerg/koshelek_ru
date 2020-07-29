package com.example.koshelek_ru.DB

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Like_DB::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dao_b(): Dao_b
}
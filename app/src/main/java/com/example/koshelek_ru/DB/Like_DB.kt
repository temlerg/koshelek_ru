package com.example.koshelek_ru.DB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Like_DB(
    var breed_like: String,

    @PrimaryKey
    var im: String,

    @ColumnInfo(name = "size")
    var size: Int = 1
)
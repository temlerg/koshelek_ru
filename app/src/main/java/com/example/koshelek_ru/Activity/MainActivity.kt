package com.example.koshelek_ru.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koshelek_ru.R
import com.example.koshelek_ru.fragment.Main_Breeds



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, Main_Breeds())
            .commit()
    }

}
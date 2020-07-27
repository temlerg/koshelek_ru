package com.example.koshelek_ru.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.koshelek_ru.R
import kotlinx.android.synthetic.main.activity_main_fragment.*

class Like : BaseFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.like, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.setOnClickListener { openPage(Main_Breeds()) }
        like.setOnClickListener { openPage(Like()) }
    }

    private fun openPage(fragment: BaseFragment) {
        Activity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack("")
            .commit()
    }
}
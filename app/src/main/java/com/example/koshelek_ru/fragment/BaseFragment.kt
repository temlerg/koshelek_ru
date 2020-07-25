package com.example.koshelek_ru.fragment

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.koshelek_ru.Activity.MainActivity


open class BaseFragment : Fragment() {
    protected lateinit var Activity: MainActivity
    protected var TAG = this::class.java.simpleName

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Activity = context as MainActivity
    }
}
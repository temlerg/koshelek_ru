package com.example.koshelek_ru.Activity

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class dialog_share : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Share photo")
                .setPositiveButton("Cancel") { dialog, id -> }
                .setNegativeButton("Share") { dialog, id -> }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}
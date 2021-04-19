package com.example.dialogfragmenttest

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MyDialog: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(this.activity)

        builder.setMessage("Make a selection!")
            .setPositiveButton("OK") { dialog, id ->

            }
            .setNegativeButton("Cancel") { dialog, id ->

            }
        return builder.create()
    }
}


package com.example.mylibrary

import android.content.Context
import android.widget.Toast

object said {
    
    fun show(context: Context) {
        Toast.makeText(context,"Hello Youtubes.",Toast.LENGTH_SHORT).show()
    }
}
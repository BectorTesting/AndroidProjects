package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

object SomethingSpecial {
    fun show(C : Context, M : String){
        Toast.makeText(C,M,Toast.LENGTH_LONG).show()
    }
}
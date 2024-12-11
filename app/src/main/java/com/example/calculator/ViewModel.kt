package com.example.calculator

import android.annotation.SuppressLint
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import org.mariuszgromada.math.mxparser.Expression

class ViewModel : ViewModel() {
    var data = mutableStateOf("")
    var eq = mutableStateOf("")

    @SuppressLint("SuspiciousIndentation")
    fun result() {
        data.value= Expression(
            eq.value
        ).calculate().toString()

    }

}
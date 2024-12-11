package com.example.calculator.ui.theme

import android.service.autofill.OnClickAction
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import org.mariuszgromada.math.mxparser.Expression

@Composable
fun custButton(
    modifier: Modifier= Modifier,
    text:String = "",
    onClickAction:(String) -> Unit,
){
    Button(onClick = { onClickAction(text) },
        modifier =modifier.
        clip(CircleShape)) {
        Text(text = "$text")

    }
}


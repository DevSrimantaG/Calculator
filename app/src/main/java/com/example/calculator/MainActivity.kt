package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme
import com.example.calculator.ui.theme.custButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val vm:ViewModel=ViewModel()
            CalculatorTheme {
                val context = LocalContext.current
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    var eq = vm.eq

                    Column (modifier = Modifier.fillMaxSize()){
                        Column (modifier = Modifier.fillMaxHeight(.5f).fillMaxWidth(),
                            horizontalAlignment = Alignment.End,
                            verticalArrangement = Arrangement.Center){
                            Text(fontSize = 30.sp,
                                text = "${eq.value}")

                            var data="=${vm.data.value}"
                            Text(fontSize = 30.sp,
                                text = "${if(vm.data.value.isNullOrEmpty()) "" else data}")
                        }
                        Row (modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "C",
                                onClickAction = {
                                    eq.value=""
                                    vm.data.value=""
                                })
                            custButton(
                                modifier = Modifier.width(100.dp),
                                text = "⌫",
                                onClickAction = {
                                    if(!eq.value.isNullOrEmpty()){
                                        eq.value= eq.value.substring(0,eq.value.length-1)
                                    }
                                })
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "/",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                        }
                        Row (
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "+",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "-",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "*",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })

                        }
                        Row (modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "1",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "2",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "3",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                        }
                        Row (modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            custButton(
                                modifier = Modifier.width(100.dp),
                                text = "4",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                            custButton(
                                modifier = Modifier.width(100.dp),
                                text = "5",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                            custButton(
                                modifier = Modifier.width(100.dp),
                                text = "6",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                        }
                        Row (modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "7",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "8",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                            custButton (
                                modifier = Modifier.width(100.dp),
                                text = "9",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                        }
                        Row (
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            custButton(
                                modifier = Modifier.width(100.dp),
                                text = "0",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })
                            custButton(
                                modifier = Modifier.width(100.dp),
                                text = ".",
                                onClickAction = {
                                    eq.value=eq.value+it
                                })

                            custButton(
                                modifier = Modifier.width(100.dp),
                                text = "=",
                                onClickAction = {
                                    //res.value=result(eq.value)
                                    vm.result()
                                })
                        }
                    }
                }
            }
        }
    }
}

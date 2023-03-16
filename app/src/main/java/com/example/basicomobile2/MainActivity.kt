package com.example.basicomobile2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.basicomobile2.ui.theme.Basicomobile2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
        }

    }

    @Composable
    fun DefaultPreview() {
        Basicomobile2Theme {
            Surface(
                modifier = Modifier.width(200.dp).height(500.dp),
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp),
                color = Color.Red
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(
                        text = "abluébluéblué",
                        color = Color.Black,
                        modifier = Modifier
                            .background(Color.White)
                            .padding(18.dp)
                    )
                    Text(
                        text = "abluébluéblué",
                        color = Color.Black,
                        modifier = Modifier
                            .background(Color.Blue)
                            .padding(18.dp)
                    )

                    Text(
                        text = "abluébluéblué",
                        color = Color.Blue,
                        modifier = Modifier
                            .background(Color.Yellow)
                            .padding(18.dp)
                    )
                }
            }
        }
    }
}
package com.example.greetingcard1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard1.ui.theme.GreetingCard1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCard1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayCardGreeting("Happy Birthday", "Fikri")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Cyan) {
        Text(text = "Hello, my name is $name!", modifier=Modifier.padding(24.dp))
    }
}

@Composable
fun BirthdayCardGreeting(message: String, from: String) {
    Column(){
        Text(text=message, fontSize=36.sp)
        Text(text=from, fontSize=24.sp)
    }
}
@Preview(showBackground = true)
@Composable
fun HappyBirthdayGreeting() {
    GreetingCard1Theme {
        BirthdayCardGreeting("Happy Birthday", "Fikri")
    }
}
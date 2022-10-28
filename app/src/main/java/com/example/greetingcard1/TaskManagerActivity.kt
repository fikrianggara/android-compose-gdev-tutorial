package com.example.greetingcard1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard1.ui.theme.GreetingCard1Theme

class TaskManagerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCard1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskManagerPage(getString(R.string.task_manager_title), getString(R.string.task_manager_subtitle))
                }
            }
        }
    }
}

@Composable
fun Logo() {
    val image = painterResource(id =R.drawable.ic_task_completed)
    Image(painter = image, contentDescription = null, modifier = Modifier
        .fillMaxWidth(), contentScale = ContentScale.Inside  )
}
@Composable
fun TaskManagerPage(title:String, subTitle:String) {
    Column{
        Logo()
        Text(text = title, fontSize = 24.sp,  modifier = Modifier
            .padding(top = 24.dp, bottom = 8.dp)
            .wrapContentWidth(Alignment.CenterHorizontally))
        Text(text = subTitle, fontSize = 16.sp, modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview2() {
    GreetingCard1Theme {
        Column(
            modifier = Modifier.wrapContentHeight(Alignment.CenterVertically)){
            Logo()
            Text(text = "All tasks completed", fontSize = 24.sp, modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp).fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally).wrapContentHeight(Alignment.CenterVertically))
            Text(text = "Nice work!", fontSize = 16.sp, modifier = Modifier.fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally).wrapContentHeight(Alignment.CenterVertically))
        }
    }
}
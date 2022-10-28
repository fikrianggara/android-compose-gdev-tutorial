package com.example.greetingcard1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard1.ui.theme.GreetingCard1Theme

class Submission1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCard1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeTutorialPage()
                }
            }
        }
    }
}

@Composable
fun Header() {
    val image = painterResource(id =R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = null, modifier = Modifier.fillMaxWidth())
}

@Composable
fun Title(title: String){
    Text(text=title, fontSize = 24.sp, modifier = Modifier.padding(all = 16.dp))
}

@Composable
fun Description1(description:String){
    Text(text=description, modifier = Modifier.padding(start=16.dp, end=16.dp), textAlign = TextAlign.Justify)
}

@Composable
fun Description2(description:String){
    Text(text=description, modifier = Modifier.padding(all=16.dp), textAlign = TextAlign.Justify)
}

@Composable
fun ComposeTutorialPage(){
    Column{
        Header()
        Title(stringResource(R.string.title))
        Description1(stringResource(R.string.desc_1))
        Description2("In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    GreetingCard1Theme {
        Column{
            Header()
            Title(stringResource(R.string.title))
            Description1(stringResource(R.string.desc_1))
            Description2("In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
        }
    }
}
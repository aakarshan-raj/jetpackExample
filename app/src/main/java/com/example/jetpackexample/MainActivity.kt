package com.example.jetpackexample

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackexample.ui.theme.JetPackExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    write()
                }
            }
        }
    }
}

@Composable
fun write(){
    var value = rememberSaveable{
        mutableStateOf("Text")
    }

    Button(onClick = {}){
         Text(text = "Click me")
    }
    TextField(value =value , onValueChange = false,label = { Text("Label") })
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackExampleTheme {
        write()
    }
}
package com.example.jetpackexample

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.*
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

    var value by remember {
        mutableStateOf("")
    }
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.fillMaxWidth()) {
            OutlinedTextField(value = value, onValueChange = {text->value=text} )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Add")
            }
        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackExampleTheme {
        write()
    }
}
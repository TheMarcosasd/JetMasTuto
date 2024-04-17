package com.example.jetmastuto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetmastuto.ui.theme.JetMasTutoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetMasTutoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}
@Composable
fun GreetingText(message: String,modifier: Modifier = Modifier){
    Text(
        text = message,
        fontSize = 100.sp
    )
}


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    JetMasTutoTheme {
        GreetingText(message = "Happy Bithday Sam!!")
    }
}
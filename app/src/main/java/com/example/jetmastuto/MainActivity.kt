package com.example.jetmastuto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.R
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Box(modifier = Modifier.fillMaxSize()){
      Column(modifier = Modifier.align(Alignment.TopEnd)) {
          Text(
              text = "Ronda",
              textAlign = TextAlign.Center
          )
          Text(
              text = "0",
              Modifier
                  .width(50.dp)
                  .border(width = 1.dp, color = Color.Black)
          )
      }
      Column(
          modifier = Modifier
              .align(Alignment.Center)) {
          Row {
              Button(
                  onClick = { /*TODO*/ },
                  colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                  modifier =  Modifier.size(width = 100.dp,height = 40.dp)
              ) {

              }
              Spacer(modifier = Modifier.width(20.dp))
              Button(
                  onClick = { /*TODO*/ },
                  colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                  modifier =  Modifier.size(width = 100.dp,height = 40.dp)
              ) {

              }
          }
          Spacer(modifier = Modifier.height(20.dp))
          Row() {
              Button(
                  onClick = { /*TODO*/ },
                  colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),
                  modifier =  Modifier.size(width = 100.dp,height = 40.dp)
              ) {

              }
              Spacer(modifier = Modifier.width(20.dp))
              Button(
                  onClick = { /*TODO*/ },
                  colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                  modifier =  Modifier.size(width = 100.dp,height = 40.dp)
              ) {

              }
          }
      }
      Row(
          modifier = Modifier.align(Alignment.BottomCenter)) {
          Button(
              onClick = { /*TODO*/ },
              colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray), 
              modifier = Modifier.size(width = 100.dp, height = 40.dp)
          ) {
                Text(text = "Start")
          }
          Spacer(modifier = Modifier.width(20.dp))
          Button(
              onClick = { /*TODO*/ },
              colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
              modifier = Modifier.size(width = 100.dp, height = 40.dp)
          ) {
              Text(text = "Final")
          }
      }
  }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetMasTutoTheme {
        Greeting("Android")
    }
}
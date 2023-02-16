package com.example.bt_cafe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.bt_cafe.ui.theme.BT_CafeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BT_CafeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RestaurantName(
                        name = stringResource(id = R.string.title),
                        size = 32
                    )
                }
            }
        }
    }
}


@Composable
fun RestaurantName(name: String, size: Int){
    Text(text = name, fontSize = size.sp)
}


@Preview(showBackground = true)
@Composable
fun ShowRestaurantNamePre(){
        RestaurantName(
            name = stringResource(id = R.string.title),
            size = 32
        )


}


@Composable
fun Greeting(name: String) {
    Text(text =  "Hello $name!")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BT_CafeTheme() {
        Greeting("Android")
    }
}
package com.example.bt_cafe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bt_cafe.ui.theme.BT_CafeTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BT_CafeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                        UpperPart()
                    }
            }





        }
    }
}

@Composable
fun UpperPart(){
    // layout: column, row, box
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFF495E57)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = stringResource(id = R.string.title),
            color = Color(0xFFF4CE14),
            fontSize = 32.sp,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )

        Text(
            text = stringResource(id = R.string.location),
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.padding(start = 20.dp)
        )

        Row(
            Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                border = BorderStroke(1.dp, Color.Red),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
            ) {
                Text(text = stringResource(id = R.string.order))
            }

            Image(
                painter = painterResource(id = R.drawable.cafe),
                contentDescription = "",
                Modifier.height(100.dp)
            )


        }
    }
}

@Preview(showBackground = true)
@Composable
fun UpperPartPreview(){
    UpperPart()
}

/*
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
}*/

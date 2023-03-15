package com.example.bt_cafe

import android.widget.GridLayout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MenuGrid(){
    Column(Modifier.verticalScroll(rememberScrollState() )) {
        repeat(10){
            Row(Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                repeat(2){
                    GridCell()
                }
            }

        }
    }

}


@Composable
fun GridCell(){
    Card(
        elevation = 16.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Box(
            modifier = Modifier
                .requiredSize(180.dp, 180.dp)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Card Img"
            )

            Text(
                text = "Firstiano",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .background(Color.White)
                    .align(Alignment.TopStart)

            )

            Text(
                text = "$12.99",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp)
                    .align(Alignment.BottomEnd)
            )

        }

    }
}
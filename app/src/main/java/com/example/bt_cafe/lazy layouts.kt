package com.example.bt_cafe

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun LazyColumnRememberState(){
    LazyColumn(state = rememberLazyListState()){
        item{LazyRowRememeberState()}

        items(1000){
            MyCard(number = it)
        }
    }
}

@Composable
fun LazyRowRememeberState(){
    // Note that rememberLazyListState() function creates a LazyListState that is remembered across recompositions.    
    LazyRow(state = rememberLazyListState()){
        items(1000){
            MyCard(number = it)
        }
    }
}


@Composable
fun MyCard(number: Int){
    Card(elevation = 16.dp, modifier = Modifier.padding(16.dp)) {
        Text(
            text = number.toString(),
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()

        )

    }
}
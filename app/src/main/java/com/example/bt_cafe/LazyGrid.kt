package com.example.bt_cafe

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun LazyGridTest(){
    // use GridCells.Adaptive(150.dp) so that when orientation occurs then there are greater number of column grid than vertical orientation
    LazyVerticalGrid(cells = GridCells.Fixed(3) ){
        items(500){
            number -> MyLazyGrid(number)
        }
    }
}

@Composable
fun MyLazyGrid(number: Int){
    Card(
        elevation = 20.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Box(
            modifier = Modifier.aspectRatio(1f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Item " + number,
                fontSize = 20.sp

            )
        }
    }
}
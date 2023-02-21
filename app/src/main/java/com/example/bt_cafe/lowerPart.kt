package com.example.bt_cafe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPart() {
    Column {
        WeeklySpecial()
        MenuDish()
    }
}


@Composable
fun WeeklySpecial(){
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = stringResource(id = R.string.menu_header),
            fontWeight = FontWeight.Bold,
            fontSize = 26.sp,
            modifier = Modifier
                .padding(8.dp)
        )
    }

}


@Composable
fun MenuDish() {
    Card{
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        ){
            Column {
                Text(
                    text = stringResource(id = R.string.item_one),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = stringResource(id = R.string.dsc_one),
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(0.75f)
                )
                Text(
                    text = stringResource(id = R.string.rate_one),
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
            }

            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Greek Salad Image"
            )
        }
    }

    Divider(
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = Color.LightGray,
        thickness = 1.dp
    )

}

@Preview(showBackground = true)
@Composable
fun LowerPartPreview(){
    LowerPart()
}

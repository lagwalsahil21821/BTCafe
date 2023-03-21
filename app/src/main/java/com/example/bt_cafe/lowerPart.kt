package com.example.bt_cafe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bt_cafe.data.Categories
import com.example.bt_cafe.data.Dish
import com.example.bt_cafe.data.Dishes

@Composable
fun LowerPart() {
    Column {
        WeeklySpecial()
        MyCategory()

        Divider(
            modifier = Modifier.padding(8.dp),
            color = Color.Gray,
            thickness = 1.dp

        )

        MyDishes()
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
private fun MenuCategory(category: String) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
        shape = RoundedCornerShape(40),
        modifier = Modifier.padding(8.dp)
    ) {
        Text(text = category)
    }
}

@Composable
fun MenuDish(dish: Dish) {
    Card{
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        ){
            Column {
                Text(
                    text = dish.name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = dish.description,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(0.75f)
                )
                Text(
                    text =  dish.price,
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
            }

            Image(
                painter = painterResource(id = dish.image),
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

@Composable
fun MyCategory(){
    LazyRow() {
        items(Categories){
            Category -> MenuCategory(Category)
        }
    }
}


@Composable
fun MyDishes(){
    LazyColumn(){
        items(Dishes){
            Dish-> MenuDish(Dish)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LowerPartPreview(){
    LowerPart()
}

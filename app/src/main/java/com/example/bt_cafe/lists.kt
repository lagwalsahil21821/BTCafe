package com.example.bt_cafe


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ListRun(){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        categories.forEach(){
            MenuCategory(category = it)
        }
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

@Preview(showBackground = true)
@Composable
fun MenuCategoryPreview(){
    MenuCategory(category = "Category")
}


val categories = listOf<String>(
    "Lunch",
    "Dessert",
    "Mains"
)
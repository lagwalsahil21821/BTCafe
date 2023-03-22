package com.example.bt_cafe

import android.webkit.WebSettings
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun MySurface(){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        androidx.compose.material.Surface(
            color = LittleLemonColor.yellow,
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Little",
                fontSize = 40.sp,
                modifier = Modifier
                    .padding(10.dp)
                    .wrapContentSize(align = Alignment.Center)
                    .border(2.dp, LittleLemonColor.charcoal)
            )

        }

        androidx.compose.material.Surface(
            color = LittleLemonColor.orange,
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Lemon",
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(10.dp)
                    .wrapContentSize(align = Alignment.TopEnd)
                    .border(2.dp, LittleLemonColor.charcoal)
            )

        }

        // Text Styling
        androidx.compose.material.Surface(
            color = LittleLemonColor.yellow,
            shape = RoundedCornerShape(80.dp,0.dp,80.dp,0.dp),
            modifier = Modifier
                .height(500.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Little Lemon",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Monospace,
                    letterSpacing = 4.sp,
                    shadow = Shadow(
                        color = Color.Black,
                        offset = Offset(8f,8f),
                        blurRadius = 4f
                    ),
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.combine(
                        listOf(
                            TextDecoration.Underline,
                            //TextDecoration.LineThrough
                        )

                    )
                ) ,
                modifier = Modifier
                        .padding(10.dp)
                    .wrapContentSize(align = Alignment.Center)
            )

        }

        androidx.compose.material.Surface(
            color = LittleLemonColor.orange,
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = LittleLemonColor.yellow,
                            fontSize = 40.sp
                        )
                    ){
                        append("L")
                    }
                    append("ittle")
                }
            )

        }
    }

}
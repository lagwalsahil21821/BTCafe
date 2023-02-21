package com.example.bt_cafe

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UpperPart(){
    val context = LocalContext.current
    // layout: column, row, box
    Column(
//        verticalArrangement = Arrangement.Top,
//        horizontalAlignment = Alignment.Start,    // no need as it is by default
        modifier = Modifier
            .background(Color(0xFF495E57))
            .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)

    ) {
        Text(
            text = stringResource(id = R.string.title),
            color = Color(0xFFF4CE14),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(id = R.string.location),
            fontSize = 24.sp,
            color = Color(0xFFEDEFEE)
        )

        Row(
            Modifier
                .padding(top = 18.dp)

        ) {
            Text(
                text = stringResource(id = R.string.description_one),
                color = Color(0xFFEDEFEE),
                fontSize = 18.sp,
                modifier = Modifier.fillMaxWidth(0.6f)
            )
            Image(
                painter = painterResource(id = R.drawable.cafe),
                contentDescription = "Upper Part Image",
                Modifier
                    .clip(RoundedCornerShape(20.dp))
            )

        }

        Button(
            onClick = {
                Toast.makeText(context, "Order received. Thank you!", Toast.LENGTH_SHORT).show()
            },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF4CE14))
        ) {
            Text(
                text = stringResource(id = R.string.order),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun UpperPartPreview(){
    UpperPart()
}
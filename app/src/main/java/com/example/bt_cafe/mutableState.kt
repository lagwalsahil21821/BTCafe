package com.example.bt_cafe

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Remove
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MutRem(){
    var count by rememberSaveable(){    //every time you add or remove recomposition occurs, so to remember
                                        // previous values use this
        mutableStateOf(0)
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = stringResource(id = R.string.item_one),
            fontSize = 30.sp
        
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(
                onClick = { if(count>0) count-- }
            ) {
                Icon(imageVector = Icons.Default.Remove,
                    contentDescription = "Remove")
            }

            Text(
                text = "$count",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )

            IconButton(onClick = { count++ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun MutRemPreview(){
    MutRem()
}
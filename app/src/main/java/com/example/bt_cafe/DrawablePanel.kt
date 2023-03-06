package com.example.bt_cafe

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope

@Composable
fun DrawablePanel(scaffoldState: ScaffoldState, scope: CoroutineScope){
    // list of 10 dummy items
    List(10){ Text(text = "item #$it", modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)) }

    //close icon button
    IconButton(onClick = { }) {
        Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "Close Drawer")
    }
}



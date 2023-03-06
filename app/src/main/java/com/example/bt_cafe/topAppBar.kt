package com.example.bt_cafe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopAppBar(scaffoldState: ScaffoldState? = null, scope: CoroutineScope? = null){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        IconButton(onClick = {
                scope?.launch { scaffoldState?.drawerState?.open() }
            }
        ) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Navigation Button")
            //Image(painter = painterResource(id = R.drawable.cafe), contentDescription = "Menu Icon")
        }


        Image(painter = painterResource(id = R.drawable.img),
            contentDescription = "BT logo ",
            modifier = Modifier
                .padding(20.dp)
                .size(20.dp)
        )

        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Navigation Button")
//            Image(painter = painterResource(id = R.drawable.img),
//                contentDescription = "Cart",
//                modifier = Modifier.padding(20.dp).size(20.dp)
//            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TopAppBarPreview(){
    TopAppBar()
}
package com.example.bt_cafe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
    Box(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        IconButton(
            onClick = {
                scope?.launch { scaffoldState?.drawerState?.open() } },
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            //Icon(imageVector = Icons.Default.Menu, contentDescription = "Navigation Button")
            Image(
                painter = painterResource(id = R.drawable.ic_hamburger_menu),
                contentDescription = "Menu Icon"
            )
        }


        Image(painter = painterResource(id = R.drawable.btcafe),
            contentDescription = "BT logo ",
            modifier = Modifier.fillMaxWidth(0.32f)
                .align(Alignment.Center)

        )

        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            //Icon(imageVector = Icons.Default.Search, contentDescription = "Navigation Button")
            Image(painter = painterResource(id = R.drawable.ic_basket),
                contentDescription = "Cart",
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TopAppBarPreview(){
    TopAppBar()
}
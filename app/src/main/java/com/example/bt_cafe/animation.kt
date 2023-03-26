package com.example.bt_cafe

import android.opengl.Visibility
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun MainAnimation(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        VisibilityChangeWOAnimation()
        Divider(thickness = 2.dp, color = LittleLemonColor.yellow)

        VisibilityChangeWithAnimation()
        Divider(thickness = 2.dp, color = LittleLemonColor.yellow)

        AnimatedLogo()

    }
}
@Composable
// change visibility of composable without animation

fun VisibilityChangeWOAnimation(){
    var visible by remember{
        mutableStateOf(true)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally){
        if(visible){
            Text(text = "Without Animation")
        }
        Button(onClick = { visible = !visible }) {
            Text("Button")
        }
    }

}


@Composable
fun VisibilityChangeWithAnimation(){
    var visible by remember{
        mutableStateOf(true)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally) {

        AnimatedVisibility(
            visible = visible,
            enter = fadeIn(animationSpec = tween(2000)),
            exit = fadeOut(animationSpec = tween(2000))
        ) {
            Text("Animated Visibility")
        }

        Button(onClick = {visible = !visible}) {
            Text(text = "Button")
        }
    }
}

@Composable
fun AnimatedLogo(){
    var alfaImg by remember{
        mutableStateOf(0f)
    }

    val animateAlfaImg by animateFloatAsState(
        targetValue = alfaImg,
        animationSpec = tween(durationMillis = 4000)
    )
    Box(
        modifier = Modifier.fillMaxSize()
            .clickable {
                alfaImg += 1f
            }
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_hamburger_menu),
            contentDescription = "",
            modifier = Modifier.align(Alignment.Center)
        )
        Image(
            painter = painterResource(id = R.drawable.littlelemonimgtxt_nobg),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.Center)
                .alpha(alpha = animateAlfaImg)
        )
    }

}
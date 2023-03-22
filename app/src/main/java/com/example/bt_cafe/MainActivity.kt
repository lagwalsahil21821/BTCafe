package com.example.bt_cafe

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()


        }
    }
}

@Composable
fun HomeScreen(){
    /*
    // navigation start
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route){
        composable(Home.route){
            firstScreen(navController)
        }

        composable(MenuList.route){
            MenuListScreen()     // in mutable state.kt file
        }
    }

    // navigation end
    */

    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = { DrawablePanel(scaffoldState = scaffoldState, scope = scope)},
        topBar = {
            TopAppBar(scaffoldState = scaffoldState, scope = scope)
        }
    ) {
        Column {
            UpperPart()
            LowerPart()

        }
    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}



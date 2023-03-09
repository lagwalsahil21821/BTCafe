package com.example.bt_cafe

interface Destinations{
    val route:String    // roughly equal to defining the id to destination
}

object Home: Destinations{
    override val route = "Home"
}

object MenuList:Destinations{
    override val route = "MenuList"
}
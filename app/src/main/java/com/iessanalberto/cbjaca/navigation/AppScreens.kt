package com.iessanalberto.cbjaca.navigation

sealed class AppScreens(val route: String) {
    object MainScreen : AppScreens(route = "main_screen")
    object AlevinesScreen : AppScreens(route = "alevines_screen")
    object InfantilScreen : AppScreens(route = "infantil_screen")
    object CadeteScreen : AppScreens(route = "cadete_screen")
    object FaltasScreen:AppScreens(route="faltas_screen")
}
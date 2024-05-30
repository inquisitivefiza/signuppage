package com.example.loginpage

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Splash") {
        composable("Splash") { Splash(navController) }
        composable("Login") { Login(navController) }
        composable("Page") { Page(navController) }
    }
}



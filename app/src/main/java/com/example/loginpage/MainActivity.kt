package com.example.loginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          MyNavigation()

            }
        }
    }

@Composable
fun MyNavigation(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination ="Splash ") {


        composable("Splash") { Splash(navController) }
        composable("Page1") { Login(navController) }
        composable("page2"){ Page(navController)}

    }
}







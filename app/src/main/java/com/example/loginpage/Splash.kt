package com.example.loginpage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavHostController) {

    LaunchedEffect(key1 = true) {
        delay(3000) // Delay for 3 seconds
        navController.navigate("Login") {
            popUpTo("Splash") { inclusive = true }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    )
    Column {
        Row {
            Text(
                text = "Work",
                fontSize = 20.sp,
                color = Color(0xFFFF9800),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 150.dp, top = 390.dp)
            )
            Text(
                text = "Ngine",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start=2.dp, top = 390.dp)
            )

        }

    }
    Row {

        Text(
            text = "Powered by ",
            fontSize = 10.sp,
            color = Color.Gray,
            modifier = Modifier.padding(start = 150.dp, top = 800.dp)

        )
        Text(
            text = "Ngime",
            fontSize = 10.sp,
            color = Color(0xFFFF9800),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 2.dp, top = 800.dp)

        )
    }
}










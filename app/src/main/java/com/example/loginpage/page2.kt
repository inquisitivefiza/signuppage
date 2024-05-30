package com.example.loginpage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Page(navController: NavHostController) {

    var name by remember { mutableStateOf("") }
    var surname by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(modifier = Modifier.padding(start = 14.dp, top = 20.dp)) {
                Text(
                    text = "Work",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Ngine",
                    style = TextStyle(
                        color = Color(0xFFFF9800),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.padding(start = 4.dp)
                )
            }

            Text(
                text = "Registration",
                style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                ),
                modifier = Modifier.padding(top = 40.dp, start = 14.dp)
            )

            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Frames consequent eros. diam, eu morbi vehicula.",
                style = TextStyle(fontSize = 14.sp, color = Color.Gray),
                modifier = Modifier.padding(top = 10.dp, start = 14.dp, end = 14.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                    verticalAlignment = Alignment.CenterVertically,
                modifier=Modifier.padding(5.dp)
                   )




                 {
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text(text = "First Name") },
                    leadingIcon = { Icon(Icons.Default.Person, contentDescription = "person") },
                    modifier = Modifier
                        .weight(1f)

                        .padding(end = 8.dp)
                )
                OutlinedTextField(
                    value = surname,
                    onValueChange = { surname = it },
                    label = { Text(text = "Surname") },
                    leadingIcon = { Icon(Icons.Default.Person, contentDescription = "person") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 8.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = phone,
                onValueChange = { phone = it },
                label = { Text(text = "Phone") },
                leadingIcon = { Icon(Icons.Default.Phone, contentDescription = "phone") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password") },
                leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = confirmpassword,
                onValueChange = { confirmpassword = it },
                label = { Text(text = " Confirm Password") },
                leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "confirmpassword") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp)
            )

            Row {

                Text(
                    text = "Have account ?",
                    fontSize = 10.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(top = 630.dp, start = 30.dp)
                )
                Text(
                    text = "Connect",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF9800),
                    fontSize = 10.sp,
                    modifier = Modifier.padding(top = 630.dp)
                )
            }
        }
        Row {
            Text(
                text = "Don't have account ?",
                fontSize = 10.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 650.dp, start = 30.dp)
            )
            Text(
                text = "Register",
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF9800),
                fontSize = 10.sp,
                modifier = Modifier.padding(top = 650.dp)
            )


        }
    }
    Row {
        Text(
            text ="Powered by ",
            fontSize = 10.sp,
            color = Color.Gray,
            modifier = Modifier.padding(start=150.dp,top=800.dp)

        )
        Text(
            text ="Ngime",
            fontSize = 10.sp,
            color=Color(0xFFFF9800),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start=2.dp,top=800.dp)

        )
    }

}
    @Composable
    fun Button() {
        Button(
            onClick = {},
            colors = ButtonDefaults.run { buttonColors(Color(0xFFFF9800)) },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 550.dp)
        ) {
            Text(
                text = "Sign In",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            )
        }
    }





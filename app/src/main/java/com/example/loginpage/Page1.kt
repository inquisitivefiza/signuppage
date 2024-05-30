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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController





@Composable
fun Login(navController: NavHostController) {

    var emailText by remember { mutableStateOf(TextFieldValue("")) }
    var passwordText by remember { mutableStateOf(TextFieldValue("")) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row {
                Text(
                    text = "Work",
                    style = TextStyle(color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(start = 30.dp, top = 10.dp)
                )
                Text(
                    text = "Ngine",
                    style = TextStyle(color = Color(0xFFFF9800), fontSize = 18.sp, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(top = 10.dp)
                )
            }
            Text(
                text = "Connection",
                style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                ),
                modifier = Modifier.padding(top = 60.dp, start = 30.dp)
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Frames consequent eros. Diam, eu morbi vehicula.",
                style = TextStyle(fontSize = 12.sp, color = Color.DarkGray),
                modifier = Modifier.padding(top = 10.dp, start = 30.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, top = 30.dp),
                value = emailText,
                onValueChange = { emailText = it },
                label = { Text("Email") },
                /* leadingIcon = { Icon(Icons.Default.Email, contentDescription = null) },*/
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(start = 30.dp, top = 30.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = passwordText,
                onValueChange = { passwordText = it },
                label = { Text("Password") },
                /* leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Password Icon") },*/
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, top = 4.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row {
                Text(
                    text = "Forgot",
                    style = TextStyle(fontSize = 10.sp, color = Color.Gray),
                    modifier = Modifier.padding(top = 14.dp, start = 30.dp)
                )
                Text(
                    text = "Password ?",
                    style = TextStyle(fontSize = 10.sp, color = Color.Gray, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(top = 14.dp ,start=2.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            ButtonWithRoundCornerShape( navController)
            Row {
                Text(
                    text = "Don't have account ?",
                    fontSize = 10.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(top = 14.dp, start = 30.dp)
                )
                Text(
                    text = "Register",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF9800),
                    fontSize = 10.sp,
                    modifier = Modifier.padding(top = 14.dp)
                )
            }
            Row {
                Text(
                    text ="Powered by ",
                    fontSize = 10.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(start=150.dp,top=245.dp)

                )
                Text(
                    text ="Ngime",
                    fontSize = 10.sp,
                    color=Color(0xFFFF9800),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start=2.dp,top=245.dp)

                )
            }


        }

    }
}

@Composable
fun ButtonWithRoundCornerShape(navController: NavHostController) {
    Button(
        onClick = {navController.navigate("page2")},
        colors = ButtonDefaults.run { buttonColors(Color(0xFFFF9800)) },

        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, top = 10.dp)
    ) {
        Text(
            text = "Login",
            style = TextStyle(fontSize = 16.sp, color = Color.White, fontWeight = FontWeight.Bold)
        )
    }
}



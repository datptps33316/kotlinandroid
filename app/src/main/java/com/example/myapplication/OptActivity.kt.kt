package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class OptActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Otp()
                }
            }
        }
    }
}

@Preview
@Composable
fun Otp() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text(
            text = "Delivery of \n products ",
            Modifier
                .padding(top = 130.dp)
                .fillMaxWidth()
                .padding(horizontal = Dp(15f)),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily(Font(R.font.nunito_bold)),
            fontSize = 49.sp,
            fontStyle = FontStyle.Normal,
            color = Color(0xFF45BC1B),
            lineHeight = 39.sp,
            fontWeight = FontWeight(900)
        )
        Text(
            text = "Enter code from SMS ",
            Modifier
                .padding(top = Dp(30f))
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            lineHeight = 28.sp,
            fontWeight = FontWeight(700)

        )
        Text(
            text = "We have sent a message to  ",
            Modifier
                .padding(top = Dp(8f))
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            fontStyle = FontStyle.Normal,
            style = TextStyle(color = Color(0xFF6B6D7B)),
            lineHeight = 22.4.sp,
            fontWeight = FontWeight(500)

        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "phone   ",
                Modifier
                    .padding(start = Dp(130f))
                   ,
                textAlign = TextAlign.Start,
                style = TextStyle(color = Color(0xFF6B6D7B)),
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(500)

            )
            Text(
                text = "+7 999 123 45 67 ",
                color = Color(0xFF002100),
                textAlign = TextAlign.Start,
                style = TextStyle(color = Color(0xFF6B6D7B)),
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                lineHeight = 22.4.sp,
                fontWeight = FontWeight(500)

            )
        }

        Row(

            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(

                modifier = Modifier

                    .width(51.dp)
                    .height(51.dp),
                value = "",
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFB5E4A4),
                    unfocusedBorderColor = Black
                ),
                shape = RoundedCornerShape(12.dp),

                onValueChange = {},
//            label = {
//                Text(
//                    text = "Create a password  ",
//                    style = TextStyle(color = Color(0xFF45BC1B))
//                )
//            },


            )
            OutlinedTextField(

                modifier = Modifier

                    .width(51.dp)
                    .height(51.dp),

                value = "",
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFB5E4A4),
                    unfocusedBorderColor = Black
                ),
                shape = RoundedCornerShape(12.dp),

                onValueChange = {},
//            label = {
//                Text(
//                    text = "Create a password  ",
//                    style = TextStyle(color = Color(0xFF45BC1B))
//                )
//            },


            )
            OutlinedTextField(

                modifier = Modifier

                    .width(51.dp)
                    .height(51.dp),
                value = "",
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFB5E4A4),
                    unfocusedBorderColor = Black
                ),
                shape = RoundedCornerShape(12.dp),

                onValueChange = {},
//            label = {
//                Text(
//                    text = "Create a password  ",
//                    style = TextStyle(color = Color(0xFF45BC1B))
//                )
//            },


            )
            OutlinedTextField(

                modifier = Modifier

                    .width(51.dp)
                    .height(51.dp),
                value = "",
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFB5E4A4),
                    unfocusedBorderColor = Black
                ),
                shape = RoundedCornerShape(12.dp),

                onValueChange = {},
//            label = {
//                Text(
//                    text = "Create a password  ",
//                    style = TextStyle(color = Color(0xFF45BC1B))
//                )
//            },


            )


        }

        Button(
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0xFF45BC1B)),
            modifier = Modifier
                .padding(top = 24.dp)
                .width(343.dp)
                .height(54.dp)
                .align(Alignment.CenterHorizontally),
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Request code via 59  ", textAlign = TextAlign.Center)
        }
        Column(
            modifier = Modifier
                .padding(top = 32.dp)
                .align(alignment = Alignment.CenterHorizontally)
        ) {
            Text(
                text = "By clicking on the \"Confirm Login\" button, I agree to the ",
                textAlign = TextAlign.Center,
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight(500),
                fontFamily = FontFamily(Font(R.font.nunito_bold)),
                color = Color(0xFF8F8F8F),
                lineHeight = 16.8.sp,
            )
            Text(
                text = "terms of use of the service ",
                textAlign = TextAlign.Center,
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.nunito_bold)),
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight(500),
                color = Color(0xFF8F8F8F),
                lineHeight = 16.8.sp,
            )
        }

    }

}
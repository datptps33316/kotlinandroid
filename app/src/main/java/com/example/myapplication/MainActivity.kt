package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Maint()
                }
            }
        }
    }
}

@Preview
@Composable
fun Maint() {
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
            text = "Authorization or registration ",
            Modifier
                .padding(top = Dp(97f))
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontStyle = FontStyle.Normal,
            lineHeight = 28.sp,
            fontWeight = FontWeight(700)

        )


        OutlinedTextField(

            modifier = Modifier
                .padding(32.dp)
                .width(343.dp)
                .align(Alignment.CenterHorizontally),
            value = "",
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFB5E4A4),
                unfocusedBorderColor = Black
            ),
            shape = RoundedCornerShape(12.dp),

            onValueChange = {},
            label = {
                Text(
                    text = "Enter phone number ",
                    style = TextStyle(color = Color(0xFF45BC1B))
                )
            },


            )
        Button(
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0xFF45BC1B)),
            modifier = Modifier
                .width(343 .dp)
                .height(54.dp)
                .align(Alignment.CenterHorizontally),
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Confirm Login ", textAlign = TextAlign.Center)
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
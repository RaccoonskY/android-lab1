package com.example.androidcourse

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcourse.ui.theme.AndroidCourseTheme


@Composable
fun BusinessCard(title: String, description: String,bgcolor: Color,modifier: Modifier = Modifier){

    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(bgcolor)
            .height(300.dp)
            .padding(top = 80.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(16.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                modifier = Modifier
                    .background(Color.Black)
                    .width(50.dp),
                contentDescription = "Android logo")
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = description,
                fontSize = 14.sp,
                textAlign = TextAlign.Justify,

            )
        }
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(bottom = 20.dp)
                .height(200.dp)

        ) {
            Row(
                horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email logo",
                    Modifier.size(15.dp)
                )
                Text(
                    text = "viktoryablonskas@yandex.ru",
                    fontSize = 10.sp
                )
            }
            Row(
                horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Phone logo",
                    Modifier.size(15.dp)
                )
                Text(
                    text = "+8 800 555 35 35",
                    fontSize = 10.sp
                )
            }

        }
    }



}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview(modifier: Modifier = Modifier){
    AndroidCourseTheme{
        BusinessCard(
            title = "Яблонскас Виктор",
            description = "Android developer",
            bgcolor = Color.Green)

    }
}





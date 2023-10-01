package com.example.androidcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidcourse.ui.theme.AndroidCourseTheme


@Composable
fun QuadrantCompose(title: String, description: String,bgcolor: Color,modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(bgcolor)
            .padding(16.dp)
            .width(160.dp)
            .fillMaxHeight()
        ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }



}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview(modifier: Modifier = Modifier){
    AndroidCourseTheme{
        Column(
            Modifier.fillMaxWidth()
        ){
            Row (
                Modifier.weight(1f)
            ) {
                QuadrantCompose(title = "Text composable",
                    description = "Displays text and follows the recommended Material Design guidelines.",
                    bgcolor = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f))
                QuadrantCompose(title = "Image composable",
                    description = "Creates a composable that lays out and draws a given Painter class object.",
                    bgcolor = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(1f))
            }
            Row (
                Modifier.weight(1f)
            ) {

                QuadrantCompose(title = "Row composable",
                    description = "A layout composable that places its children in a horizontal sequence.",
                    bgcolor = Color(0xFFB69DF8),
                    modifier = Modifier.weight(1f))
                QuadrantCompose(title = "Column composable",
                    description = "A layout composable that places its children in a vertical sequence.",
                    bgcolor = Color(0xFFF6EDFF),
                    modifier = Modifier.weight(1f))
            }
        }

    }
}





package com.example.composequadrant


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyScreen()
                }
            }
        }
    }
}


@Composable
fun MyScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = Modifier
            .weight(1f)) {
            ComposableCard(
                heading = "Text composable",
                paragraph = "Displays text and follows the recommended Material Design guidelines.",
                0xFFEADDFF,
                modifier = Modifier.weight(1f)
            )
            ComposableCard(
                heading = "Image composable",
                paragraph = "Creates a composable that lays out and draws a given Painter class object.",
                0xFFD0BCFF,
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            ComposableCard(
                heading = "Row composable",
                paragraph = "A layout composable that places its children in a horizontal sequence.",
                0xFFB69DF8,
                modifier = Modifier.weight(1f)
            )
            ComposableCard(
                heading = "Column composable",
                paragraph = "A layout composable that places its children in a vertical sequence.",
                0xFFF6EDFF,
                modifier = Modifier.weight(1f)
            )
        }
    }
}



@Composable
fun ComposableCard(heading: String, paragraph: String, color: Long, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(), color = Color(color)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = heading, fontWeight = FontWeight.Bold, modifier = Modifier.padding(16.dp))
            Text(text = paragraph, textAlign = TextAlign.Justify)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyScreen()
}
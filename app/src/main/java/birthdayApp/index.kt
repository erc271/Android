package com.example.index

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstapp.ui.theme.FirstAppTheme // Ensure this matches your actual theme package

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Call the GreetingText function to display the birthday greeting
                    GreetingText(message = "Happy Birthday Ayoub!")
                }
            }
        }
    }
}

// Define the GreetingText composable function with a message and modifier
@Composable
fun GreetingText(message: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,  // Center horizontally in the Column
        verticalArrangement = Arrangement.Center // Center vertically in the Column
    ) {
        // Centered greeting message
        Text(
            text = message,
            modifier = modifier.padding(16.dp),
            fontSize = 95.sp,
            lineHeight = 150.sp,
            textAlign = TextAlign.Center
        )

        // Row for "From Me" text, aligned to the start (left)
        Row(
            modifier = Modifier
                .fillMaxWidth() // Fill the width of the parent
                .padding(start = 16.dp) // Optional padding for left alignment
        ) {
            Text(
                text = "From Me",
                fontSize = 55.sp,
                modifier = Modifier.align(Alignment.CenterVertically) // Vertically center the text within the Row
            )
        }
    }
}

// Preview of the GreetingText composable function
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    FirstAppTheme {
        GreetingText(message = "Happy Birthday Ayoub!")
    }
}

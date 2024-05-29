package com.example.gymapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Challenge(onBackClick: () -> Unit, onHomeClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E1E1E))
    ) {
        // Back Button
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(start = 20.dp, top = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "Back",
                modifier = Modifier
                    .size(20.dp)
                    .clickable { onBackClick.invoke() }
            )
        }

        Spacer(modifier = Modifier.height(1.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.challenge),
                contentDescription = "Challenge",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp),
                contentScale = ContentScale.FillWidth
            )
            Image(
                painter = painterResource(id = R.drawable.congrats),
                contentDescription = "Congrats",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        }


        Button(
            onClick = { onHomeClick.invoke() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            contentPadding = PaddingValues(20.dp)
        ) {
            Text(
                text = "Home",
                fontSize = 18.sp,
                color = Color.White
            )
        }
    }
}

@Composable
@Preview
fun PreviewChallengeScreen() {
    Challenge(
        onBackClick = { /* Handle back button click */ },
        onHomeClick = { /* Handle home button click */ }
    )
}

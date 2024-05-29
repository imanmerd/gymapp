package com.example.gymapplication.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val CustomColorScheme = lightColorScheme(
    primary = TextColor,
    onPrimary = TextColor,
    primaryContainer = NavBarColor,
    onPrimaryContainer = TextColor,
    background = BodyColor,
    onBackground = NavBarColor,
    surface = BodyColor,
    onSurface = TextColor
)

@Composable
fun GymApplicationTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = CustomColorScheme,
        typography = Typography, // Define your typography if needed
        content = content
    )
}

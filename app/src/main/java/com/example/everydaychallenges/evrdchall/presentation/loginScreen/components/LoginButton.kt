package com.example.everydaychallenges.evrdchall.presentation.loginScreen.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginButton(
    name: String,
    backgroundColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
       Button(
           colors = ButtonDefaults.buttonColors(
               containerColor = backgroundColor
           ),
           shape = RoundedCornerShape(4.dp),
           onClick = onClick
       ) {
           Text(text = name)
       }
}
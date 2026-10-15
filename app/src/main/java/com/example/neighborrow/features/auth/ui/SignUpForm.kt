package com.example.neighborrow.features.auth.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.neighborrow.core.designsystem.components.AppButton
import com.example.neighborrow.core.designsystem.components.AppTextField


@Composable
fun SignUpForm(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        AppTextField(
            value="",
            onValueChange = { },
            label = "Full name",
            placeholder = "Ivan Ivanov"
        )
        AppTextField(
            value="",
            onValueChange = { },
            label = "Email",
            placeholder = "example@gmail.com"
        )
        AppTextField(
            value="",
            onValueChange = { },
            label = "Password",
            placeholder = "Enter your password"
        )
        AppTextField(
            value="",
            onValueChange = { },
            label = "Confirm password",
            placeholder = "Repeat your password"
        )
        AppButton(
            text = "Register",
            onClick = {}
        )
        Text(
            text = "Already have an account? Sign in"
        )
    }
}
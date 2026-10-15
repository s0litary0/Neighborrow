package com.example.neighborrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.neighborrow.core.designsystem.components.AppScaffold
import com.example.neighborrow.core.designsystem.theme.NeighborrowTheme
import com.example.neighborrow.features.auth.ui.SignUpScreen
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NeighborrowTheme {
                AppScaffold(modifier = Modifier.fillMaxSize()) {
                    SignUpScreen(modifier = Modifier)
                }
            }
        }
    }
}
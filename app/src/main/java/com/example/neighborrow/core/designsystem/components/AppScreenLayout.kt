package com.example.neighborrow.core.designsystem.components

import android.graphics.Color
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun AppScreenLayout(
    innerPadding: PaddingValues = PaddingValues(),
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(horizontal = 24.dp, vertical = 24.dp),
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(paddingValues)
//            .border(
//                1.dp,
//                MaterialTheme.colorScheme.outline
//            )
    ) {
        content()
    }
}
package com.iessanalberto.cbjaca.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FaltasScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            { Text(text = "Faltas")},
            { Modifier.fillMaxSize() },

        )
    }
    ) { padding ->
        FaltasScreenContent(navController = navController, Modifier.padding())
    }
}

@Composable
fun FaltasScreenContent(navController: NavController, modifier: Modifier = Modifier) {

}
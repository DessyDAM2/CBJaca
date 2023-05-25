package com.iessanalberto.cbjaca.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.iessanalberto.cbjaca.R
import com.iessanalberto.cbjaca.navigation.AppScreens


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                { Text(text = "Menú Principal") },

                )

        }) { padding -> MainScreenBodyContent(navController, Modifier.padding()) }
}


@Composable
fun MainScreenBodyContent(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_baloncesto),
            contentDescription = "Logo de equipo",
            modifier = Modifier
                .size(250.dp)
                .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Fit
        )

        Row() {
            Button(onClick = { navController.navigate(route = AppScreens.InfantilScreen.route) }) {
                Text(text = "Categoria Infantil")
            }

        }
        Row() {
            Button(onClick = { navController.navigate(route = AppScreens.AlevinesScreen.route) }) {
                Text(text = "Categoria Alevines")
            }
        }
        Row() {
            Button(onClick = { navController.navigate(route = AppScreens.CadeteScreen.route) }) {
                Text(text = "Categoria Cadete")
            }
        }
    }
}
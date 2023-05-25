package com.iessanalberto.cbjaca.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.iessanalberto.cbjaca.clases.Juan
import com.iessanalberto.cbjaca.clases.Jugador
import com.iessanalberto.cbjaca.clases.listaAlevines

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InfantilesScreen(navController: NavController) {
    Scaffold() { padding ->
        InfantilesScreenContent(navController, Modifier.padding())
    }
}

@Composable
fun InfantilesScreenContent(navController: NavController, modifier: Modifier = Modifier) {

    Column() {
        LazyColumn(

        ) {
            items(listaAlevines.toList()) { jugador ->
                CardPersonContent(
                    edad = jugador.edad,
                    nombre = jugador.nombre,
                    categoria = jugador.categoria
                )
            }
        }
    }
}


@Composable
fun CardPersonContent(edad: Int, nombre: String, categoria: String) {
    Card(
        modifier = Modifier
            .padding(15.dp)
            .background(Color(0xffc2dbf0))

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(Modifier.fillMaxSize()) {
                Text(
                    text = nombre,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.align(Alignment.TopCenter)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Box(
                    Modifier
                        .align(Alignment.TopCenter)
                        .fillMaxHeight()
                        .width(50.dp)
                )


            }
            Box(Modifier.fillMaxSize()){
                Text(
                    text = categoria,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.align(Alignment.TopCenter)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Box(
                    Modifier
                        .align(Alignment.TopCenter)
                        .fillMaxHeight()
                        .width(50.dp)
                )

            }
            Box(Modifier.fillMaxSize()){
                Text(
                    text = edad.toString(),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.align(Alignment.TopCenter)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Box(
                    Modifier
                        .align(Alignment.TopCenter)
                        .fillMaxHeight()
                        .width(50.dp)
                )
            }
            Button(onClick = { /*TODO*/ }) {
                
            }
        }
    }
}
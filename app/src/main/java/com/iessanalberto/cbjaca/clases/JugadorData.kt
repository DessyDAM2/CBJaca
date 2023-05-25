package com.iessanalberto.cbjaca.clases

val Juan: Jugador = Jugador("Juan", "Alevin", 14,0)
val Marcos: Jugador = Jugador("Marcos", "Infantil", 12,0)
val Jose: Jugador = Jugador("Jose", "Cadete", 17, 0)

val listaAlevines = mutableListOf<Jugador>(Juan)
val listaCadetes = mutableListOf<Jugador>(Jose)
val listaInfantil = mutableListOf<Jugador>(Marcos)
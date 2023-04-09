package net.itinajero.apps.baraja.cartas

class CartaJoker(private var aColor: Boolean) : Carta() {

    override fun representacion() =  if (aColor) "Joker a colores" else "Joker a blanco y negro"

}
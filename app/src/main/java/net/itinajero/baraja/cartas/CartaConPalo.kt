package net.itinajero.baraja.cartas

import net.itinajero.baraja.Palo

open abstract class CartaConPalo(private var palo: Palo) : Carta() {

    override fun representacion(): String {
        return " de $palo"
    }
}
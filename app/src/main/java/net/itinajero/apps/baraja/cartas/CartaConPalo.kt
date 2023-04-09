package net.itinajero.apps.baraja.cartas

import net.itinajero.apps.baraja.Palo

open abstract class CartaConPalo(private var palo: Palo) : Carta() {

    override fun representacion(): String {
        return " de $palo"
    }
}
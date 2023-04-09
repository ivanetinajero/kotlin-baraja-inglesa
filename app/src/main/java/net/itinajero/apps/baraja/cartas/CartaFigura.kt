package net.itinajero.apps.baraja.cartas

import net.itinajero.apps.baraja.Palo

class CartaFigura(private var letra: String, private var palo: Palo) : CartaConPalo(palo) {

    override fun representacion(): String {
        return "$letra${super.representacion()}"
    }
}
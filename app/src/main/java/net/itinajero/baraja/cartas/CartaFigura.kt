package net.itinajero.baraja.cartas

import net.itinajero.baraja.Palo

class CartaFigura(private var letra: String, private var palo: Palo) : CartaConPalo(palo) {

    override fun representacion(): String {
        return "$letra${super.representacion()}"
    }
}
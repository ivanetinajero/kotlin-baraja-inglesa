package net.itinajero.baraja.cartas

import net.itinajero.baraja.Palo

class CartaNumeral(private var numero: Int, private var palo: Palo) : CartaConPalo(palo){

    override fun representacion(): String {
        return "$numero${super.representacion()}"
    }
}
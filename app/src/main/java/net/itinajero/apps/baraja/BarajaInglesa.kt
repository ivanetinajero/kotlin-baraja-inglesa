package net.itinajero.apps.baraja

import net.itinajero.apps.baraja.cartas.Carta
import net.itinajero.apps.baraja.cartas.CartaFigura
import net.itinajero.apps.baraja.cartas.CartaJoker
import net.itinajero.apps.baraja.cartas.CartaNumeral

class BarajaInglesa(){

    private var cartas: ArrayList<Carta>

    init{
        println("Bloque init BarajaInglesa")
        this.cartas = ArrayList()
        generarCartas()
        println("Total Cartas en la Baraja: ${cartas.size}")
    }

    fun mostrarBaraja(){
        for (carta in cartas){
            carta.darVuelta()
            carta.mostrar()
        }
    }

    private fun generarCartas(){
        generarCartasNumerales()
        generarCartasFiguras()
        generarCartasJokers()
    }

    private fun generarCartasNumerales() {
        val MIN_VALOR: Int = 2
        val MAX_VALOR: Int = 10

        // Recorremos los palos (DIAMANTE, CORAZON, PICA, TREBOL)
        for (palo in Palo.values()){
            // Recorremos los numeros del 2 al 10
            for (num in MIN_VALOR..MAX_VALOR) {
                this.cartas.add(CartaNumeral(num, palo))
            }
        }
    }

    private fun generarCartasFiguras() {
        val letras: ArrayList<String> = arrayListOf("A", "J", "Q", "K")

        // Recorremos los palos (DIAMANTE, CORAZON, PICA, TREBOL)
        for (palo in Palo.values()) {
            // Recorremos el array de letras
            for (letra in letras){
                this.cartas.add(CartaFigura(letra, palo))
            }
        }
    }

    private fun generarCartasJokers() {
        this.cartas.add(CartaJoker(true))
        this.cartas.add(CartaJoker(false))
    }
}

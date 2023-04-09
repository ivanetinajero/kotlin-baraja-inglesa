package net.itinajero.apps.baraja.cartas

open class Carta() {

    private var tapada: Boolean = true

    fun darVuelta(){
        tapada = !tapada
    }

    fun mostrar(){
        if (tapada){
            println("**********")
        }else{
            println(representacion())
        }
    }

    open fun representacion(): String{
        return "Carta Genérica"
    }

    fun isTapada() : Boolean{
        return tapada
    }
}
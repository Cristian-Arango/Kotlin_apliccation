package com.CristianArango.myapplication

import kotlin.math.PI

class Funciones {
}

fun main() {
    /*print("Por favor digite su edad ")
    var edad:Int= readLine()!!.toInt()
    var bienvenido= if (edad>=18) true else false
    println(bienvenido)*/


    fun pericircle() { print("Por favor digite el valor del diametro: ")
        var peri: Double = readLine()!!.toDouble()
        var valorperi: Double = PI * peri
        println("El valor del perimetro del circulo es: $valorperi")
    }

        fun areacircle() {
        print("Por digite el valor del radio: ")
        var radio: Double = readLine()!!.toDouble()
        val radiocua: Double = radio * radio
        var valorarea: Double = PI * radiocua
        println("EL valor del area es: $valorarea") }

        fun triangulo(base: Double, altura: Double) {
        var area = (base * altura) / 2
        println("EL valor del area del triangulo es $area") }

        fun trianguloperi(lado1: Double, lado2: Double, lado3: Double) {
        var peri = lado1 + lado2 + lado3
        println("EL valor del perimetro del triangulo es $peri") }

        var seguir = "yes"
        while (seguir == "yes") {
        print("Bienvenido, dijite Area si desea calcular el area de un numero o escoja Perimetro si desea calcular el perimetro de un cirulo: ")
        var opcion = readLine()!!
        var verdaderaopcion = opcion.uppercase()


        if (verdaderaopcion == "AREA") {
            areacircle()
        } else if (verdaderaopcion == "PERIMETRO") {
            pericircle()


        }
        else if(verdaderaopcion=="PERIMETRO TRIANGULO"){
            print("Digite el valor del lado1 , el lado 2 y el lado 3")
            var lado1= readLine()!!.toDouble()
            var lado2= readLine()!!.toDouble()
            var lado3= readLine()!!.toDouble()
            trianguloperi(lado1,lado2,lado3)
        }
        else if(verdaderaopcion=="AREA TRIANGULO"){
            var base= readLine()!!.toDouble()
            var altura= readLine()!!.toDouble()
            triangulo(base,altura)
        }

        else {
            println("Dijito de manera incorrecta ")
        }






        print("desea seguir : ?")
        seguir = readLine()!!
    }


    //Funciones con parametros


}


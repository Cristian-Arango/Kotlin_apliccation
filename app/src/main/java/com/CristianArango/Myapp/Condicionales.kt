package com.CristianArango.myapplication

class Condicionales {
}

fun main() {
    /*
    print("ingrese 1 numero :")
    var num1:Int= readLine()!!.toInt()
    print("ingrese 2 numero :")
    var num2:Int= readLine()!!.toInt()

    if (num1>num2){
        println("The number great is $num1")
    }
    else if (num1==num2){
        println("the numbers are equal")
    }
    else{
        println("the number great is $num2")
    }


    print("ingresa  un numero de 1 a 20 :")
    var num1:Int= readLine()!!.toInt()
    if (num1 in 1..20){
        println("EL numero esta en el rango")
    }
    else{
        println("Sea serio, le dije que un numero de 1 a 20")
    }*/

var result:Int=(1..50).random()
    print(result)

    when(result){
        0-> println("Eso est mal")
        else-> println("Epa la arepa ")
    }

}
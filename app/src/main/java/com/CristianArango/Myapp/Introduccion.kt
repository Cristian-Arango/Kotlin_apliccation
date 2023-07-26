package com.CristianArango.myapplication

class Introduccion {
}

fun main(){

    print("ingrese 1 numero :")
    var num1:Int= readLine()!!.toInt()
    print("ingrese 2 numero :")
    var num2:Int= readLine()!!.toInt()


    println("la suma entre el  $num1 + $num2 es ${num1+num2}")
}
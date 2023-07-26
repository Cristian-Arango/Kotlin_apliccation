package com.CristianArango.myapplication

class Arrays {
}

fun main() {
    val pets= arrayOf("Pandora","Nala","Mini","Bonny")
    //recorrer un arreglo
    /*print(pets.contentToString())
    //ver una poscicion
    print(pets[1])*/

    //Cambiar una poscicion
   /* pets[1]="pan"
    print(pets.contentToString())*/

    //Array con diferentes tipos de datos


    //ciclos para recorrer un array
    /*
    for((indice,element )in pets.withIndex()) {
        println("$indice es $element  ")
    }*/

    //List

    /*val instrumentos= listOf("Piano","guitarra","flauta")
    println(instrumentos)*/

    //lsit 2/ mutable
    val mylist= mutableListOf("piano","hola","como")
    mylist[1]="sacsofon "


    //primer elemento y ultimo
    println(mylist.first())
    println(mylist.last())

    //agregar elementos
    mylist.add("buena")

    //quitar elemnto
    mylist.remove("hola")

    //error of sintaxis

    //quiatr elemntos por index
    mylist.removeAt(2)

    //elimitar lista
    mylist.removeAll(mylist)


}
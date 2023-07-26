package com.CristianArango.Myapp.Retos

class Reto_Condicionales {
}

fun main() {


    var dado1:Int=(1..6).random()
    var dado2:Int=(1..6).random()
    var suma:Int= dado1+dado2

    if (dado1==1 && dado2 ==1){
    println("Felicitacion usted gano Callo par de 1( sus dados son ->) $dado1 y $dado2")
    }
    else if(suma==3){
        println("Felicitaciones los dados sumas 3 ya que calleron $dado1 y $dado2")
    }
    else if (suma==11){
        println("Felicitaciones los dados sumas 11 ya que calleron $dado1 y $dado2")
    }
    else if (suma==2||suma==12){
        println("Felicitaciones los dados 2 o 12 calleron $dado1 y $dado2")
    }
    else if (suma==7){
        println("Felicitaciones los dados sumas 2 ya que calleron $dado1 y $dado2")
    }
    else{
        println("PERDIO YA QUE CALLO $dado1  y $dado2")
    }

}
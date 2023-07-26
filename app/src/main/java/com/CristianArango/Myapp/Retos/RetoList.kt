package com.CristianArango.Myapp.Retos

class RetoList {
}

fun main() {
    var condicion:String
    val lista= mutableListOf<String>("MAZDA","NISAN")


condicion="yes"
    while (condicion =="yes"){
    print(" Escriba Insertar si desea insertar nuevos autos \n Escriba Mostrar para mostrar todos los autos \n Escriba Buscar para buscar uno en particular\n Escriba Modificar " + "para modificar un carro de la lista \n escriba Eliminar para eliminar un vehiculo Existente:  ")
        var opcionN:String= readLine()!!
        var opcion:String=opcionN.uppercase()

    if(opcion=="INSERTAR"){
        print("Ingrese la Maraca del vehiculo para Registrar")
        var insertar:String= readLine()!!
        var insertarMayu:String=insertar.uppercase()
        var valida = insertarMayu in lista
        if (valida==false){
            lista.add(insertarMayu)
            println("La lista queda asi : $lista")}
        else{
            println("No se puede ingresar la marca del vehicula, \nya que dicho elemnto ya existe en la lista ")}




    }
    else if (opcion=="MOSTRAR"){
        for ((indice,element )in lista.withIndex()) {
            println("$indice es $element  ")}
    }


    else if(opcion=="BUSCAR"){
        print("Que elemento desea buscar ?: ")
        var buscarmayu:String= readLine()!!
        var buscar:String=buscarmayu.uppercase()
        var valida = buscar in lista
        if (valida==false){
            println("El elemnto no se puede buscar, ya que no existe ")}
        else{
            val index = lista.indexOf(buscar)
            println("la marca $buscar esta en la Poscicion $index")}
        }


    
    else if (opcion=="MODIFICAR"){
        print("Ingrese el campo a cambiar ")
        var cambia:Int= readLine()!!.toInt()
        print("Ingrese nombre para cambiar")
        var cambiad:String= readLine()!!
        var cambiamayu:String=cambiad.uppercase()
        lista[cambia]=cambiamayu
    }

    else if (opcion=="ELIMINAR"){
        print("Ingrese el campo a eliminar ")
        var elimina:String= readLine()!!
        var valida = elimina in lista
            if (valida==false){
            println("El elemento no se puede eliminar ya que no existe")}
            else{
                val index = lista.indexOf(elimina)
                lista.removeAt(index)
                println("EL elemento se elimino")

            }




    }
    else{
        print("Lo lamentamos, ingreso la opcion incorrecta, vuelvelo a intentar")
    }

    print("Desea hacer otra acciòn? en caso de que si por favor dijite yes: - ")
    condicion= readLine()!!}

    print("Salimos del bucle")

}
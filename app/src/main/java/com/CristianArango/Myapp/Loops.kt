package com.CristianArango.myapplication

class Loops {
}

fun main() {
/*
    //normal
    for (holi in 1..10)
        print(holi)

    //  down to
    for (i in 5 downTo 1)
        println(i)


    //step
    for (i in 2..10 step 2)
        print(i)


    //tablas
    for(i in 1 .. 10)
        for (j in 1..10)
            println("$i * $j =${i*j}")


    //ejercicio1
    //print("Plz. Enter 6 numbers")
        var cont1E:Int=0
        var cont2O:Int=0
        var sumTE:Int=0
        var sumTO:Int=0
        for (i in 1..6) {
            print("Plz. Enter a number: ")
            var numUsu: Int = readLine()!!.toInt()
            if (numUsu%2==0){
            println("It's even")
            cont1E++
            sumTE+=+numUsu

        }else{
            println("It's odd")
            cont2O++
            sumTO+=+numUsu
            }
        }
        println("La suma total de los numeros pares: $sumTE y la suma total de los numeros impares: $sumTO")
        println("""
            Numeros pares ingresados: $cont1E
            Numeros impares ingresados: $cont2O
        """.trimIndent())

    for(i in 'a'..'z' step 2)
        print(i)*/

    /*
    var opcion:String="yes"
    var cont1E:Int=0
    var cont2O:Int=0
    var sumTE:Int=0
    var sumTO:Int=0
    while(opcion=="yes"){
        print("Plz. Enter a number: ")
        var numUsu: Int = readLine()!!.toInt()
        if (numUsu%2==0){
            println("It's even")
            cont1E++
            sumTE+=+numUsu

        }else{
            println("It's odd")
            cont2O++
            sumTO+=+numUsu
        }
        print("Quiere volver a intentar?")
        opcion= readLine()!!
    }
    println("La suma total de los numeros pares: $sumTE y la suma total de los numeros impares: $sumTO")
    println("""
            Numeros pares ingresados: $cont1E
            Numeros impares ingresados: $cont2O
        """.trimIndent())X
//Daniel
    var opcion:String="yes"
    var cont1E:Int=0
    var cont2O:Int=0
    var sumTE:Int=0
    var sumTO:Int=0
    while(opcion=="yes") {
            print("cuantos num desea ingresar?: ")
            var num: Int = readLine()!!.toInt()
            for (i in 1..num) {
                print("Plz. Enter a number: ")
                    var numUsu: Int = readLine()!!.toInt()
                        if (numUsu % 2 == 0) {
                            println("It's even")
                                cont1E++
                                    sumTE += +numUsu

                        } else {
                             println("It's odd")
                                 cont2O++
                                    sumTO += +numUsu
                        }

            }
                println("La suma total de los numeros pares: $sumTE y la suma total de los numeros impares: $sumTO")
                println(
            """
            Numeros pares ingresados: $cont1E
            Numeros impares ingresados: $cont2O
        """.trimIndent()
        )
        print("Quiere volver a intentar?")
        opcion= readLine()!!
    }print("Quiere volver a intentar?")
        opcion= readLine()!!

     */
    var opcion:String
    var cont1E:Int=0
    var cont2O:Int=0
    var sumTE:Int=0
    var sumTO:Int=0
    do{
        print("Plz. Enter a number: ")
        var numUsu: Int = readLine()!!.toInt()
        if (numUsu%2==0){
            println("It's even")
            cont1E++
            sumTE+=+numUsu

        }else{
            println("It's odd")
            cont2O++
            sumTO+=+numUsu
        }
        print("Quiere volver a intentar?")
        opcion= readLine()!!



    }while (opcion=="yes")
    println("La suma total de los numeros pares: $sumTE y la suma total de los numeros impares: $sumTO")
    println("""
            Numeros pares ingresados: $cont1E
            Numeros impares ingresados: $cont2O
        """.trimIndent())
}
package com.CristianArango.Myapp.Retos

class Nequi {

}

fun main() {
    //declaracion de variables que cambian
    var Seguir=""
    var saldo = 4500
    var contadorSacar: Int = 0
    var contadorrecragar: Int = 0
    var contadorRecragaNovalida: Int = 0
    var contadorenviado: Int = 0
    var intentosRestantes = 3



    println("Hola bienvenido a Nequi, a continuacion nos vamos a registarar por favor siga los pasos:")
    print("Digite su nombre completo \uD83D\uDC49: ")
    val nombre = readLine()!!
    print("Ingrese su numero de celular \uD83D\uDC49: ")
    val numerotelefono: Long = readLine()!!.toLong()
    print("Por favor cree una contraseña de 4 digitos, recuerda no decircela a nadie  \uD83E\uDEE3 : ")
    var contrasenna: Int = readLine()!!.toInt()

    // funcion para sacar plata
    fun saca() {
        println(" Por favor escoja si dese retirar en:\n Punto Fisico \n Cajero")
        var o = readLine()!!
        var opcionDeRetiro = o.uppercase()
        print("Por favor digite su contraseña  \uD83E\uDEE3 : ")
        var contrasennaopcion: Int = readLine()!!.toInt()
        if (contrasennaopcion == contrasenna) {
            if (opcionDeRetiro == "CAJERO") {
                if (saldo < 2000) {
                    println("Lo lamentamos No puede hacer el retiro ya que su saldo debe ser mayor a $2000")
                } else {
                    var codigoSeguridad = (100000..999999).random()
                    println("Perfecto usted retirara en $opcionDeRetiro y su Codigo es $codigoSeguridad, no se lo digas a " + "nadie \uD83E\uDD2B")
                    print("Cunto vas a retirar? ")
                    var retiro: Int = readLine()!!.toInt()
                    if (retiro > saldo) {
                        println("Lo lamentamos no se pudo retirar ya que no tiene dinero suficiente")
                    } else {
                        println("Listo, retiraste con exito")
                        saldo -= retiro
                        contadorSacar++
                        println("Perfecto, su saldo actual es $saldo")

                    }
                }

            } else if (opcionDeRetiro == "PUNTO FISICO") {
                if (saldo < 2000) {
                    println("Lo lamentamos No puede hacer el retiro ya que su saldo debe ser mayor a $2000")
                } else {
                    var codigoSeguridad = (100000..999999).random()
                    println("Perfecto usted retirara en $opcionDeRetiro y su Codigo es $codigoSeguridad, no se lo digas a " + "nadie \uD83E\uDD2B")
                    print("Cunto vas a retirar? ")
                    var retiro: Int = readLine()!!.toInt()
                    if (retiro > saldo) {
                        println("Lo lamentamos no se pudo retirar ya que no tiene dinero suficiente")
                    } else {
                        println("Listo, retiraste con exito")
                        saldo -= retiro
                        println("Perfecto, su saldo actual es $saldo")
                        contadorSacar++
                    }
                }
            } else
                print("Ingreso una opcion incorrecta ")

        } else {
            println("Lo lamentamos no podemos hacer la transaccion ya que su contraseña es incorrecta")
        }
    }

    //Funcion para enviar plata
    fun EnviaPlata() {
        print("Por favor digite el celular a quien va a enviar la plata \uD83D\uDCF1 :-  ")
        var celularEnvia: Long = readLine()!!.toLong()
        print("Por favor digite el valor a enviar \uD83D\uDCB8:- ")
        var valorAEnviar: Int = readLine()!!.toInt()
        print("Por favor digite su contraseña  \uD83E\uDEE3 : ")
        var contrasennaopcion: Int = readLine()!!.toInt()
        if (contrasennaopcion == contrasenna) {
            if (valorAEnviar > saldo) {
                println("Lo lamentamos, no podemos enviar $valorAEnviar pesos al numero $celularEnvia ya que usted solo tiene $saldo pesos \uD83D\uDE1E")

            } else {
                println("Perfecto el resumen del envio es: ")
                saldo -= valorAEnviar
                contadorenviado++
                println("Se envio $valorAEnviar pesos al numero $celularEnvia su saldo actual es $saldo ")
            }

        } else
            println("Lo lamentamos, no se puede hacer la transacción ya que su contraseña es incorrecta")
    }

    //Funcion de recarga
    fun RecargarNequi() {
        print("Por favor digite el numero de nequi al cual va a recargar: - ")
        var celularRecarga: Long = readLine()!!.toLong()
        print("digite el valor a recargar: - ")
        var valorrecraga: Int = readLine()!!.toInt()
        if (celularRecarga == numerotelefono) {
            println("Perfecto se consigno $valorrecraga al numero $celularRecarga ")
            saldo += valorrecraga
            contadorrecragar++
        } else {
            println("Perfecto se consigno $valorrecraga al numero $celularRecarga ")
            println("ADVERTENCIA!! usted recrago a un numero que no era el suyo, (tengalo en cuenta)")
            contadorRecragaNovalida++

        }

    }

    fun VerIndormacion() {
        print("Por favor digite su contraseña validar todos sus datos  \uD83E\uDEE3 : ")
        var contrasennaopcion: Int = readLine()!!.toInt()
        if (contrasennaopcion == contrasenna) {
            println(" Nombre: $nombre \n Numero de celular: $numerotelefono \n Saldo: $saldo \n Veces Enviado: $contadorenviado \n Veces Retirado: $contadorSacar \n Veces recargado a su Celular: $contadorrecragar \n Veces recargadas a otros celulares:$contadorRecragaNovalida")
        } else {
            println("Su contraseña es incorrecta")
        }
    }

    println("Usted ya esta registrado, Desea ingresar a nequi ?en caso de que si escriba -yes-  - ")
    var ingresa = readLine()!!
    if (ingresa == "yes") {
        for (i in 1..3) {
            print("Ingrese su numero de celular:  -")
            var opcioncelular: Long = readLine()!!.toLong()
            print("Ingrese su contraseña ")
            var opcioncontrasena: Int = readLine()!!.toInt()
            if (opcioncelular == numerotelefono && opcioncontrasena == contrasenna) {
                println("acceso Concedido")
                Seguir = "yes"
                break


            } else {
                intentosRestantes--
                if (intentosRestantes > 0) {
                    println("¡Upps! Parece que tus datos de acceso no son correctos.")
                    println("Tienes $intentosRestantes intentos más.")
                } else {
                    println("¡Tres intentos fallidos! Acceso bloqueado.")
                }


            }

        }

    } else
        println("Bueno, Cierre forzado de la aplicacion")

    while (Seguir == "yes") {
        println("Bienvenido a NEQUI")
        println("Por favor escoja la opcion que desee: \n Sacar Plata \n Enviar Plata \n Recarga Plata \n Ver Perfil \n Salir ")
        var deseohacer = readLine()!!
        var hacer = deseohacer.uppercase()
        if (hacer == "SACAR PLATA") {
            saca()
        } else if (hacer == "ENVIAR PLATA") {
            EnviaPlata()
        } else if (hacer == "RECARGAR PLATA") {
            RecargarNequi()
        } else if (hacer == "VER PERFIL") {
            VerIndormacion()
        }else if (hacer=="SALIR"){
        break
        } else {
            println("Digito mal")
        }

        print("Desea Continuar en la aplicación?: - ")
        Seguir = readLine()!!
    }
    println("LA APLICACIÓN SE CERRO")
}

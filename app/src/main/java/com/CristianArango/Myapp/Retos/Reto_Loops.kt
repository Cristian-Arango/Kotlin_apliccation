package com.CristianArango.Myapp.Retos

class Reto_Loops {
}

fun main() {
    print("Holaaaa como estas, Estamos genial, te comentamos en El supermercado noe estamos premiadno gente dependuendo su suerte ")
    var opcion:String="yes"
    var sumatotal:Float=0f
    var paga:Float=0f
    while (opcion=="yes") {
        print("Ingrese el Nombre del producto :")
        var producto: String = readLine()!!
        print("Ingrese el Valor del producto:")
        var valor: Float = readLine()!!.toFloat()
        print("Ingrese La cantidad que desea llevar de $producto:")
        var cantidad: Float = readLine()!!.toFloat()
        print("Desea agregar otro producto yes or no? ")
        opcion = readLine()!!
        var operacion:Float=valor*cantidad
        sumatotal+=operacion
    }
    if(sumatotal>=50.000){
        print("Vamos a mirar su suerte ")
        var bolita:Int=(1..4).random()
            if (bolita==1){
                var bolitaroja:Float=sumatotal/10
                 paga=sumatotal-bolitaroja
                print("cayo la bolita roja, tiene un 10% de descuento su saldo es $paga")
                println("tiene que pagar $paga con cuanto va a pagar ?")
                var saldopagar:Float= readLine()!!.toFloat()

                if (saldopagar>paga){
                    var vueltas:Float=saldopagar-paga
                    println("Sus vueltas son $vueltas Vuelva pronto!!")
                }
                else if(saldopagar==paga)
                    println("Usted pago exacto, Vuelva pronto!!")

                else{
                    var falta:Float=saldopagar-paga
                    println("Le faltan $falta pesos ")
                }

            }else if( bolita==2){
                var  bolitaazul:Float=sumatotal*0.30f
                paga=sumatotal-bolitaazul
                print("cayo la bolita AZUL, tiene un 30% de descuento su saldo es $paga")
                println("tiene que pagar $paga con cuanto va a pagar ?")
                var saldopagar:Float= readLine()!!.toFloat()

                if (saldopagar>paga){
                    var vueltas:Float=saldopagar-paga
                    println("Sus vueltas son $vueltas Vuelva pronto!!")
                }
                else if(saldopagar==paga)
                    println("Usted pago exacto, Vuelva pronto!!")

                else{
                    var falta:Float=saldopagar-paga
                    println("Le faltan $falta pesos ")
                }


            }else if( bolita==3){
                paga=sumatotal/2
                print("cayo la bolita AMARILLA, tiene un 50% de descuento su saldo es $paga")
                println("tiene que pagar $paga con cuanto va a pagar ?")
                var saldopagar:Float= readLine()!!.toFloat()

                if (saldopagar>paga){
                    var vueltas:Float=saldopagar-paga
                    println("Sus vueltas son $vueltas Vuelva pronto!!")
                }
                else if(saldopagar==paga)
                    println("Usted pago exacto, Vuelva pronto!!")

                else{
                    var falta:Float=saldopagar-paga
                    println("Le faltan $falta pesos ")
                }

            }else{
                print("Felicitaciones callo la bolita blanca, SU COMPRA ES GRATIS!!")

            }

        }
    else{
        print("no compro lo suc")
    }

}
package models

import java.util.Date

abstract class CompteBancari {
    var dataObertura: Date = Date()
    var nomCompte: String= ""
    var saldo:Double= 0.0
    var esCompteNou: Boolean = false
    var comissioManteniment: Double = 0.0

    constructor(){
        this.dataObertura = dataObertura
        this. nomCompte = nomCompte
        this.saldo = saldo
        this.esCompteNou = esCompteNou
        this.comissioManteniment = comissioManteniment
    }

    fun getDataObertura():Date{
        return this.dataObertura
    }
    fun setDataObertura(dataObertura:Date){
        this.dataObertura = dataObertura
    }

    fun getNomCompte():String{
        return this.nomCompte
    }
    fun setNomCompte(nomCompte:String){
        this.nomCompte= nomCompte
    }

    fun getSaldo():Double{
        return this.saldo
    }
    fun setSaldo(saldo:Double){
        this.saldo= saldo
    }

    fun siEsCompteNou(esCompteNou:Boolean): Double {
        this.esCompteNou = true
        if (esCompteNou==true){
            saldo - 20.00
        }else return 0.00
    }

    fun ingressar(quantitat: Double):Double{
        var ingres= readln().toDouble()
        println("Indiqui la quantitat a ingressar")
        return saldo + ingres
    }
    fun retirar(quantitat: Double):Double
    fun consultarSaldo():Double
    fun cobrarComissio()
    override fun toString(): String

}
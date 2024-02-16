package models

import java.util.Date

abstract class CompteBancari {
    var dataObertura: Date = Date()
    var nomCompte: String= ""
    var saldo:Double= 0.0

    constructor(dataObertura: Date, nomCompte: String, saldo: Double){
        this.dataObertura = dataObertura
        this. nomCompte = nomCompte
        this.saldo = saldo
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

    fun consultarSaldo():Double{
        return this.saldo
    }
    fun setSaldo(saldo:Double){
        this.saldo= saldo
    }

    fun ingressar(quantitat: Double):Double{
        var ingres= readln().toDouble()
        println("Indiqui la quantitat a ingressar")
        return saldo + ingres
    }

}
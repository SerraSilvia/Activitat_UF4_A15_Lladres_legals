package models

import java.util.*

class CompteCorrent() : CompteBancari {

    override var dataObertura: Date = Date()
    override var nomCompte: String = ""
    override var saldo: Double = 0.0
    override var comissioManteniment: Double= 0.0


    override fun cobrarComissio(){}
    override fun ingressar(quantitat: Double): Double {
        saldo += quantitat
        return saldo
    }

    override fun retirar(quantitat: Double): Double {
        if (quantitat > saldo) {
            throw IllegalArgumentException("No hay suficiente saldo en la cuenta para retirar esa cantidad.")
        }
        saldo -= quantitat
        return saldo
    }

    override fun consultarSaldo(): Double {
        return saldo
    }

    override fun liquidar(): Double {
        val saldoAnterior = saldo
        saldo -= comissioManteniment
        return saldoAnterior - saldo
    }

    override fun toString(): String {
        return "CompteCorrent(nomCompte='$nomCompte', saldo=$saldo)"
    }
}
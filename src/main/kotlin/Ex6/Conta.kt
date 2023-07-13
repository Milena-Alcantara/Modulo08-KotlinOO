package Ex6

open class Conta (var agencia: Int = 0, var conta: Int = 0, var nomeCliente: String = "", var saldo: Double = 0.0 ) {


    open fun sacar(valor: Double){
        saldo -= valor
    }
    open fun depositar(valor: Double, empregado:Boolean){
        saldo += valor
    }
    open fun consultarSaldo(){
        println("${nomeCliente}, seu saldo atualizado é: R$${saldo}")
    }
}
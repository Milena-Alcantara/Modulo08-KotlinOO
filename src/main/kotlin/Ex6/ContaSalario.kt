package Ex6

class ContaSalario (agencia: Int, conta: Int, nomeCliente: String, saldo: Double):Conta(agencia, conta, nomeCliente, saldo){

    override fun sacar(valor: Double) {
        if (valor>saldo){
            println("Saldo insuficiente")
        }else{
            super.sacar(valor)
            consultarSaldo()
        }
    }

    override fun depositar(valor: Double,empregador: Boolean) {
        if (empregador){
            super.depositar(valor,empregador)
            consultarSaldo()
        }else{
            println("Para Conta salário, o depósito poderá ser efetuado somente pelo EMPREGADOR.")
        }
    }

}
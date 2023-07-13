package Ex6

fun main() {
    val contaSalario = ContaSalario(2029,33333,"Milena",1200.00)
    contaSalario.sacar(600.00)
    contaSalario.depositar(600.00,true)

    val contaSalario2 = ContaSalario(9999,666333,"Fernando",1200.00)
    contaSalario2.sacar(200.00)
    contaSalario2.depositar(200.00,false)

    val contaPoupanca = ContaPoupanca(5652,217636123,"Mariana",0.0)
    contaPoupanca.sacar(200.00)
    contaPoupanca.depositar(200.00,false)

    val contaPoupanca2 = ContaPoupanca(7777,22222,"Leonardo",0.0)
    contaPoupanca.sacar(200.0)
    contaPoupanca2.depositar(200.00, true)

    val  contaCorrente = ContaCorrente(1234,555555,"Isabela",50.00)
    contaCorrente.sacar(60.00)
    contaCorrente.depositar(5000.00,true)

    val contaCorrente2 = ContaCorrente(8888,12345,"Marcos", 100.00)
    contaCorrente2.sacar(200.00)
    contaCorrente2.depositar(200.00,true)
}
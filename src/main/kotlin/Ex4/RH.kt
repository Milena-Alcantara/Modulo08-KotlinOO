package Ex4

fun main() {
    val funcionario = Funcionario("Milena Lopes Mesquita Alcântara","T.I.",1200.00,"02/01/2023")
    val funcionario2 = Funcionario("Fernada da Silva e SIlva","Financeiro",3000.00,"15/01/2021")
    val funcionario3 = Funcionario("Guilherme Amaro Monteiro","Marketing",5000.00,"15/01/2021")

    funcionario.exibirFuncionario()
    funcionario2.exibirFuncionario()
    funcionario3.exibirFuncionario()
}
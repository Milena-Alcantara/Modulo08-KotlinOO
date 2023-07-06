package Exercicio1

fun main() {
    val novoFuncionario = Funcionario("Luis","Silva",10,25.50)

    println(novoFuncionario.nomeCompleto())
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)
    novoFuncionario.calcularSalario()

    var funcionarios = ArrayList<Funcionario>()

    funcionarios.add(Funcionario("Milena","Alcântara",24,500.0))
    funcionarios.add(Funcionario("Laura","Xavier",12,350.0))
    funcionarios.add(Funcionario("Amanda","Souza",8,50.0))
    funcionarios.add(Funcionario("Vitória","Cerqueria",4,300.0))
    funcionarios.add(Funcionario("Carolina","Queiroz",12,30.50))
    funcionarios.add(Funcionario("Sibele","Cruz",12,25.0))
    funcionarios.add(Funcionario("Margarida","Lopes",5,35.0))
    funcionarios.add(Funcionario("Zefir","Nere",5,20.0))
    funcionarios.add(Funcionario("Beyonce","Carter",5,1000000.00))

    for (funcionario in funcionarios){
        println("-------------------------------------------------------------------------------------------------")
        println("Nome: ${funcionario.nome +" "+ funcionario.sobrenome} \t Horas trabalhadas: ${funcionario.horasTrabalhadas} \t Valor Horas: R$${funcionario.valorHora}")
    }
}

package Exercicio1

class Funcionario (var nome: String, var sobrenome: String, var horasTrabalhadas: Int, var valorHora: Double) {

    fun nomeCompleto(): String{
        return "$nome $sobrenome"
    }

    fun calcularSalario() {
        val salario = horasTrabalhadas * valorHora
        println("O salário mês do funcionário(a) ${nomeCompleto()} é: R$$salario")
    }

    fun incrementarHoras(horasAmais: Int){
        horasTrabalhadas += horasAmais
    }
}
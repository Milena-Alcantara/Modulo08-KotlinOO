package Ex4

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Funcionario(var nome: String, var setor: String, var salario: Double, var dataAdmisao: String) {
    fun exibirFuncionario(){
        val formartar = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        var data  = LocalDate.parse(dataAdmisao,formartar)

        println("Nome do Funcionário: ${nome} \n Setor: ${setor} \n Salário: R$${salario} \n Data de Admissão: ${data}")
        println("------------------------------------------------------------------------------")
    }
}
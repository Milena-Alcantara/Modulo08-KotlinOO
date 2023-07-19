package Ex4Imposto

import java.util.Objects

class Usuario() {
    private lateinit var nome: String
    private lateinit var profissao: String
    private var salariosAnual = mutableListOf<Double>()
    private var listaDeUsuario = mutableListOf<Usuario>()

    constructor( nome: String, profissao: String, listaDeSalarios:MutableList<Double>): this(){
        this.nome = nome
        this.profissao = profissao
        this.salariosAnual = listaDeSalarios
    }

        fun cadastrarUsuario() {
            println("Informe o Nome do Habitante: ")
            var nome =  readln()
            while (nome.isNullOrBlank()){
                println("Nome não pode ser em Branco, por favor, digite-o novamente: ")
                nome = readln()
            }
            println("Informe a Profissão: ")
            var prof = readln()
            while (prof.isNullOrBlank()){
                println("Profissão não pode ser em Branco, por favor, digite-o novamente: ")
               prof = readln()
            }

            var salarioDeste = mutableListOf<Double>()
            for (i in 1..12){
                println("Informe o salário do mês $i : ")
                var salario = readln().toDoubleOrNull()
                while (salario == null || salario <0){
                    println("Salário não pode ser em Branco ou Valor Negativo, por favor, digite-o novamente: ")
                    salario = readln().toDoubleOrNull()
                }
                salarioDeste.add(salario)
            }
            listaDeUsuario.add(Usuario(nome,prof,salarioDeste))
    }

    fun cacularImposto(){
        for (usuario in listaDeUsuario){
            println("-----------Cáculo de Imposto Por Mês do Usuário ${usuario.nome}----------------")
            for ((indice,valor) in usuario.salariosAnual.withIndex()){
                when{
                    valor in 0.00..2000.00 ->{
                        println("Imposto do mês ${indice+1}: ISENTO")}

                    valor in 2001.00..3000.00 ->{
                        println("Imposto do mês ${indice+1} : R$%.2f".format(valor * 0.08))
                    }
                    valor in 3001.00..4500.00 ->{
                        println("Imposto do mês ${indice+1} : R$%.2f".format(valor * 0.18))
                    }
                    valor > 4500.00 ->{
                        println("Imposto do mês ${indice+1} : R$%.2f".format(valor * 0.28))
                    }
                }

            }
            println()
        }

        }
    fun mostrarInformacoes(){

        for (objeto in listaDeUsuario){
            println("\t Nome: ${objeto.nome}\n\t Profissão: ${objeto.profissao}\n Todos os Salários do Ano: ")
            for ((indice,salario) in objeto.salariosAnual.withIndex()){
                println("Mês: ${indice+1} | Valor Recebido: R$ $salario")
            }
            println()
        }
    }
    }




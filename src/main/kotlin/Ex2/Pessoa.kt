package Ex2

import java.time.LocalDate
import kotlin.system.exitProcess

class Pessoa( idade: Int, diaNasc: Int,  mesNasc: Int,  anoNasc: Int,  nome: String) {
    var idade = idade
        get() {return field}
        set(value) {
            field = value
        }

    var diaNasc = diaNasc
        get() {return field}
        set(value) {
            field = value
        }

    var mesNasc = mesNasc
        get() {return field}
        set(value) {
            field = value
        }
    var anoNasc = anoNasc
        get() {return field}
        set(value) {field = value}

    var nome = nome
        get() {return field}
        set(value) {field = value}

    fun calcularIdade(): Int{
        val dataDeHoje = LocalDate.now()
        idade = dataDeHoje.year - anoNasc
        return idade
    }
    fun informarIdade(): Int{
        return idade
    }
    fun informarNome(): String{
        return nome
    }
    fun ajustarDataDenascimento(dia: Int, mes: Int, ano: Int){
        this.diaNasc = dia
        this.mesNasc = mes
        this.anoNasc = ano

    }
    companion object{
        fun receberDoUsuario(){
            print("Qual o seu nome?: ")
            var nome = readlnOrNull()?: null
            print("Qual seu dia de nascimento?: ")
            var dia = readln().toIntOrNull() ?: null
            print("E o mês?: ")
            var mes = readln().toIntOrNull()
            print("E o ano?: ")
            var ano = readln().toIntOrNull()
            while (dia == null || mes == null || ano == null || nome == null){
                receberDoUsuario()
            }
            val pessoa = Pessoa(0,dia,mes,ano,nome)
            println("Sua idade é: ${pessoa.calcularIdade()}")
            menu()
        }
        fun menu(){
            println("Deseja fazer o cáculo novamente? \n 1- Sim \t 2- Não")
            var opc = readln().toInt()
            when(opc){
                1-> receberDoUsuario()
                2-> exitProcess(0)
                else-> {
                    println("Opção inválida.")
                    menu()
                }


                }
            }
        }
    }


package Ex1

import java.time.LocalDate
import kotlin.system.exitProcess

fun main() {
    val superMercado = Supermercado()
    superMercado.menuSupermercado()
}

class Supermercado {
    private var alimentos = Alimenticios("","", LocalDate.now())
    private var limpezas = Limpeza("","", LocalDate.now())
    private var higine = Higine("","", LocalDate.now())

    fun menuSupermercado(){

        do {
            println("Informe o tipo de produto que deseja cadastrar: \n 1- Alimentício \n 2- Limpeza \n 3- Higiene \n 4- Sair ")
            var opcDesejada = readln().toIntOrNull()

            when(opcDesejada){
                1-> {
                    alimentos.cadastrar() }
                2-> {
                    limpezas.cadastrar() }
                3->{
                    higine.cadastrar() }

                4-> exitProcess(0)
                else->{
                    println("Opção inválida")
                }
            }
        }while (opcDesejada != 4)

    }

}
package Ex3
import kotlin.system.exitProcess
fun main() {

menu()
}

fun menu(){
    val conversor = Conversor()
    var continuar = true
    do {
        try {
            println("---- Boas vindas ao conversor de moedas ----")
            println("Deseja converter qual moeda: \n1-Dólar americano | 2-Dólar canadense | 3-Euro | 4-Libra Esterlina | 5-Sair")
            val opcao = readln().toInt()
            when(opcao){
                1 -> {conversor.converterParaDolar()}
                2 -> {conversor.converterDolarCanadense()}
                3 -> {conversor.converterParaEuro()}
                4 -> {conversor.converterParaLibra()}
                5 -> {
                    println("Obrigado(a) por utilizar nosso conversor!")
                    System.exit(0)
                }
                else -> { throw IllegalArgumentException("Tipo de moeda inválido") }
            }
        }catch (exception:IllegalArgumentException){
            exception.printStackTrace()
            println("Causa: ${exception.cause}")
            println("Mensagem: ${exception.message}")
            continuar=false
            println()
            menu()
        }finally {
            println("Deseja fazer uma nova conversão? \n 1- Sim \n 2- Não")
            when (readln().toInt()) {
                1 -> menu()
                2 -> {
                    println("Programa encerrado")
                }
                else -> {
                    println("Inválido")
                }
            }
        }
    }while (!continuar)
}
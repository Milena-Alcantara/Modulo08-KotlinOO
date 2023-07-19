package Ex2

import kotlin.system.exitProcess

private val verdura = Verdura("",0.0)
private val graos = Graos("",0.0)
private val legume = Legumes("",0)
private val outro = Outros("",0)

fun main(){
    menu()
}

fun menu(){
    try {
        println("\nVocê deseja comprar qual tipo de alimento:\n1-Verdura | 2-Legumes | 3-Grãos | 4-Outros | 5-Sair")
        val opcao= readln().toInt()
        when(opcao){
            1 -> { verdura.cadastrar()}
            2 -> { legume.cadastrar()}
            3 -> { graos.cadastrar()}
            4 -> { outro.cadastrar()}
            5 -> {
                println("Obrigado(a) por comprar conosco!")
                System.exit(0) }
            else -> {throw IllegalArgumentException("Tipo de alimento inválido")}
        }
    }catch (exception: java.lang.IllegalArgumentException){
        exception.printStackTrace()
        println("Causa: ${exception.cause}")
        println("Mensagem: ${exception.message}")
        main()
    }
    finally {
        println("\nDeseja continuar comprando?\n1-Sim | 2-Não")
        when(readln().toInt()){
            1 -> {
                menu()
                println() }
            2 -> { verdura.mostrarValores()
                println()
                legume.mostrarValores()
                println()
                graos.mostrarValores()
                println()
                outro.mostrarValores()
                exitProcess(0)
            }
            else -> { println("Opção inválida!")
                exitProcess(0) }
        }
    }
}

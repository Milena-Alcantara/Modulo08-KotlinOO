package Ex4Imposto

import kotlin.system.exitProcess

private val userInical = Usuario()
fun main() {
    menuPrincipal()

}
fun menuPrincipal(){
    println("BEM VINDO!")

    do {
        println("Você deseja:\n\t| 1-Se cadastrar\n\t| 2-Ver habitantes\n\t| 3- Ver calculo de imposto\n\t| 4-Sair")
        var opcao = readln().toIntOrNull() ?: 0
        when(opcao){
            1 -> { userInical.cadastrarUsuario()}
            2 -> { userInical.mostrarInformacoes()}
            3 -> { userInical.cacularImposto()}
            4 -> { exitProcess(0)
            }
            else -> {
                println("Opção inválida")
            }
        }
    }while (opcao!=4 )
}
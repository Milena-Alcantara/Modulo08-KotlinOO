package Ex2

fun main() {
    menuPrincipal()
}
private val romance = Romance("","")
private val suspense = Suspense("","")
private val filosofia = Filosofia("","")
private var continuar=true

fun menuPrincipal(){
    do {
        println("Informe a opção desejada:\n1-Cadastrar livro \t 2-Ver livros \t 3-Sair")
        val escolha = readln().toIntOrNull()
        when(escolha){
            1 -> menuEscolha()
            2 -> menuExibir()
            3 -> System.exit(0)
            else -> {
                continuar=false
                println("Opção inválida!")
            }
        }
    }while (!continuar)
}

fun menuEscolha(){
    do {
        println("Qual gênero você deseja?:\n1-Romance \t 2-Suspense \t 3- Filosofia \t 4-Voltar")
        val escolha = readln().toIntOrNull()
        when(escolha){
            1 -> {
                romance.cadastrar()
                menuEscolha()}
            2 -> {
                suspense.cadastrar()
                menuEscolha()}
            3 -> {
                filosofia.cadastrar()
                menuEscolha()}
            4 -> menuPrincipal()
            else -> {
                continuar=false
                println("Opção inválida!")
            }
        }
    }while (!continuar)
}

fun menuExibir(){
    do {
        println("Qual gênero você deseja?:\n1-Romance \t 2-Suspense \t 3- Filosofia \t 4-Voltar")
        val escolha = readln().toIntOrNull()
        when(escolha){
            1 -> {
                romance.exibir()
                menuExibir()}
            2 -> {
                suspense.exibir()
                menuExibir()}
            3 -> {
                filosofia.exibir()
                menuExibir()}
            4 -> menuPrincipal()
            else -> {
                continuar=false
                println("Opção inválida!")
            }
        }
    }while (!continuar)
}
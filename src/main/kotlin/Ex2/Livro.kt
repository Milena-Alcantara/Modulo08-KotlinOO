package Ex2

open class Livro(var nome: String, var autor: String) {
    open fun cadastrar(){
        print("Digite o nome do livro: ")
        nome = readln()
        print("Digite o autor do livro: ")
        autor = readln()
    }
    open fun exibir(){
        println("------------------------LIVROS------------------------")
    }
}
class Romance(nome: String, autor: String):Livro(nome,autor){
    var livrosRomance = ArrayList<Romance>()

    override fun cadastrar() {
        super.cadastrar()
        livrosRomance.add(Romance(nome, autor))
    }

    override fun exibir() {
        super.exibir()
        for (i in livrosRomance){
            println("Título: ${i.nome} \t ${i.autor}")
        }
    }
}

class Suspense(nome: String,  autor: String): Livro(nome, autor){
    var livrosSuspense = ArrayList<Suspense>()

    override fun cadastrar() {
        super.cadastrar()
        livrosSuspense.add(Suspense(nome, autor))
    }
    override fun exibir() {
        super.exibir()
        for (i in livrosSuspense){
            println("Título: ${i.nome} \t ${i.autor}")
        }
    }
}

class Filosofia(nome: String,  autor: String): Livro(nome, autor){
    var livrosFilosofia = ArrayList<Suspense>()

    override fun cadastrar() {
        super.cadastrar()
        livrosFilosofia.add(Suspense(nome, autor))
    }
    override fun exibir() {
        super.exibir()
        for (i in livrosFilosofia){
            println("Título: ${i.nome} \t ${i.autor}")
        }
    }

}
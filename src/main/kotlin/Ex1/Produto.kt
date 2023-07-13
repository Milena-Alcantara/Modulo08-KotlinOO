package Ex1

import kotlin.time.Duration.Companion.minutes

abstract class Produto(var nome: String, var preco: Double, var codBarras: Int) {
    var vetorProdutos = ArrayList<Any>()
  abstract fun mostrarDetalhes()
    open fun adicionarObjetoEMVetor(objeto: Any){
       vetorProdutos.add(objeto)
        for (i in vetorProdutos){
            mostrarDetalhes()
            println("-----------------------------------------------------------------")
        }
    }


}

class Livros(nome: String = "",preco: Double,codBarras: Int, var autor: String): Produto(nome, preco, codBarras){

    override fun mostrarDetalhes() {
//   Ao chamar a variável, já estamos utilizando os get() ímplicitos para ter acesso aos valores
        println("Título: ${nome}\n Preço: ${preco}\n Cód De Barras: ${codBarras}\n Autor: ${autor}")
    }

}

class Cd(nome: String,preco: Double,codBarras: Int,var numFaixas: Int): Produto(nome, preco, codBarras){
    override fun mostrarDetalhes() {
        println("Título: ${nome}\n Preço: ${preco}\n Cód De Barras: ${codBarras}\n Número de Faixas: ${numFaixas}")
    }
}
class Dvd(nome: String,preco: Double,codBarras: Int, var duracao: Int): Produto(nome, preco, codBarras){
    override fun mostrarDetalhes() {
        var duracaoHoras = duracao.minutes
        println("Título: ${nome}\n Preço: ${preco}\n Cód De Barras: ${codBarras}\n Duração: ${duracaoHoras}")
    }
}
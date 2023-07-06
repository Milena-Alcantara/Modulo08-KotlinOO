package Exercicio2

class Livros(var titulo: String, var qtPaginas: Int, var pagLidas: Int){

    fun verificarProgresso(){
        val porcentagem = (pagLidas * 100)/qtPaginas
        println("Você já leu $porcentagem% do livro.")
    }
}
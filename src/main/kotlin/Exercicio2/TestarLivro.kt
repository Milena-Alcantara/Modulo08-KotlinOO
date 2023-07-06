package Exercicio2

fun main() {
 val livroFavorito = Livros("O pequeno príncipe",98,20)
    println("O livro '${livroFavorito.titulo}' possui ${livroFavorito.qtPaginas} páginas.")

    livroFavorito.verificarProgresso()
    livroFavorito.pagLidas = 50
    livroFavorito.verificarProgresso()

    var livros = ArrayList<Livros>()
    livros.add(Livros("É assim que acaba",368,0))
    livros.add(Livros("É assim que começa",336,0))
    livros.add(Livros("Onde estão as flores",256,0))
    livros.add(Livros("Tudo é rio",210,0))
    livros.add(Livros("O silêncio dos inocentes",360,0))
    livros.add(Livros("Rita Lee - outra autobiografia",192,0))
    livros.add(Livros("Verity",320,0))
    livros.add(Livros("Torto arado",264,0))
    livros.add(Livros("Mais esperto que o diabo",200,0))
    livros.add(Livros("Especialista em pessoas",224,0))

    for (livro in livros){
        println()
        livro.verificarProgresso()
        println("O livro '${livro.titulo}' possui ${livro.qtPaginas} páginas.")
        livro.pagLidas = 50
        livro.verificarProgresso()
    }
}
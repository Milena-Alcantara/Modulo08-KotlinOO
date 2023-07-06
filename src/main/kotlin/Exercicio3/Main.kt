package Exercicio3

fun main() {
    val filme1 = Filme("Os Vingadores",142)
    filme1.exibirDuracaoEmHoras()

    val filme2 = Filme("Hotel Transilvânia", 93)
    filme2.exibirDuracaoEmHoras()

    println("Os filmes em cartaz são '${filme1.titulo}' e '${filme2.titulo}'")
    println()

    var filmes = ArrayList<Filme>()

    filmes.add(Filme("Homem Aranha: Através do AranhaVerso", 100))
    filmes.add(Filme("A Baleia",117))
    filmes.add(Filme("John Wick 4 ",169))
    filmes.add(Filme("Tudo em Todo Lugar ao Mesmo Tempo",139))
    filmes.add(Filme("Us",121))

    for (filme in filmes){
        filme.exibirDuracaoEmHoras()
        println()
    }

    println("Visualize os filmes em cartaz:")
    for (filme in filmes){
        println("'${filme.titulo}' ")
    }

}
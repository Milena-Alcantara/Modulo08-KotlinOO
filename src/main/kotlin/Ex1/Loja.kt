package Ex1

fun main() {
    println("-----------------Lista de Produtos da nossa Loja-----------------------------")
    val livro = Livros("O Silêncio dos Inocentes",50.00,234,"Tomas Harris")
    livro.adicionarObjetoEMVetor(livro)

    val cd = Cd("Só pra contrariar",25.00,123,10)
    cd.adicionarObjetoEMVetor(cd)

    val dvd = Dvd("Motoqueiro Fantasma 2",10.00,333,96)
    dvd.adicionarObjetoEMVetor(dvd)

    val livro2 = Livros("O diário de um Banana",25.00,444,"Jeff Kinney")
    livro2.adicionarObjetoEMVetor(livro2)

    val dvd2 = Dvd("Alexandre Pires, 25 anos",5.00,555,96)
    dvd2.adicionarObjetoEMVetor(dvd2)

    val livroTres = Livros("aaaaaa",0.0,444,"bbbbbb")

    println(livro2.codBarras.equals(livroTres.codBarras))
    println("-------------------------------------------------------------")

    val vetor = arrayOf(livro, cd, dvd, livro2, dvd2, livroTres)
    buscarProduto(cd,vetor)

}
fun buscarProduto(objeto: Produto,vetor: Array<Produto>){
    for (i in 0 until vetor.size){
        if (vetor.get(i).equals(objeto)){
            println("Posição: ${i}")
            println("Produto encontrado:")
            objeto.mostrarDetalhes()
            return
        }
    }
    println("Produto não encontrado.")
}
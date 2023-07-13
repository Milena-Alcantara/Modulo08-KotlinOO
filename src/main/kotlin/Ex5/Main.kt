package Ex5

fun main() {
    val dog1 = Cachorro("Belinha","Puddle","Margarida")
    dog1.movimentar()
    dog1.comer()
    dog1.domir()
    dog1.exibirDetalhes()

    val dog2 = Cachorro("Leão","Vira-lata","Silvio")
    dog2.movimentar()
    dog2.comer()
    dog2.domir()
    dog2.exibirDetalhes()

    val gato1 = Gato("Mel","Siamez","Milena")
    gato1.movimentar()
    gato1.comer()
    gato1.domir()
    gato1.exibirDetalhes()

    val gato2 = Gato("Catrina","Frajola","Milena")
    gato2.movimentar()
    gato2.comer()
    gato2.domir()
    gato2.exibirDetalhes()

    val peixe1 = Peixe("Otávio","Baiacu","Zefir")
    peixe1.movimentar()
    peixe1.comer()
    peixe1.domir()
    peixe1.exibirDetalhes()

    val peixe2 = Peixe("Linguadin","Linguado","Ariel")
    peixe2.movimentar()
    peixe2.comer()
    peixe2.domir()
    peixe2.exibirDetalhes()

}

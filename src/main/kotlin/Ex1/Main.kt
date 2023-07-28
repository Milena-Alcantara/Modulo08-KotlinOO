package Ex1
fun main() {
    var carrinho = mutableListOf<Frutas>()
    val compra = Compra()

    // Etapa 1
//    carrinho.add(Laranja("Laranja",0.25))
//    carrinho.add(Maca("Maçã",0.60))
//    carrinho.add(Maca("Maçã",0.60))
//    carrinho.add(Maca("Maçã",0.60))
//
//
//    // ETAPA 2
//    compra.calcularValorTotal(compra.comprarComOfertas(2,carrinho))
//    println("TOTAL: R$%.2f".format(compra.calcularValorTotal(carrinho)))
//
//
//    // Etapa 3
//    compra.notificarCliente(carrinho)


    // Etapa 4

    println("FRUTAS DISPONÍVEIS: \n Maça: 4\tLaranja: 4")
    println("Informe 1 para Maçã ou 2 para Laraja, e a quantidade desejada: ")
    compra.comprarPeloEstoque(1, 5, carrinho)
    println("TOTAL: R$%.2f".format(compra.calcularValorTotal(carrinho)))

}

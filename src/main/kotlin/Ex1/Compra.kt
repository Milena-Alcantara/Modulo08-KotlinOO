package Ex1

import java.lang.IllegalArgumentException

class Compra {

    fun calcularValorTotal(lista: MutableList<Frutas>): Double{
        var valorTotal = 0.0
        if (lista.isNotEmpty()){
            for (fruta in lista){
                valorTotal += fruta.preco
            }
        }else{
            throw IllegalArgumentException("Impossível calcular o carrinho pois não há produtos.")
        }
        return valorTotal
    }
    // Etapa2

    fun comprarComOfertas(opc: Int, carrinho:MutableList<Frutas>): MutableList<Frutas>{
        when(opc){
            1-> {
                carrinho.add(Maca("Maçã",0.60))
                carrinho.add(Maca("Maçã",0.0))

            }
            2->{
                carrinho.add(Laranja("Laranja", 0.25))
                carrinho.add(Laranja("Laranja", 0.25))
                carrinho.add(Laranja("Laranja", 0.0))
            }
            else->{
                throw IllegalArgumentException()
            }
        }
        println("-------Segue a Lista do seu Pedido:------- ")
        for (i in carrinho){
            println("${i.nome} | R$ ${i.preco}")
        }
        return carrinho
    }

    // Etapa 3

    fun notificarCliente(carrinho: MutableList<Frutas>): Boolean{
        if (carrinho.isNotEmpty()){
            println("Status: Em Preparo.")
            Thread.sleep(3000)
            println("Status: Saiu para entrega  \nTempo estimado: 30 min")
            Thread.sleep(5000)
            println("Status: Seu pedido foi entregue! Avalie-nos na plataforma dos Correios ")
            Thread.sleep(3000)
            return true
        }else{
            println("Não Há produtos no carrinho para serem entregues")
            return false
        }
    }

    fun comprarPeloEstoque(decisao: Int, qtd: Int, carrinho: MutableList<Frutas>): Boolean {
        if (decisao == 1) {
            when {
                qtd in 1..4 -> {
                    println("Compra Realizada, segue o seu pedido: ")
                    for (i in 1..qtd) {
                        carrinho.add(Maca("Maçã", 0.60))
                    }
                    for (i in carrinho){
                        println("FRUTA: ${i.nome}      PREÇO: ${i.preco}")
                    }
                    return true
                }

                else -> {
                    println("O pedido falhou!\nMotivo: quantidade maior que o estoque")
                    return false
                }
            }
        } else if (decisao == 2) {
            when {
                qtd in 1..4 -> {
                    println("Compra efetuada com sucesso :)")
                    for (i in 1..qtd) {
                        carrinho.add(Laranja("Laranja", 0.25))
                    }
                    for (i in carrinho){
                        println("FRUTA: ${i.nome}      PREÇO: ${i.preco}")
                    }
                    return true
                }

                else -> {
                    println("O pedido falhou!\nMotivo: quantidade maior que o estoque")
                    return false
                }
            }

        } else {
            throw IllegalArgumentException("Opção inválida")
        }
}}


package Ex1

import kotlin.system.exitProcess

class Caixa {
  private var produtos = ArrayList<Produto>()
   private var total = 0.0

    private fun estocarProdutos(): ArrayList<Produto>{
        produtos.add(Produto("Arroz",20.00,10))
        produtos.add(Produto("Feijão",10.00,10))
        produtos.add(Produto("Açucar",5.00,10))
        produtos.add(Produto("Café",15.00,10))
        return produtos
    }
    fun menu(){
        estocarProdutos()
        println("Digite a opção desejada: \n 1- Acessar como funcionário \t 2- Acessar como cliente ")
        var opc = readln().toIntOrNull()
        while (opc == null){
            print("Opção inválida, digite novamente: ")
            opc = readln().toIntOrNull()
        }

        when (opc){
            1-> {
                println("Você pode: \n 1- Cadastrar novo produto \t 2 - Visualizar Produtos")
                opc = readln().toIntOrNull() ?: 0
                while (opc == 0 || !(opc == 1 || opc == 2)){
                    print("Opção inválida, digite novamente: ")
                    opc = readln().toIntOrNull()
                }
                when(opc){
                    1-> cadastrarNovoProduto()
                    2-> mostrarProdutos()
                    else -> exitProcess(0)
                }
            }
            2 -> {
                println("Você pode \n 1- Realizar compra \t 2- Sair")
                opc = readln().toIntOrNull() ?: 0
                while (opc == 0 || !(opc == 1 || opc == 2)){
                    print("Opção inválida, digite novamente: ")
                    opc = readln().toIntOrNull()
                }
                when(opc){
                    1-> comprar()
                    2-> exitProcess(0)
                    else->{
                         exitProcess(0)
                    }
                }
            }
        }
    }

    fun cadastrarNovoProduto(){
        println("Informe o nome do produto:  ")
        var nome = readln()
        println("Informe o preço do produto:  ")
        var preco = readln().toDoubleOrNull() ?: 0.0
        println("Informe a quantidade do produto:  ")
        var qt = readln().toIntOrNull() ?: 0

        produtos.add(Produto(nome,preco,qt))

    }

    fun mostrarProdutos(){
        println("-----------------------Segue a Lista de produtos:-----------------------------")
        for (i in produtos){
            println("Produto: ${i.nome}\nPreço: R$${i.preco}\nQuantidade: ${i.qtProduto}")
            println()
        }
    }
    fun comprar(){
       mostrarProdutos()
        var listaDeCompras = ArrayList<Produto>()
        print("Informe o nome do produto desejado: ")
        var nome =  readln()
        while (nome.isNullOrBlank()){
            println("Digite um nome")
            nome = readln()
        }
        for (i in produtos){
            if (i.nome.equals(nome,ignoreCase = true)){
                println("Informe a quantidade desejada: ")
                var quant = readln().toInt()
                if (quant<= i.qtProduto){
                  total += i.preco * quant
                    i.qtProduto -= quant
                    listaDeCompras.add(Produto(i.nome,i.preco,quant))
                    println("O total da sua compra ficou em: ${total}")
                    return
                }else{
                    println("Valor informado maior do que a quantidade que temos em estoque.")
                }
            }else{
                println("Produto não encontrado")
            }
        }
    }

}
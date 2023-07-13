package Ex5

open class Animal(var nome: String, var raca:String, var dono:String) {

    open fun movimentar(){}
    open fun comer(){}
    open fun domir(){}

    open fun exibirDetalhes(){
        println("Nome: ${nome} \t Raça: ${raca} \t Responsável: ${dono}")
    }

}
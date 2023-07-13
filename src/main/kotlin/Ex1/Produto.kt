package Ex1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

open class Produto(var nomeProduto: String, var cod: String, var dataValidade: LocalDate) {

 open fun cadastrar(){
     print("Informe o nome: ")
     nomeProduto = readln()
     print("Informe o código: ")
     cod = readln()
     print("Informe a data de validade: ")
     var data = readln()
     val formartar = DateTimeFormatter.ofPattern("dd/MM/yyyy")
     dataValidade = LocalDate.parse(data,formartar)
 }
  open fun exibir(){
      println("------------------Lista---------------------------")
  }
}
class Alimenticios(nomeProduto: String, cod: String, dataValidade: LocalDate): Produto(nomeProduto,cod, dataValidade){
    var alimenticios = ArrayList<Alimenticios>()

    override fun cadastrar() {
        super.cadastrar()
        alimenticios.add(Alimenticios(nomeProduto, cod, dataValidade))
        exibir()
    }

    override fun exibir() {
        super.exibir()
        for (i in alimenticios){
            println("Produto: ${i.nomeProduto} \t Código: ${i.cod} \t Validade: ${i.dataValidade}")
        }
    }
}
class Limpeza(nomeProduto: String, cod: String, dataValidade: LocalDate): Produto(nomeProduto,cod, dataValidade){
    var limpeza = ArrayList<Limpeza>()

    override fun cadastrar() {
        super.cadastrar()
        limpeza.add(Limpeza(nomeProduto, cod, dataValidade))
        exibir()
    }
    override fun exibir() {
        super.exibir()
        for (i in limpeza){
            println("Produto: ${i.nomeProduto} \t Código: ${i.cod} \t Validade: ${i.dataValidade}")
        }
    }

}
class Higine(nomeProduto: String, cod: String, dataValidade: LocalDate): Produto(nomeProduto,cod, dataValidade){
    var higiene = ArrayList<Higine>()

    override fun cadastrar() {
        super.cadastrar()
        higiene.add(Higine(nomeProduto, cod, dataValidade))
        exibir()
    }
    override fun exibir() {
        super.exibir()
        for (i in higiene){
            println("Produto: ${i.nomeProduto} \t Código: ${i.cod} \t Validade: ${i.dataValidade}")
        }
    }
}
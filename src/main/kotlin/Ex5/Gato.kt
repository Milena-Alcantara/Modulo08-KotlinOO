package Ex5

class Gato (nome: String,  raca:String,  dono:String) : Animal(nome, raca, dono) {

    override fun movimentar() {
        println("Andando e saltando em 4 patas")
    }

    override fun comer() {
        println("Comendo Whiskas Sachê")
    }

    override fun domir() {
        println("Dormindo na caixa")
    }


}
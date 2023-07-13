package Ex5


class Cachorro(nome: String,  raca:String,  dono:String) : Animal(nome, raca, dono) {

    override fun movimentar() {
        println("Estou andando em 4 patas")
    }
    override fun comer() {
        println("Comendo bife")
    }

    override fun domir() {
        println("Estou dormindo na cama da Jéssica")
    }

}
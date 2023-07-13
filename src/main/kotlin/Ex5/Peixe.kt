package Ex5

class Peixe (nome: String,  raca:String,  dono:String) : Animal(nome, raca, dono) {
    override fun movimentar() {
        println("Nadando")
    }

    override fun comer() {
        println("Comendo ração molhada")
    }

    override fun domir() {
        println("Dormindo de olho aberto")
    }

}
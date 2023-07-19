package Ex6SaveTheRoupa

abstract class Peca(var marca: String, var modelo: String) {
   abstract fun retirada()
}
class SaveTR(marca: String ="",modelo: String=""): Peca(marca, modelo){
    override fun retirada() {
    }

}
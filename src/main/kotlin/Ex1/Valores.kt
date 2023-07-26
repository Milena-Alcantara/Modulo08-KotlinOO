package Ex1

class Valores {

    fun retornarMaisBarato(vetorValores: Array<Double>): Double{
        val menorPreco = vetorValores.min()
        return menorPreco
    }
}
package Exercicio3

import kotlin.time.Duration.Companion.minutes

class Filme(var titulo: String, var duracao: Int) {
    fun exibirDuracaoEmHoras(){
      val duracaoHoras = duracao.minutes
        println("O filme '$titulo' tem duração de $duracaoHoras")
    }
}
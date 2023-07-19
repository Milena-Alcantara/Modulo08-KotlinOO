package Ex1

fun main() {
    val calculadora = CalculoMatematico()
    do {
        println("Digite um número inteiro:")
        val dividendo = readln().toInt()
        println("Digite outro número inteiro:")
        val divisor = readln().toInt()
        val resultado = calculadora.divisao(dividendo,divisor)

        if (resultado==0){
            println()
        }
        else{
            println("Resultado: $resultado")
        }
    }while (resultado==0)

}
package Ex2Conjunto

fun main() {
  var conjuntoDeNumeros = mutableSetOf<Int>()

  conjuntoDeNumeros.addAll(listOf(1,5,5,6,7,8,8,8))
    println(conjuntoDeNumeros)

 /*
  A diferença é que ao utilizar um conjunto set, ele não permite repetições e a ordem dos valores é definida por um
 cálculo matemático que chamamos de Hash, ou seja, não é ordenada e/ou indexada.
  */
}

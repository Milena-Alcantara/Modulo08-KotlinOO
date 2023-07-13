package Ex2

fun main() {
    var formas = ArrayList<Forma>(5)

    val retangulo = Retangulo(2.5f,5.0f)
    val  circulo = Circulo(50f)
    val quadrado = Quadrado(6.5f, 6.5f)

    formas.add(retangulo)
    formas.add(circulo)
    formas.add(quadrado)

    for (i in formas){
        println("A área é: ${i.calcularArea()}\n E o perimetro: ${i.calcularPerimetro()}")
        println("------------------------------------------------------------")
    }
}

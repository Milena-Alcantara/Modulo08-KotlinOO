package Ex6SaveTheRoupa
val guardaVolumes = GuardaVolumes()
fun main() {

   pedirALista()
  pedirALista()
    guardaVolumes.mostarValor()
    pedirIdParaDevolver()
    guardaVolumes.mostarValor()
}
fun pedirALista(){
    println("Informe a quantidade de peças: ")
    val qtPecas =  readln().toInt()

    var listaDePecas = ArrayList<SaveTR>()
    for (i in 1..qtPecas){
        println("Informe a marca:")
        var marca = readln()
        println("Informe o modelo: ")
        var modelo = readln()

        listaDePecas.add(SaveTR(marca, modelo))
    }
    println("Seu ID para o guarda volumes é: ${guardaVolumes.guardarPecas(listaDePecas)}")
}

fun pedirIdParaGuardar(){
    println("Digite seu identificador:")
    val identificador = readln().toInt()
    guardaVolumes.pesquisarPorId(identificador)
}
fun pedirIdParaDevolver(){
    println("Digite seu identificador:")
    val identificador = readln().toInt()
    guardaVolumes.removerGuardaVolumes(identificador)
}

fun menu(){
    println("")
}



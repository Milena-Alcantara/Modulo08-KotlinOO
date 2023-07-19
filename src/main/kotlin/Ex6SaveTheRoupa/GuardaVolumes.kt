package Ex6SaveTheRoupa

class GuardaVolumes {
    var contador: Int = 0
    var dicionario = mutableMapOf<Int, ArrayList<SaveTR>>()

    fun guardarPecas(listaDePeca: ArrayList<SaveTR>): Int{
        contador++
        dicionario[contador] = listaDePeca
        return contador
    }

    fun mostarValor(){
        for ((key, value) in dicionario){
            println("Id: $key")
            for (valor in value){
                println("Marca: ${valor.marca} & Modelo: ${valor.modelo} ")
            }
        }
    }

    fun pesquisarPorId(id: Int){
        for (key in dicionario.keys){
            if (key.equals(id)){
                println("Para a ID: $id Encontrei: ")
                for (peca in  dicionario.getValue(id)){
                    println("Marca: ${peca.marca} & Modelo: ${peca.modelo} ")
                }
                return
            }
        }
        println("Infelizmente não encontrei.")
    }

    fun removerGuardaVolumes(id: Int ){
        if (dicionario.containsKey(id)){
            dicionario.remove(id)
            println("Sua peça foi devolvida")
        }
        else{
            println("Identificador inválido!")
        }

    }

}


package Ex3Dicionario

class Dicionario {
    private var dicionario = mutableListOf<String>()
    private var dicionarioComSignificado = mutableMapOf<String,String>()


     fun adicionarTermos(termo: String): MutableList<String>{
         dicionario.add(termo)
         return dicionario
     }

    fun adcionarComSignificado(termo: String, significado: String){
        dicionarioComSignificado[termo] = significado
    }

    fun retornarValor(termoChave: String){
        println("Segundo o dicionário, o significado do termo é: ${dicionarioComSignificado.getValue(termoChave)}")
    }

    fun procurarTermo(termo2: String){
      for (termo in dicionario){
          if (termo.equals(termo2, ignoreCase = true)) {
              println("A palavra $termo contém na nosso dicionário.")
              return
          }
}
        println("Não Encontrado")
    }

    fun listarDicionario(){
        for (termo in dicionario.sorted()){
            println(termo)
        }
    }
}
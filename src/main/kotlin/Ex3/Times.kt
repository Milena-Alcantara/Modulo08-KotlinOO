package Ex3

class Times (var nome:String, var qtJogadores: Int, var vitortias: Int, var esporte: String){
    fun exibir(){
        println("Time: ${nome} \n Número de Jogadores: ${qtJogadores} \n Vitórias até o momento: ${vitortias}" +
                "\n Esporte: ${esporte}")
    }
}
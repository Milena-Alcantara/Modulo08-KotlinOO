package Ex3

import kotlin.system.exitProcess

class ProgramaDeNotas {
    private var notasSemestrais = arrayOf<Int>()
    private lateinit var nomeAluno: String


   internal fun solicitarNotas(){
       print("Informe o nome do Aluno: ")
       nomeAluno = readln()
       if (nomeAluno.isNullOrBlank()){
           nomeAluno = " [nome não informado] "
       }
       var nota: Double?
       for (i in 1..4){

           println("Informe a ${i}º nota: ")
           nota = readln().toDoubleOrNull()
           while (nota == null || !(nota >=0 && nota <=10)) {
               println("Nota inválida, digite novamente")
               nota = readln().toDoubleOrNull()
           }
            notasSemestrais = notasSemestrais.plus(nota.toInt())
       }
      calcularMedia(notasSemestrais)
    }

    internal fun calcularMedia(arrayNotas: Array<Int>){
        println("A média semestral do Aluno ${nomeAluno} é: ${arrayNotas.sum()/4} ")
        menu()
    }

    private fun menu(){
        println("Deseja realizar um novo cálculo? \n 1- Sim \t 2 - Não")
        val decisao = readln().toInt()

        when(decisao){
            1-> {
                notasSemestrais = arrayOf()
                solicitarNotas()
            }
            2-> {
                exitProcess(0)
            }
            else ->{
                menu()
            }
        }
    }
}
package Ex5TurmaDeAlunos

import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class Aluno(var matricula: Int = 0, var nome: String ="", var sobrenome: String ="", var dataNascimento: LocalDate = LocalDate.now(), var sexo: String = "")

class Turma(){
    var alunos = arrayListOf<Aluno>()


    fun cadastrarAluno(): List<Aluno>{
        val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val aluno1 = Aluno()

        println("Informe a matrícula do Aluno: ")
        var matricula = readln().toInt()
        while (verificar(matricula)){
            println("Essa matricula já exites no nosso banco de dados, tente novamente: ")
            matricula = readln().toInt()
        }

        println("Qual o primero nome do Aluno: ")
        var nome = readln()
        println("E o sobrenome: ")
        var sobrenome = readln()
        println(" A data de nascimento:  ")
        var data  =  readln()

        var dataDeNascimento = LocalDate.parse(data,formato)

        println("Qual o sexo?: ")
        var sexo = readln()

        var alunoX = Aluno(matricula,nome,sobrenome,dataDeNascimento,sexo)
        alunos.add(alunoX)
        return alunos
    }

    fun verificar(matricula: Int): Boolean{
        for (aluno in alunos){
            if (aluno.matricula.equals(matricula)){
                return true
            }
        }
        return false
    }
    fun mostrarAlunos(){
        var numero = 1
        println("------Alunos------")
        for (aluno  in alunos){
            println("${numero}º aluno: ${aluno.nome}")
            numero++
        }
    }

    fun mostrarAlunosPeloSobrenome(){
        var numero = 1
        println("------Alunos-------")
        for (aluno  in alunos){
            println("${numero}º aluno: ${aluno.nome + aluno.sobrenome}")
            numero++
        }

    }
    fun mostrarUmAlunoMaisVelhor(){
        val alunoMaisVelho = alunos.minByOrNull { listaDeAluno -> listaDeAluno.dataNascimento}

        if (alunoMaisVelho != null){
            println("O aluno mais velho de toda a turma é: ${alunoMaisVelho.nome}")
        }else  {
            println("Lista Vazia.")
        }
    }
     fun calcularMediaDosAlunos(){
         var arrayAge = arrayOf<Int>()
         for (i in alunos){
             var idade =  2023 - i.dataNascimento.year
             arrayAge = arrayAge.plus(idade)
         }
         println("A média da idade dos alunos ${arrayAge.sum()/arrayAge.size}")
     }
     fun atualizarDadosDoAluno() {
         println("Informe a matrícula: ")
         var matricula = readln().toInt()
         for (aluno in alunos) {
             if (aluno.matricula.equals(matricula)) {
                 println("Informe o novo nome do aluno: ")
                 aluno.nome = readln()
                 println("Novo nome: ${aluno.nome} - Salvo com sucesso!")
                 return
             }
         }
         println("Não foi encontrado matrícula para o aluno informado. ")
     }
    fun removerAluno(){
        println("Informe a matrícula: ")
        var matricula = readln().toInt()
        for (aluno in alunos) {
            if (aluno.matricula.equals(matricula)){
                alunos.remove(aluno)
                println("Aluno removido com sucesso!")
                return
            }
        }
        println("Não foi encontrado matrícula para o aluno informado. ")

}}



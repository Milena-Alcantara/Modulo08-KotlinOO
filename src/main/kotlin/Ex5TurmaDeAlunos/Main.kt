package Ex5TurmaDeAlunos

fun main() {
    val turma = Turma()
    do {
        println("Você deseja:\n1-Cadastrar aluno\n2-Listar alunos\n3-Listar alunos com sobrenome\n4-Ver aluno mais velho\n5-Ver média das idades\n6-Atualizar dados\n7-Remover dados\n8-Sair")
        val opcao = readln().toInt()
        when(opcao){
            1 -> {turma.cadastrarAluno()}
            2 -> {turma.mostrarAlunos()}
            3 -> {turma.mostrarAlunosPeloSobrenome()}
            4 -> {turma.mostrarUmAlunoMaisVelhor()}
            5 -> {turma.calcularMediaDosAlunos()}
            6 -> {turma.atualizarDadosDoAluno()}
            7 -> {turma.removerAluno()}
            8 -> {System.exit(0)}
            else -> {
                println("Opção inválida!")
            }
        }
    }while (opcao != 8)
}
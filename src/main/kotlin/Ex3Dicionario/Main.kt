package Ex3Dicionario

fun main() {
    val dicionario = Dicionario()

    dicionario.adicionarTermos("Irrefutável")
    dicionario.adicionarTermos("Apocaliptico")
    dicionario.adicionarTermos("Bala")
    dicionario.procurarTermo("apocaliptico")
    dicionario.listarDicionario()
}

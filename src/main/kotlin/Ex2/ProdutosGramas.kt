package Ex2


import kotlin.UnsupportedOperationException

abstract class ProdutosGramas(var nome: String, var pesoGrama: Double) {
    abstract fun cadastrar()
    abstract fun mostrarValores()
}

abstract class ProdutosUnidades(var nome: String, var unidade: Int){
    abstract fun cadastrar()
    abstract fun mostrarValores()
}

class Verdura(nome: String, pesoEmgrama: Double): ProdutosGramas(nome,pesoEmgrama){
    var listaVerdura = arrayListOf<Verdura>()
    override fun cadastrar() {
        var continuar = true
        do{
            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()){
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }
                println("Informe a quantidade em gramas que deseja comprar:")
                var grama = readln()
                if (grama.isNullOrBlank()) {
                    throw UnsupportedOperationException()
                }

                if (!grama.contains('.') || grama.contains('-')|| grama == "0" ){
                    continuar = false
                    throw NumberFormatException()
                }

                listaVerdura.add(Verdura(nome, grama.toDouble()))

            }catch (exception : UnsupportedOperationException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")

            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para verdura, a quantidade deve ser informada com ponto.")

            }
        }while (!continuar)

    }

    override fun mostrarValores() {
            println("-------LISTA DE VERDURAS-------")
            for (i in listaVerdura ){
                println("Nome: ${i.nome}    Peso em gramas: ${i.pesoGrama}")
            }
        println("A quantidade de verduras da lista de compras é ${listaVerdura.size}")
        }

}


class Graos(nome: String, pesoEmgrama: Double): ProdutosGramas(nome,pesoEmgrama){
    var listaGraos = arrayListOf<Graos>()
    override fun cadastrar() {

            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()){
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }
                println("Informe a quantidade em gramas que deseja comprar:")
                var grama = readln()
                if (grama.isNullOrBlank()) {
                    throw UnsupportedOperationException()
                }

                if (!grama.contains('.') || grama.contains('-') || grama == "0" ){

                    throw NumberFormatException()
                }

                listaGraos.add(Graos(nome, grama.toDouble()))

            }catch (exception : UnsupportedOperationException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")

            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para Grãos, a quantidade deve ser informada com ponto.")
            }
    }

    override fun mostrarValores() {
        println("-------LISTA DE GRÃOS-------")
        for (i in listaGraos ){
            println("Nome: ${i.nome}    Peso em gramas: ${i.pesoGrama}")
        }
        println("A quantidade de verduras da lista de compras é ${listaGraos.size}")

    }
}

class Legumes(nome: String, unidade: Int): ProdutosUnidades(nome,unidade){
    private var listaLegumes = arrayListOf<Legumes>()
    override fun cadastrar() {
            try {
                println("Informe o nome do produto:")
                var nome = readln()
                while (nome.isNullOrBlank()){
                    println("O nome não pode ser em branco, digite novamente: ")
                    nome = readln()
                }
                println("Informe a quantidade que deseja comprar:")
                var grama = readln()
                if (grama.isNullOrBlank()) {
                    throw UnsupportedOperationException()
                }

                if (grama.contains('.') || grama.contains(',') || grama.contains('-') || grama == "0" ){

                    throw NumberFormatException()
                }

                listaLegumes.add(Legumes(nome, grama.toInt()))

            }catch (exception : UnsupportedOperationException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Não é permitido inserir valor vazio.")

            }catch (exception:NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para Legumes, a quantidade deve ser informada com ponto.")

            }
    }

    override fun mostrarValores() {
        println("-------LISTA DE LEGUMES-------")
        for (i in listaLegumes ){
            println("Nome: ${i.nome}    Unidades: ${i.unidade}")
        }
        println("A quantidade de Legumes da lista de compras é ${listaLegumes.size}")
    }
}

class Outros(nome: String, unidade: Int): ProdutosUnidades(nome,unidade){
    var listaOutros = arrayListOf<Outros>()
    override fun cadastrar() {

                try {
                    println("Informe o nome do produto:")
                    var nome = readln()
                    while (nome.isNullOrBlank()){
                        println("O nome não pode ser em branco, digite novamente: ")
                        nome = readln()
                    }
                    println("Informe a quantidade que deseja comprar:")
                    var grama = readln()
                    if (grama.isNullOrBlank()) {
                        throw UnsupportedOperationException()
                    }

                    if (grama.contains('.') || grama.contains(',') || grama.contains('-') || grama == "0" ){
                        throw NumberFormatException()
                    }

                    listaOutros.add(Outros(nome, grama.toInt()))

                }catch (exception : UnsupportedOperationException){
                    exception.printStackTrace()
                    println("Causa: ${exception.cause}")
                    println("Não é permitido inserir valor vazio.")

                }catch (exception:NumberFormatException){
                    exception.printStackTrace()
                    println("Causa: ${exception.cause}")
                    println("Mensagem: Para Outros, a quantidade deve ser informada como unidade válida.")

                }
    }

    override fun mostrarValores() {
        println("-------LISTA DE OUTROS-------")
        for (i in listaOutros){
            println("Nome: ${i.nome}    Unidades: ${i.unidade}")
        }
        println("A quantidade de Outros da lista de compras é ${listaOutros.size}")
    }
    }



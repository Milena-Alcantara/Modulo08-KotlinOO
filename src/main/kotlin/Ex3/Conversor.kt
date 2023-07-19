package Ex3

import java.lang.NumberFormatException
import java.math.BigDecimal
import java.time.LocalDate

class Conversor {
    val diaDeHoje = LocalDate.now()
    var mensagem = "O Sistema só pode converter em Real R$"

    fun converterParaDolar(){
        var continuar = true
        do {
            try {
                println(mensagem)
                var cotacaoDolar = BigDecimal(4.80)
                println("Informe o valor que deseja converter: ")
                var valorUser = BigDecimal(readln().toDouble())
                var verificacao  = valorUser.toInt()
                if (!(verificacao<=0)){
                    System.out.println("No dia de hoje $diaDeHoje a cotação do Dolar está em U$ ${cotacaoDolar.toDouble()}\nO valor que será convertido é U$ ${valorUser.toDouble()}\nO valor convertido em real é R$ ${valorUser.multiply(cotacaoDolar).toDouble()}")
                    continuar
                }else{
                    println("Valor inválido, digite-o novamente: ")
                    continuar = false
                }
            }catch (exception: NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor deve ser um número decimal.")

            }
        }while (!continuar)
    }

    fun converterDolarCanadense(){
        var continuar = true
        do {
            try {
                println(mensagem)
                var cotacaoDolarCanadense = BigDecimal(3.65)
                println("Informe o valor que deseja converter: ")
                var valorUser = BigDecimal(readln().toDouble())
                var verificacao  = valorUser.toInt()
                if (!(verificacao<=0)){
                    System.out.println("No dia de hoje $diaDeHoje a cotação do Dolar Canadense está em U$ ${cotacaoDolarCanadense.toDouble()}\nO valor que será convertido é C$ ${valorUser.toDouble()}\nO valor convertido em real é R$ ${valorUser.multiply(cotacaoDolarCanadense).toDouble()}")
                    continuar
                }else{
                    println("Valor inválido, digite-o novamente: ")
                    continuar = false
                }
            }catch (exception: NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor deve ser um número decimal.")

            }
        }while (!continuar)
    }
    fun converterParaEuro(){
        var continuar = true
        do {
            try {
                println(mensagem)
                var cotacaoEuro = BigDecimal(5.37)
                println("Informe o valor que deseja converter: ")
                var valorUser = BigDecimal(readln().toDouble())
                var verificacao  = valorUser.toInt()
                if (!(verificacao<=0)){
                    System.out.println("No dia de hoje $diaDeHoje a cotação do Euro está em U$ ${cotacaoEuro.toDouble()}\nO valor que será convertido é € ${valorUser.toDouble()}\nO valor convertido em real é R$ ${valorUser.multiply(cotacaoEuro).toDouble()}")
                    continuar
                }else{
                    println("Valor inválido, digite-o novamente: ")
                    continuar = false
                }
            }catch (exception: NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor deve ser um número decimal.")

            }
        }while (!continuar)
    }
    fun converterParaLibra(){
        var continuar = true
        do {
            try {
                println(mensagem)
                var cotacaoLibra = BigDecimal(6.19)
                println("Informe o valor que deseja converter: ")
                var valorUser = BigDecimal(readln().toDouble())
                var verificacao  = valorUser.toInt()
                if (!(verificacao<=0)){
                    System.out.println("No dia de hoje $diaDeHoje a cotação da Libra Esterlina está em £ ${cotacaoLibra.toDouble()}\nO valor que será convertido é C$ ${valorUser.toDouble()}\nO valor convertido em real é R$ ${valorUser.multiply(cotacaoLibra).toDouble()}")
                    continuar
                }else{
                    println("Valor inválido, digite-o novamente: ")
                    continuar = false
                }
            }catch (exception: NumberFormatException){
                exception.printStackTrace()
                println("Causa: ${exception.cause}")
                println("Mensagem: Para moeda, o valor deve ser um número decimal.")

            }
        }while (!continuar)
    }
    }



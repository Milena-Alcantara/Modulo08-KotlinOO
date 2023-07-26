package Ex2

class DiaSemana {

    fun verificarNumero(num: Int): String{
      when(num){
          1-> return "Domingo"
          2-> return "Segunda"
          3-> return "Terça"
          4-> return "Quarta"
          5-> return "Quinta"
          6-> return "Sexta"
          7-> return "Sábado"
          else-> return "Número inválido"
      }
    }
}
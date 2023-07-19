package Ex1

class CalculoMatematico {
    fun divisao(num1: Int,num2:Int): Int{
        try {
            if (num1 > num2) {
                return num1 / num2
            } else {
                return num2 / num1
            }
        } catch (exception: ArithmeticException) {
            exception.printStackTrace()
            println("Não é possível dividir um valor por 0")
            println("Case: ${exception.cause}")
        }
        return 0
    }
}

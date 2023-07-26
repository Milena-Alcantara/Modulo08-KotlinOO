import Ex3.Numeros
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NumerosTest {
    @Test
    fun deveRetornarMaiorNumero(){
        val numeros = Numeros()
        val vetor = arrayOf(2,5,3,1,7)

       val maiorValor =  numeros.retornarMaior(vetor)

        assertEquals(7,maiorValor)
    }
}
import Ex1.Valores
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ValoresTest {
    @Test
    fun deveRetornarMenorPreco(){
        val valores = Valores()
        val precos = arrayOf(2.00,1.50,5.00)

        val menorPreco = valores.retornarMaisBarato(precos)
        assertEquals(1.50,menorPreco)
    }
}
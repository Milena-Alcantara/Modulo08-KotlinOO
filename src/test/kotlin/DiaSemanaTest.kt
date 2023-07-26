import Ex2.DiaSemana
import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.Test

class DiaSemanaTest {
    val dia = DiaSemana()
    @Test
    fun lernumeroEretornarDomingo(){
        val diaDaSemana = dia.verificarNumero(1)
        assertEquals("Domingo", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarSegunda(){
        val diaDaSemana = dia.verificarNumero(2)
        assertEquals("Segunda", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarTerca(){
        val diaDaSemana = dia.verificarNumero(3)
        assertEquals("Terça", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarQuarta(){
        val diaDaSemana = dia.verificarNumero(4)
        assertEquals("Quarta", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarQuinta(){
        val diaDaSemana = dia.verificarNumero(5)
        assertEquals("Quinta", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarSexta(){
        val diaDaSemana = dia.verificarNumero(6)
        assertEquals("Sexta", diaDaSemana)
    }

    @Test
    fun lernumeroEretornarSabado(){
        val diaDaSemana = dia.verificarNumero(7)
        assertEquals("Sábado", diaDaSemana)
    }

    @Test
    fun verificarSeRetornaInvalido(){
        val diaDaSemana = dia.verificarNumero(8)
        assertEquals("Número inválido", diaDaSemana)
    }
}
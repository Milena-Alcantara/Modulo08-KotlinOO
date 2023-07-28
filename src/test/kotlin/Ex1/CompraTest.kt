package Ex1

import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class CompraTest {
    var carrinho = mutableListOf<Frutas>()
    val compra = Compra()

    @Test
    fun deveRetornarValorTotal(){
        carrinho.add(Laranja("Laranja",0.25))
        carrinho.add(Maca("Maçã",0.60))
        carrinho.add(Maca("Maçã",0.60))
        carrinho.add(Maca("Maçã",0.60))

        val valorRetornado = compra.calcularValorTotal(carrinho)
        assertEquals(2.05,valorRetornado)
    }

    @Test
    fun deveCairEMExcessaoSeListaForVazia(){
        var novaLista = mutableListOf<Frutas>()
        assertThrows<IllegalArgumentException> { compra.calcularValorTotal(novaLista) }
    }

    // Etapa 2
    @Test
    fun deveCairNaOpcaoInvalida(){
        assertThrows<IllegalArgumentException> { compra.comprarComOfertas(0,carrinho) }
    }

    @Test
    fun deveEstarAdicionandoLaranjas(){
        carrinho.add(Laranja("Laranja",0.25))
        compra.comprarComOfertas(2,carrinho)
        assertTrue(carrinho.size == 4)
    }

    @Test
    fun deveEstarAdicionandoMacas(){
        carrinho.add(Maca("Maçã",0.60))
        compra.comprarComOfertas(1,carrinho)
        assertTrue(carrinho.size == 3)
    }

    // Etapa 3

    @Test
    fun deveNotificarOCliente(){
        carrinho.add(Laranja("Laranja",0.25))
        assertTrue(compra.notificarCliente(carrinho))
    }

    @Test
    fun naoDeveNotificarOCliente(){
        assertFalse { compra.notificarCliente(carrinho) }
    }

    // Etapa 4
    @Test
    fun deveConseguirComprarDoEstoque(){
        assertTrue(compra.comprarPeloEstoque(1,2,carrinho))

        assertTrue(compra.comprarPeloEstoque(2,3,carrinho))
    }

    @Test
    fun naoDeveAceitarQuantidadesMaioresQueEstoque(){
        assertFalse { compra.comprarPeloEstoque(1,5,carrinho) }

        assertFalse { compra.comprarPeloEstoque(2,5,carrinho) }
    }

    @Test
    fun deveCairEmExcessaoSePassadoUmaOpcaoIvalida(){
        assertThrows<IllegalArgumentException> {compra.comprarPeloEstoque(3,2,carrinho)  }
    }

}
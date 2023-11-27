package br.edu.infnet;

import br.edu.infnet.exception.ValorInvalidoException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConversorTeste {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ConversorTeste.class);
    @Test
    @DisplayName("Deve confirmar o valor da Conversão do Dolar para Real")
    public void confirmaConversaoDolar(){
        LOGGER.debug("Inicio do conversor Dolar/Real");
        LOGGER.info("Testando conversor Dolar");
        Conversor conversor = new Conversor();
        double conversao = conversor.conversao(1, 5.30);
        assertEquals(5.30, conversao);
        conversao = conversor.conversao(10, 5.30);
        assertEquals(53.0, conversao);
        LOGGER.debug("Finalizado o conversor  Dolar/Real");
    }

    @Test
    @DisplayName("Deve confirmar o valor da Conversão do Euro para Real")
    public void confirmaConversaoEuro(){
        LOGGER.debug("Inicio do conversor Euro/Real");
        LOGGER.info("Testando conversor Euro");
        Conversor conversor = new Conversor();
        double conversao = conversor.conversao(1, 6.10);
        assertEquals(6.10, conversao);
        conversao = conversor.conversao(10, 6.10);
        assertEquals(61.0, conversao);
        LOGGER.debug("Finalizado o conversor Euro/Real");
    }

    @Test
    @DisplayName("Testando AssertThrows Numero Negativo")
    public void confirmaExcecao(){
        LOGGER.debug("Inicio do AssertThrows");
        LOGGER.info("Testando Exceptions");
        Conversor conversor = new Conversor();

        assertThrows(ValorInvalidoException.class, ()-> {
            assertEquals(53.0, conversor.conversaoPositivo(-10, 5.30));
        });
        LOGGER.error("Ambos os numeros devem ser positivos!");
    }

}

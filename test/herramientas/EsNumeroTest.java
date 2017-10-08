package herramientas;

import descansoApp.dominio.Ciudad;
import descansoApp.herramientas.EsNumero;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Lucas
 */
public class EsNumeroTest {
    @Test
    public void testEsNumero() {
        System.out.println("EsNumero");
        String numero = "2";
        boolean resultado = EsNumero.esNumero(numero);
        assertTrue(resultado);           
    }
}

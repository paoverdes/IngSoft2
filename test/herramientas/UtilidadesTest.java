package herramientas;

import descansoApp.dominio.Ciudad;
import descansoApp.herramientas.Buscador;
import descansoApp.herramientas.Utilidades;
import java.util.ArrayList;
import java.util.Calendar;
import static org.junit.Assert.*;
import org.junit.Test;

public class UtilidadesTest {
    @Test
    public void testFechasIguales() {
        System.out.println("Comparar fechas");
        Calendar hoy = Calendar.getInstance();
        Calendar hoyTambien = Calendar.getInstance();        
        assertTrue(Utilidades.fechasIguales(hoy, hoyTambien));
    }
}

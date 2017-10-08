package herramientas;

import java.util.ArrayList;
import java.util.Iterator;
import descansoApp.dominio.Ciudad;
import descansoApp.herramientas.Buscador;
import descansoApp.dominio.Ciudad;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuscadorTest {
    
    @Test
    public void testBuscador() {
        Ciudad fraybentos = new Ciudad();
        fraybentos.setNombre("Fray Bentos");
        fraybentos.setDescripcion("Fray Bentos");
        fraybentos.setInfoGral("Fray Bentos");
        ArrayList<Ciudad> listaCiudades = new ArrayList<>();;
        listaCiudades.add(fraybentos);
        System.out.println("buscar");
        Buscador buscador = new Buscador(listaCiudades);
        ArrayList<Ciudad> resultado = buscador.buscar("Fray Bentos");
        
        assertEquals(listaCiudades, resultado);
    }
}

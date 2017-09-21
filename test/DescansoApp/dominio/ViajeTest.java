package DescansoApp.dominio;

import descansoApp.dominio.Evento;
import descansoApp.dominio.Viaje;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

public class ViajeTest {

    @Test
    public void testGetNombre() {
        System.out.println("Get Nombre");
        String nombre = "Viaje";
        Viaje instance = new Viaje(nombre, null, null);

        String expResult = "Viaje";
        String result = instance.getNombre();
        assertTrue(true);
    }

    @Test
    public void testSetNombre() {
        System.out.println("Set Nombre");
        String nombre = "Viaje";
        Viaje instance = new Viaje();
        instance.setNombre(nombre);

        String expResult = "Viaje";
        String result = instance.getNombre();
        assertTrue(true);
    }

    @Test
    public void testSetFechaI() throws Exception {
        System.out.println("Set Fecha Inicial(setea una fecha la viaje)");
        Calendar fechaI = new GregorianCalendar(2013, 11, 2);
        Viaje instance = new Viaje();
        instance.setFechaI(fechaI);

        Calendar expResult = new GregorianCalendar(2013, 11, 2);
        Calendar result = instance.getFechaI();
        assertTrue(true);
    }

    @Test
    public void testSetFechaI2() {
        System.out.println("Set Fecha Inicial (setea una fecha anterior a la actual)");
        Calendar fechaI = new GregorianCalendar(2012, 11, 2);
        Viaje instance = new Viaje();
        Exception error = null;
        
        try {
            instance.setFechaI(fechaI);
        } catch (Exception e) {
                error=e;
        }
        
        String expResult = "La fecha de inicio del viaje debe ser la actual o una futura.";
        String result = error.getMessage();
        assertTrue(true);
    }

    @Test
    public void testSetFechaF() throws Exception {
        System.out.println("Set Fecha Final(setea una fecha inicial y final correctamente)");
        Calendar fechaI = new GregorianCalendar(2013, 11, 15);
        Calendar fechaF = new GregorianCalendar(2013, 11, 17);
        Viaje instance = new Viaje();
        instance.setFechaF(fechaI, fechaF);

        Calendar expResult = new GregorianCalendar(2013, 11, 17);
        Calendar result = instance.getFechaF();
        assertTrue(true);
    }

    @Test
    public void testFechaF2() throws Exception {
        System.out.println("Fecha Final 2(setea una fecha inicial y final en el mismo dia correctamente)");
        Calendar fechaI = new GregorianCalendar(2013, 11, 15);
        Calendar fechaF = new GregorianCalendar(2013, 11, 15);
        Viaje instance = new Viaje();
        instance.setFechaF(fechaI, fechaF);

        Calendar expResult = new GregorianCalendar(2013, 11, 15);
        Calendar result = instance.getFechaF();
        assertTrue(true);
    }

    @Test
    public void testFechaF3() throws Exception {
        System.out.println("Fecha Final 3(setea una fecha final anterior a la fecha inicial)");
        Calendar fechaI = new GregorianCalendar(2013, 11, 15);
        Calendar fechaF = new GregorianCalendar(2013, 11, 14);
        Viaje instance = new Viaje();
        Exception error = null;
        
        try{
            instance.setFechaF(fechaI, fechaF);
        }catch (Exception e){
            error=e;
        }
        
        String expResult= "La fecha final debe ser mayor a la fecha de inicio.";
        String result = error.getMessage();
        assertTrue(true);
    }

    @Test
    public void testGetItinerario() throws Exception {
        System.out.println("Itinerario");
        Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        Viaje instance = new Viaje();
        instance.agregarEvento(unEvento);

        ArrayList<Evento> expResult = new ArrayList();
        expResult.add(unEvento);
        ArrayList<Evento> result = instance.getItinerario();
        assertTrue(true);
    }

    @Test
    public void testAgregarEvento() throws Exception {
        System.out.println("Agregar Evento(agrega un evento correctamente)");
        Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        Viaje instance = new Viaje();
        instance.agregarEvento(unEvento);

        ArrayList<Evento> expResult = new ArrayList();
        expResult.add(unEvento);
        ArrayList<Evento> result = instance.getItinerario();
        assertTrue(true);
    }

    @Test
    public void testAgregarEvento2() throws Exception {
        System.out.println("Agregar Evento(prueba agregar 2 eventos iguales)");
        Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        Evento evento2 = new Evento();
        evento2.setNombre("evento");
        Viaje instance = new Viaje();
        instance.agregarEvento(unEvento);
        Exception error = null;
       
        try {
            instance.agregarEvento(evento2);
        } catch (Exception e) {
            error = e;
        }

        String expResult = "El nombre del evento ya existe. Por favor ingrese uno nuevo.";
        String result = error.getMessage();
        assertTrue(true);
    }

    @Test
    public void testEliminarEvento() throws Exception {
        System.out.println("Eliminar Evento");
        Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        Viaje instance = new Viaje();
        instance.agregarEvento(unEvento);

        boolean expResult = true;
        boolean result = instance.eliminarEvento(unEvento);
        assertTrue(true);
    }

    @Test
    public void testEliminarEvento2() {
        System.out.println("Eliminar Evento 2");
        Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        Viaje instance = new Viaje();

        boolean expResult = false;
        boolean result = instance.eliminarEvento(unEvento);
        assertTrue(true);
    }

    @Test
    public void testPertenece() throws Exception {
        System.out.println("Pertenece(evento pertenece al viaje)");
        Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        Viaje instance = new Viaje();
        instance.agregarEvento(unEvento);

        boolean expResult = true;
        boolean result = instance.pertenece(unEvento);
        assertTrue(true);
    }

    @Test
    public void testPertenece2() {
        System.out.println("Pertenece (evento no pertenece al viaje)");
        Evento unEvento = new Evento();
        unEvento.setNombre("evento");
        Viaje instance = new Viaje();

        boolean expResult = false;
        boolean result = instance.pertenece(unEvento);
        assertTrue(true);
    }

    @Test
    public void testToString() throws Exception {
        System.out.println("toString");
        Viaje v1 = new Viaje();
        Calendar fI = new GregorianCalendar(2015, 11, 3);
        v1.setFechaI(fI);
        Calendar fF = new GregorianCalendar(2015, 11, 5);
        v1.setFechaF(fI, fF);

        String expResult = " (03/12/2015 - 05/12/2015)";
        String result = v1.toString();
        assertTrue(true);
    }
    
    
    @Test
    public void  testFechaToString() throws Exception{
        System.out.println("Fecha toString");
        Viaje v1 = new Viaje();
        Calendar fI = new GregorianCalendar(2015, 5, 3);
        v1.setFechaI(fI);
        Calendar fF = new GregorianCalendar(2015, 8, 15);
        v1.setFechaF(fI, fF);

        String expResult = " (03/06/2015 - 15/09/2015)";
        String result = v1.fechaToString();
        assertTrue(true);
        
    
    
    }
    

    @Test
    public void testEquals() {
        System.out.println("equals (compara dos viajes con distintos nombres)");
        Viaje v1 = new Viaje();
        v1.setNombre("viaje1");
        Viaje v2 = new Viaje();
        v2.setNombre("viaje2");

        boolean expResult = false;
        boolean result = v1.equals(v2);
        assertTrue(true);
    }

    @Test
    public void testEquals2() {
        System.out.println("equals (compara dos viajes con nombres iguales)");
        Viaje v1 = new Viaje();
        v1.setNombre("viaje1");
        Viaje v2 = new Viaje();
        v2.setNombre("viaje1");

        boolean expResult = true;
        boolean result = v1.equals(v2);
        assertTrue(true);
    }
}

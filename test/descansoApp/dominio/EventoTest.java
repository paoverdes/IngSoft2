package descansoApp.dominio;

import descansoApp.dominio.Evento;
import descansoApp.dominio.Ciudad;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventoTest {

    @Test
    public void testGetNombre() {
        System.out.println("Get Nombre");
        String nombre = "Evento";
        Evento instance = new Evento(nombre, null, null, "", "", null);

        String expResult = "Evento";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetNombre() {
        System.out.println("Set Nombre");
        String nombre = "Evento";
        Evento instance = new Evento();
        instance.setNombre(nombre);
        
        String expResult = "Evento";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFechaHoraI() throws Exception {
        System.out.println("Set Fecha-Hora Inicio(agrega una fecha hora inicio correctamente)");
        Calendar fechaHoraI= new GregorianCalendar(2018, 9, 20, 21, 30);
        Evento instance = new Evento();
        instance.setFechaHoraI(fechaHoraI);
       
        Calendar expResult = new GregorianCalendar(2018, 9, 20,21,30);
        Calendar result = instance.getFechaHoraI();
        assertEquals(expResult, result);
    }
//    
//    @Test
//    public void testSetFechaHoraI2(){
//        System.out.println("Set Fecha-Hora Inicio (agrega una fecha hora inicio anterior a la fecha actual)");
//        Calendar fechaHoraI= new GregorianCalendar(2013, 8, 20, 20, 31);
//        Evento instance = new Evento();
//        Exception error= null;
//        
//        try {
//            instance.setFechaHoraI(fechaHoraI);
//        } catch (Exception e) {
//            error=e;
//        }
//        
//        String expResult = "La fecha de inicio del evento debe ser la actual o una futura.";
//        String result= error.getMessage();
//        assertTrue(true);
//    }
   
//    @Test
//    public void testSetFechaHoraI3(){
//        System.out.println("Set Fecha-Hora Incio (agrega una fecha igual a la actual,con una hora menor a la actual)");
//        Calendar fechaHoraI= Calendar.getInstance();
//        fechaHoraI.set(Calendar.HOUR_OF_DAY, 0);
//        fechaHoraI.set(Calendar.MINUTE, 0);
//        Evento instance = new Evento();
//        Exception error=null;
//        
//        try {
//            instance.setFechaHoraI(fechaHoraI);
//        } catch (Exception e) {
//            error=e;
//        }
//        
//        String expResult= "El evento esta programado para hoy, entonces la hora de inicio debe ser mayor a la actual.";
//        String result = error.getMessage();
//        assertTrue(true);
//    }

    @Test
    public void testFechaHoraF() throws Exception {
        System.out.println("Set Fecha-Hora Fin(setea fecha hora inicio y final correctamente)");
        Calendar fechaHoraF= new GregorianCalendar(2013, 11, 19, 16, 16);
        Calendar fechaHoraI= new GregorianCalendar(2013, 11, 14 ,16, 16);
        Evento instance = new Evento();
        instance.setFechaHoraF(fechaHoraI,fechaHoraF);
        
        Calendar expResult = new GregorianCalendar(2013, 11, 19, 16, 16);
        Calendar result = instance.getFechaHoraF();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFechaHoraF2(){
        System.out.println("Set Fecha-Hora Fin(setea una fecha hora final anterior a la fecha hora inicial) ");
        Calendar fechaHoraI= new GregorianCalendar(2018 ,9, 20 ,20 ,20);
        Calendar fechaHoraF= new GregorianCalendar(2018, 9, 10, 10, 20);
        Evento instance = new Evento();
        Exception error= null;
        
        try {
            instance.setFechaHoraF(fechaHoraI, fechaHoraF);
        } catch (Exception e) {
            error=e;
        }
        
        String expResult="La fecha final debe ser mayor a la fecha de inicio.";
        String result= error.getMessage();
        assertEquals(expResult, result);
    }
    
    @Test 
    public void testSetFechaHoraF3(){
        System.out.println("Fecha-Hora Fin (setea una fecha final igual a la inicial, seteando una hora anterior a la inicial)");
        Calendar fechaHoraI= new GregorianCalendar(2018, 10, 10, 10, 20);
        Calendar fechaHoraF= new GregorianCalendar(2018, 10, 10, 5, 10);
        Evento instance = new Evento();
        Exception error= null;
        
        try {
            instance.setFechaHoraF(fechaHoraI, fechaHoraF);
        } catch (Exception e) {
            error=e;
        }
        
        String expResult ="La hora de finalización debe ser mayor a la hora de inicio del evento.";
        String result= error.getMessage();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetDescripcion() {
        System.out.println("Get Descripcion");
        String descripcion = "Aqui va la descripcion";
        Evento instance = new Evento("", null, null, descripcion, "", null);
        
        String expResult = "Aqui va la descripcion";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }
    
    public void testSetDescripcion() {
        System.out.println("Set Descripcion");
        String descripcion = "Aqui va la descripcion";
        Evento instance = new Evento();
        instance.setDescripcion(descripcion);
        
        String expResult = "Aqui va la descripcion";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetUbicacion() {
        System.out.println("Get Ubicacion");
        String ubicacion = "18 de julio 2080";
        Evento instance = new Evento("", null, null,"", ubicacion, null);

        String expResult = "18 de julio 2080";
        String result = instance.getUbicacion();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetUbicacion() {
        System.out.println("Set Ubicacion");
        String ubicacion = "18 de julio 2080";
        Evento instance = new Evento();
        instance.setUbicacion(ubicacion);
        
        String expResult = "18 de julio 2080";
        String result = instance.getUbicacion();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCiudad() {
        System.out.println("Get Ciudad");
        Ciudad c= new Ciudad("Fray Bentos", null);
        Evento instance = new Evento("", null, null,"", "", c);
        
        Ciudad expResult = c;
        Ciudad result = instance.getCiudad();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testSetCiudad() {
        System.out.println("Set Ciudad");
        Evento instance = new Evento();
        Ciudad c= new Ciudad();
        c.setNombre("Fray Bentos");
        instance.setCiudad(c);
        
        Ciudad expResult = c;
        Ciudad result = instance.getCiudad();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() throws Exception {
        System.out.println("toString");
        Evento e = new Evento();
        e.setNombre("Evento");
        Calendar fI = new GregorianCalendar(2018, 11, 3, 10, 8);
        e.setFechaHoraI(fI);
        e.setUbicacion("Ubicacion");

        String expResult = "10:08 - Evento (Ubicacion)";
        String result = e.toString();
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testHoraInicioToString() throws Exception {
        System.out.println("Hora Inicio ToString");
        Evento e = new Evento();
        Calendar fI = new GregorianCalendar(2018, 11, 3, 10, 8);
        e.setFechaHoraI(fI);
        

        String expResult = "10:08";
        String result = e.horaInicioToString();
        assertEquals(expResult, result);
    }
    
    @Test 
    public void testHoraFinToString() throws Exception{
        System.out.println("Hora Fin ToString");
         Evento e = new Evento();
         Calendar fI = new GregorianCalendar(2015, 11, 3, 21, 32);
         Calendar fF = new GregorianCalendar(2015, 11, 10, 20, 30);
         e.setFechaHoraF(fI, fF);
         
         String expResult= "20:30";
         String result = e.horaFinToString();
         assertEquals(expResult, result);
    }
    
    @Test
    public void testFechaInicioToString() throws Exception{
        System.out.println("Fecha Inicio ToString");
        Evento e= new Evento();
        Calendar fI= new GregorianCalendar(2018, 10, 3, 2, 15);
        e.setFechaHoraI(fI);
        
        String expResult= "03/11/2018";
        String result= e.fechaInicioToString();
        assertEquals(expResult, result);
    
    }
    
    @Test 
    public void testFechaFinToSTring() throws Exception{
        System.out.println("Fecha Fin ToString");
        Evento e = new Evento();
        Calendar fI= new GregorianCalendar(2015,2,3,2,15);
        Calendar fF= new GregorianCalendar(2015,5,15,20,10);
        e.setFechaHoraF(fI, fF);
        
        String expResult = "15/06/2015";
        String result = e.fechaFinToString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals() {
        System.out.println("equals(compara dos eventos con distintos nombres)");
        Evento e1= new Evento();
        e1.setNombre("Evento1");
        Evento e2= new Evento();
        e2.setNombre("Evento2");
        
        assertNotEquals(e2, e1);
    }
    @Test
    public void testEquals2() {
        System.out.println("equals(compara dos eventos con nombres iguales)");
        Evento e1= new Evento();
        e1.setNombre("Evento1");
        Evento e2= new Evento();
        e2.setNombre("Evento1");
        
        assertEquals(e2, e1);
    }
    @Test
    public void testCompareTo() throws Exception {
        System.out.println("compareTo(compara dos eventos con fecha iguales)");
        Evento e1= new Evento();
        Calendar f1= new GregorianCalendar(2018, 10, 3, 2, 15);
        e1.setFechaHoraI(f1);
        Evento e2= new Evento();
        Calendar f2= new GregorianCalendar(2018, 10, 3, 2, 15);
        e2.setFechaHoraI(f2);
        
        assertEquals(e2, e1);
    }
    
     @Test
    public void testCompareTo2() throws Exception {
        System.out.println("compareTo(compara dos eventos con distintas fechas)");
        Evento e1= new Evento();
        Calendar f1= new GregorianCalendar(2018, 10, 3, 2, 15);
        e1.setFechaHoraI(f1);
        Evento e2= new Evento();
        Calendar f2= new GregorianCalendar(2018, 9, 4, 12, 34);
        e2.setFechaHoraI(f2);
        
        assertNotEquals(e2.getFechaHoraI(), e1.getFechaHoraI());
    }
    
    @Test
    public void testCompareTo3() throws Exception {
        System.out.println("compareTo(compara dos eventos con distintas fechas, cambiando el orden)");
        Evento e1= new Evento();
        Calendar f1= new GregorianCalendar(2018, 9, 4, 12, 34);
        e1.setFechaHoraI(f1);
        Evento e2= new Evento();
        Calendar f2= new GregorianCalendar(2018, 10, 3, 2, 15);
        e2.setFechaHoraI(f2);
        
        assertNotEquals(e2.getFechaHoraI(), e1.getFechaHoraI());
    }
}
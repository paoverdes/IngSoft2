package descansoApp.dominio;

import descansoApp.dominio.ComercioActividad;
import descansoApp.dominio.Ciudad;
import descansoApp.herramientas.TipoCA;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

public class CiudadTest {
    
    @Test
    public void testGetNombre() {
        System.out.println("Get Nombre");
        String nombre = "Fray Bentos";
        Ciudad instance = new Ciudad(nombre, "");
        
        String expResult = "Fray Bentos";
        String result = instance.getNombre();
        assertEquals(expResult, result);       
    }
    
    @Test
     public void testSetNombre() {
        System.out.println("Set Nombre");
        String nombre = "Fray Bentos";
        Ciudad instance = new Ciudad();
        instance.setNombre(nombre);
        
        String expResult = "Fray Bentos";
        String result = instance.getNombre();
        assertEquals(expResult, result);             
    }
    @Test
    public void testGetDescripcion() {
        System.out.println("Get Descripcion");
        String descripcion = "Des";
        Ciudad instance = new Ciudad();
        instance.setDescripcion(descripcion);
        
        String expResult = "Des";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }
     
    @Test
    public void testSetDescripcion() {
        System.out.println("Set Descripcion");
        String descripcion = "Des";
        Ciudad instance = new Ciudad();
        instance.setDescripcion(descripcion);
        
        String expResult = "Des";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetInfoGral() {
        System.out.println("Get Info Gral");
        String infoGral = "Informacion";
        Ciudad instance = new Ciudad("",infoGral);               
        String expResult = "Informacion";
        String result = instance.getInfoGral();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetInfoGral() {
        System.out.println("Set Info Gral");
        String infoGral = "Informacion";
        Ciudad instance = new Ciudad();
        instance.setInfoGral(infoGral);
       
        
        String expResult = "Informacion";
        String result = instance.getInfoGral();
        assertEquals(expResult, result);
    }

    @Test
    public void testPerteneceComercioActividad() {
        System.out.println("Pertenece Comercio Actividad (comercioActividad no pertenece a la ciudad)");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("alojamiento");
        Ciudad instance = new Ciudad();
                
        boolean result = instance.perteneceComercioActividad(TipoCA.alojamiento, cA);
        assertFalse(result);
    }
    
    @Test
    public void testPerteneceComercioActividad2() {
        System.out.println("Pertenece Comercio Actividad 2(comercioActividad pertenece a la ciudad)");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("alojamiento");
        Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.alojamiento, cA);
                
        boolean result = instance.perteneceComercioActividad(TipoCA.alojamiento, cA);
        assertTrue(result);
    }
    
    @Test
    public void testAgregarComercioActividad() {
        System.out.println("Agregar Comercio Actividad(se agrega correctamente)");
        ComercioActividad cA = new ComercioActividad();      
        cA.setTipo(TipoCA.actividad);
        cA.setNombre("actividad");        
        Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.actividad, cA);                
        ComercioActividad result= instance.getActividades().get(0);
        assertEquals(result, cA);        
    }
    
       
    @Test
    public void testGetActividades() {
        System.out.println("Get Actividades");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("actividad");
        cA.setTipo(TipoCA.actividad);
        Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.actividad, cA);
        
        ArrayList<ComercioActividad> expResult = new ArrayList();
        expResult.add(cA);
        ArrayList<ComercioActividad> result = instance.getActividades();
        assertEquals(result, expResult);        
    }

    @Test
    public void testGetEstGastronomicos() {
        System.out.println("Get Est Gastronomicos");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("estGastronomico");
        Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.estGastronomico, cA);
        
        ArrayList<ComercioActividad> expResult = new ArrayList();
        expResult.add(cA);
        ArrayList<ComercioActividad> result = instance.getEstGastronomicos();
        assertEquals(result, expResult); 
    }

    @Test
    public void testGetAlojamientos() {
        System.out.println("Get Alojamientos");
        ComercioActividad cA = new ComercioActividad();
        cA.setNombre("alojamiento");
        Ciudad instance = new Ciudad();
        instance.agregarComercioActividad(TipoCA.alojamiento, cA);
        
        ArrayList<ComercioActividad> expResult = new ArrayList();
        expResult.add(cA);
        ArrayList<ComercioActividad> result = instance.getAlojamientos();
        assertEquals(result, expResult); 
    }
    
    @Test
    public void testEquals() {
        System.out.println("equals(compara dos ciudades con distintos nombres)");
        Ciudad c1= new Ciudad();
        c1.setNombre("Ciudad1");
        Ciudad c2 = new Ciudad();
        c2.setNombre("Ciudad2");
        assertNotEquals(c1, c2);
    }
    @Test
    public void testEquals2() {
        System.out.println("equals(compara dos ciudades con nombres iguales)");
        Ciudad c1= new Ciudad();
        c1.setNombre("Ciudad1");
        Ciudad c2 = new Ciudad();
        c2.setNombre("Ciudad1");
        assertEquals(c1, c2);
    }
    @Test
    public void testAgregarImagen(){
        System.out.println("Agregar imagen(agrega imagen a una lista de imagenes)");
        String ruta= "/descansoApp/baseDatos/fraybentos1.jpg";
        Ciudad instance = new Ciudad();
        instance.agregarImagen(ruta);
        
       
        String expResult= "basedatos/fraybentos1.jpg";
        String aux = instance.getImagenes().get(0).getDescription();
        String [] result= aux.toLowerCase().split("/descansoapp/");
        assertEquals(expResult, result[1]);
        
    }
    
    @Test
    public void testGetImagenes(){
        System.out.println("GetImagenes compara las rutas de una lista de imagenes");
        String ruta= "/descansoApp/baseDatos/fraybentos2.jpg";
        Ciudad instance = new Ciudad();
        instance.agregarImagen(ruta);
        
       
        String expResult= "basedatos/fraybentos2.jpg";
        String aux = instance.getImagenes().get(0).getDescription();
        String [] result= aux.toLowerCase().split("/descansoapp/");
        assertEquals(expResult, result[1]);
        
    }
}

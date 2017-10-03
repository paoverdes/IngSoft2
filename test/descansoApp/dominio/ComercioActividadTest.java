package DescansoApp.dominio;

import descansoApp.dominio.ComercioActividad;
import descansoApp.herramientas.TipoCA;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Test;
import static descansoApp.herramientas.TipoCA.*;
import static org.junit.Assert.*;


public class ComercioActividadTest {

    @Test
    public void testGetNombre() {
        System.out.println("Get Nombre");
        String nombre= "ComercioActividad";
        ComercioActividad instance = new ComercioActividad(nombre,"",null,"","","","","","");
        
        
        String expResult = "ComercioActividad";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testSetNombre() {
        System.out.println("Set Nombre");
        String nombre= "ComercioActividad";
        ComercioActividad instance = new ComercioActividad();
        instance.setNombre(nombre);
        
        String expResult = "ComercioActividad";
        String result = instance.getNombre();
         assertEquals(expResult, result);
    }
    
    @Test
    public void testGetDetalles() {
        System.out.println("Get Detalles");
        String detalles= "Aqui va el detalle";
        ComercioActividad instance = new ComercioActividad("",detalles,null,"","","","","","");

        String expResult = "Aqui va el detalle";
        String result = instance.getDetalles();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetDetalles() {
        System.out.println("Set Detalles");
        String detalles= "Aqui va el detalle";
        ComercioActividad instance = new ComercioActividad();
        instance.setDetalles(detalles);
        
        String expResult = "Aqui va el detalle";
        String result = instance.getDetalles();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTipo() {
        System.out.println("Get Tipo");
        ComercioActividad instance = new ComercioActividad("","",alojamiento,"","","","","","");

        TipoCA expResult = alojamiento;
        TipoCA result= instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetTipo() {
        System.out.println("Set Tipo");
        TipoCA tipo = alojamiento;
        ComercioActividad instance = new ComercioActividad();
        instance.setTipo(tipo);

        TipoCA expResult = alojamiento;
        TipoCA result= instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetCategoria() {
        System.out.println("Get Categoria");
        String cat = "Hotel";
        ComercioActividad instance = new ComercioActividad("","",null,cat,"","","","","");

        String expResult = "Hotel";
        String result= instance.getCategoria();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testSetCategoria() {
        System.out.println("Set Categoria");
        String cat = "Hotel";
        ComercioActividad instance = new ComercioActividad();
        instance.setCategoria(cat);
       
        String expResult = "Hotel";
        String result= instance.getCategoria();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHorario() {
        System.out.println("Get Horario");
        String horario= "Lunes a Viernes de 06:00 a 22:00 ";
        ComercioActividad instance = new ComercioActividad("","",null,"",horario,"","","","");
        
        
        String expResult = "Lunes a Viernes de 06:00 a 22:00 ";
        String result = instance.getHorario();
        assertEquals(expResult, result); 
    }
    
       @Test
    public void testSetHorario() {
        System.out.println("Set Horario");
        String horario= "Lunes a Viernes de 06:00 a 22:00 ";
        ComercioActividad instance = new ComercioActividad();
        instance.setHorario(horario);
        
        String expResult = "Lunes a Viernes de 06:00 a 22:00 ";
        String result = instance.getHorario();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetUbicacion() {
        System.out.println("Get Ubicacion");
        String ubicacion= "18 de julio c/ Ejido 1850";
        ComercioActividad instance = new ComercioActividad("","",null,"","",ubicacion,"","","");
        
        
        String expResult = "18 de julio c/ Ejido 1850";
        String result = instance.getUbicacion();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testSetUbicacion() {
        System.out.println("Set Ubicacion");
        String ubicacion= "18 de julio c/ Ejido 1850";
        ComercioActividad instance = new ComercioActividad();
        instance.setUbicacion(ubicacion);
        
        String expResult = "18 de julio c/ Ejido 1850";
        String result = instance.getUbicacion();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTelefono() {
        System.out.println("Get Telefono");
        String tel= "555-589-874";
        ComercioActividad instance = new ComercioActividad("","",null,"","","",tel,"","");

        String expResult = "555-589-874";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetTelefono() {
        System.out.println("Set Telefono");
        String tel= "555-589-874";
        ComercioActividad instance = new ComercioActividad();
        instance.setTelefono(tel);
        
        String expResult = "555-589-874";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetWeb() {
        System.out.println("Get Web");
        String web = "www.alojamiento.com";
        ComercioActividad instance = new ComercioActividad("","",null,"","","","",web,"");

        String expResult="www.alojamiento.com";
        String result= instance.getWeb();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetWeb() {
        System.out.println("Set Web");
        String web = "www.alojamiento.com";
        ComercioActividad instance = new ComercioActividad();
        instance.setWeb(web);
        
        String expResult="www.alojamiento.com";
        String result= instance.getWeb();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPrecio() {
        System.out.println("Get Precio");
        String precio = "1000,5";
        ComercioActividad instance = new ComercioActividad("","",null,"","","","","",precio);

        String expResult = "1000,5";
        String result = instance.getPrecio();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPrecio() {
        System.out.println("Set Precio");
        String precio = "1000,5";
        ComercioActividad instance = new ComercioActividad();
        instance.setPrecio(precio);
        
        String expResult = "1000,5";
        String result = instance.getPrecio();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetImagenes() {
        System.out.println("Get Imagenes(compara las rutas de una lista de imagenes)");
        String ruta= "/descansoApp/baseDatos/fiesta1.jpg";
        ComercioActividad instance = new ComercioActividad();
        instance.agregarImagen(ruta);
        
       
        String expResult= "basedatos/fiesta1.jpg";
        String aux = instance.getImagenes().get(0).getDescription();
        String [] result= aux.toLowerCase().split("/descansoapp/");
        assertEquals(expResult, result[1]);
    }

    @Test
    public void testSetImagenes() {
        System.out.println("Set imagen(agrega imagen a una lista de imagenes)");
        String ruta= "/descansoApp/baseDatos/fiesta1.jpg";
        ComercioActividad instance = new ComercioActividad();
        instance.agregarImagen(ruta);
        
       
        String expResult= "basedatos/fiesta1.jpg";
        String aux = instance.getImagenes().get(0).getDescription();
        String [] result= aux.toLowerCase().split("/descansoapp/");
        assertEquals(expResult, result[1]);                
    }

    @Test
    public void testEquals() {
        System.out.println("equals(compara dos comercioActividades con distintos nombres)");
        ComercioActividad ca1= new ComercioActividad();
        ca1.setNombre("comercioActividad1");
        ComercioActividad ca2= new ComercioActividad();
        ca2.setNombre("comercioActividad2");      
        assertNotEquals(ca1, ca2);
    }
    
    public void testEquals2() {
        System.out.println("equals(compara dos comercioActividades con nombres iguales)");
        ComercioActividad ca1= new ComercioActividad();
        ca1.setNombre("comercioActividad1");
        ComercioActividad ca2= new ComercioActividad();
        ca2.setNombre("comercioActividad1");                
        assertEquals(ca1, ca2);
    }
    
    @Test
    public void testCompareTo() {
        System.out.println("compareTo(compara dos comercioActividades distintos)");
        ComercioActividad ca1 = new ComercioActividad();
        ca1.setNombre("comercioActividad1");
        ComercioActividad ca2 = new ComercioActividad();
        ca2.setNombre("comercioActividad2");
        assertNotEquals(ca1, ca2);
    }
    
   
    @Test
    public void testCompareTo3() {
        System.out.println("compareTo 3(compara dos comercioActividades iguales)");
        ComercioActividad ca1 = new ComercioActividad();
        ca1.setNombre("comercioActividad1");
        ComercioActividad ca2 = new ComercioActividad();
        ca2.setNombre("comercioActividad1");        
        assertEquals(ca1, ca2);                
    }
}

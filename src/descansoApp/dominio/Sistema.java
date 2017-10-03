package descansoApp.dominio;

import java.io.Serializable;
import java.util.*;

public class Sistema  implements Serializable{
    private ArrayList<Viaje> listaViajes;
    private ArrayList<Ciudad> listaCiudades;
    
    public Sistema(){
        listaViajes = new ArrayList<>();
        listaCiudades = new ArrayList<>();
    }

    public ArrayList<Viaje> getListaViajes() {
        return listaViajes;
    }

    public ArrayList<Ciudad> getListaCiudades() {
        return listaCiudades;
    }
    
     public void agregarViaje(Viaje unViaje)throws Exception{
        if (listaViajes.indexOf(unViaje) != -1){
            throw new Exception("El nombre del viaje ya existe. Por favor ingrese uno nuevo.");
        } 
        listaViajes.add(unViaje);
        
    }
    
    public boolean eliminarViaje(Viaje unViaje){
        return listaViajes.remove(unViaje);
    }
    
    public boolean pertenece(Viaje unViaje){
      return listaViajes.contains(unViaje);
    }
    
    public void agregarCiudad(Ciudad unaCiudad){
        listaCiudades.add(unaCiudad);
    }
}

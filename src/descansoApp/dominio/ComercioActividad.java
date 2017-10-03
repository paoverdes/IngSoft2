package descansoApp.dominio;

import descansoApp.herramientas.TipoCA;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class ComercioActividad implements Serializable, Comparable<ComercioActividad> {
    private String nombre;
    private String detalles;
    private TipoCA tipo;
    private String categoria;
    private String horario;
    private String ubicacion;
    private String telefono;
    private String web;
    private String precio;
    private ArrayList<ImageIcon> imagenes;

    public ComercioActividad() {
        this.nombre = "";
        this.detalles = "";
        this.tipo = null;
        this.categoria = "";
        this.horario = "";
        this.ubicacion = "";
        this.telefono = "";
        this.web = "";
        this.precio = "";
        this.imagenes = new ArrayList<>();
    }

    public ComercioActividad(String nombre, String detalles,TipoCA tipo, String categoria, String horario, String ubicacion, String telefono, String web, String precio) {
        this.nombre = nombre;
        this.detalles = detalles;
        this.tipo = tipo;
        this.categoria = categoria;
        this.horario = horario;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.web = web;
        this.precio = precio;
        this.imagenes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public TipoCA getTipo() {
        return tipo;
    }

    public void setTipo(TipoCA tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public ArrayList<ImageIcon> getImagenes() {
        return imagenes;
    }

    public void agregarImagen(String ruta){
        imagenes.add(new javax.swing.ImageIcon(getClass().getResource(ruta)));
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean valido = false;
        ComercioActividad ca = (ComercioActividad) obj;
        if (ca.getNombre().equalsIgnoreCase(this.getNombre())) {
            valido = true;
        }
        return valido;
    }
    
    @Override
    public int compareTo(ComercioActividad cA){
        return nombre.compareTo(cA.getNombre());
    }
}

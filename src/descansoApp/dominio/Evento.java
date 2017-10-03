package descansoApp.dominio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Evento implements Serializable, Comparable<Evento> {

    private String nombre;
    private Calendar fechaHoraI;
    private Calendar fechaHoraF;
    private String descripcion;
    private String ubicacion;
    private Ciudad ciudad;

    public Evento(String nombre, Calendar fechaHoraI, Calendar fechaHoraF, String descripcion, String ubicacion, Ciudad ciudad) {
        this.nombre = nombre;
        this.fechaHoraI = fechaHoraI;
        this.fechaHoraF = fechaHoraF;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.ciudad = ciudad;
    }

    public Evento() {
        this.nombre = "";
        this.fechaHoraI = new GregorianCalendar();
        this.fechaHoraF = new GregorianCalendar();
        this.descripcion = "";
        this.ubicacion = "";
        this.ciudad = new Ciudad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaHoraI() {
        return fechaHoraI;
    }

    public void setFechaHoraI(Calendar unaFechaHoraI) throws Exception{
        Calendar aux = (Calendar) unaFechaHoraI.clone();
        Calendar c = soloFecha(Calendar.getInstance());
        aux = soloFecha(aux);
        
        if (aux.compareTo(c) >= 0) {
            c = Calendar.getInstance();
            if (unaFechaHoraI.compareTo(c) >= 0) {
                this.fechaHoraI = unaFechaHoraI;


            } else {
                throw new Exception ("El evento esta programado para hoy, entonces la hora de inicio debe ser mayor a la actual.");
                
            }

        } else {
            throw new Exception ("La fecha de inicio del evento debe ser la actual o una futura.");
            
        }
    }

    public Calendar getFechaHoraF() {
        return fechaHoraF;
    }

    public void setFechaHoraF(Calendar fechaHoraI, Calendar fechaHoraF) throws Exception{
        Calendar auxFInicio = (Calendar) fechaHoraI.clone();
        Calendar auxFFin = (Calendar) fechaHoraF.clone();

        auxFInicio = soloFecha(auxFInicio);
        auxFFin = soloFecha(auxFFin);

        if (auxFInicio.compareTo(auxFFin) <= 0) {

            if (fechaHoraI.compareTo(fechaHoraF) <= 0) {
                this.fechaHoraF = fechaHoraF;
            } else {
                throw new Exception("La hora de finalización debe ser mayor a la hora de inicio del evento."); 
            }
        } else {
            throw new Exception("La fecha final debe ser mayor a la fecha de inicio.");
        }
    }
    
      public Calendar soloFecha(Calendar f) {
        f.set(Calendar.HOUR, 0);
        f.set(Calendar.HOUR_OF_DAY, 0);
        f.set(Calendar.MINUTE, 0);
        f.set(Calendar.SECOND, 0);
        f.set(Calendar.MILLISECOND, 0);

        return f;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        String fI = formatter.format(fechaHoraI.getTime());

        return fI + " - " + nombre + " (" + ubicacion + ")";
    }
    
    public String horaInicioToString() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        String fI = formatter.format(fechaHoraI.getTime());

        return fI;
    }
    
    public String fechaInicioToString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fI = formatter.format(fechaHoraI.getTime());

        return fI;
    }
    
    public String horaFinToString() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        String fI = formatter.format(fechaHoraF.getTime());

        return fI;
    }
    
    public String fechaFinToString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fI = formatter.format(fechaHoraF.getTime());

        return fI;
    }

    @Override
    public boolean equals(Object obj) {
        boolean valido = false;
        Evento ev = (Evento) obj;
        if (ev.getNombre().equalsIgnoreCase(this.getNombre())) {
            valido = true;
        }
        
        return valido;
    }
    
    @Override
    public int compareTo(Evento e){
        return fechaHoraI.compareTo(e.getFechaHoraI());
    }
}

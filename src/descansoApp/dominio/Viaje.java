package descansoApp.dominio;

import java.io.Serializable;
import java.util.*;
import java.text.SimpleDateFormat;


public class Viaje implements Serializable {

    private String nombre;
    private Calendar fechaI;
    private Calendar fechaF;
    private ArrayList<Evento> itinerario;

    public Viaje() {
        nombre = "";
        fechaI = new GregorianCalendar();
        fechaF = new GregorianCalendar();
        itinerario = new ArrayList<>();
    }

    public Viaje(String unNombre, Calendar unaFInicio, Calendar unaFFinal) {
        nombre = unNombre;
        fechaI = unaFInicio;
        fechaF = unaFFinal;
        itinerario = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaI() {
        return fechaI;
    }

    public void setFechaI(Calendar fechaI) throws Exception {
        Calendar c = soloFecha(Calendar.getInstance());

        if (fechaI.compareTo(c) > 0) {
            this.fechaI = fechaI;

        } else {
            throw new Exception("La fecha de inicio del viaje debe ser la actual o una futura.");

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

    public Calendar getFechaF() {
        return fechaF;
    }

    public void setFechaF(Calendar fechaI, Calendar fechaF) throws Exception {
        Calendar fI = soloFecha(fechaI);
        Calendar fF = soloFecha(fechaF);

        if (fI.compareTo(fF) <= 0) {
            this.fechaF = fechaF;

        } else {
            throw new Exception("La fecha final debe ser mayor a la fecha de inicio.");

        }
    }

    public ArrayList<Evento> getItinerario() {
        return itinerario;
    }

    public void agregarEvento(Evento unEvento) throws Exception {
        if (itinerario.contains(unEvento)) {
            throw new Exception("El nombre del evento ya existe. Por favor ingrese uno nuevo.");
        }
        itinerario.add(unEvento);

    }

    public boolean eliminarEvento(Evento unEvento) {
        return itinerario.remove(unEvento);
    }

    public boolean pertenece(Evento unEvento) {
        return itinerario.contains(unEvento);
    }

    @Override
    public String toString() {
        String ret = "";
        ret = nombre;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fI = formatter.format(fechaI.getTime());
        String fF = formatter.format(fechaF.getTime());

        ret += " (" + fI + " - " + fF + ")";

        return ret;
    }
    
    public String fechaToString() {
        String ret = "";

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String fI = formatter.format(fechaI.getTime());
        String fF = formatter.format(fechaF.getTime());

        ret += " (" + fI + " - " + fF + ")";

        return ret;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ret = false;
        Viaje v2 = (Viaje) obj;

        if (nombre.equalsIgnoreCase(v2.getNombre())) {
            ret = true;
        }

        return ret;
    }
}

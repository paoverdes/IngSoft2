package descansoApp.herramientas;

import java.util.ArrayList;
import java.util.Iterator;
import descansoApp.dominio.Ciudad;

public class Buscador {

    public ArrayList<Ciudad> ciudades;

    public Buscador(ArrayList<Ciudad> lista) {
        ciudades = lista;
    }

    public ArrayList<Ciudad> buscar(String palabra) {
        palabra = palabra.toLowerCase();
        palabra = palabra.trim();
        ArrayList<Ciudad> ret = new ArrayList<>();

        Iterator<Ciudad> it = ciudades.iterator();
        while (it.hasNext()) {
            Ciudad c = it.next();

            String s = c.getNombre();
            s = s.toLowerCase();
            s = s.trim();
            if (s.contains(palabra)) {
                ret.add(c);
            } else {
                s = c.getDescripcion();
                s = s.toLowerCase();
                s = s.trim();
                if (s.contains(palabra)) {
                    ret.add(c);
                } else {
                    s = c.getInfoGral();
                    s = s.toLowerCase();
                    s = s.trim();
                    if (s.contains(palabra)) {
                        ret.add(c);
                    }
                }
            }
        }

        return ret;
    }
}

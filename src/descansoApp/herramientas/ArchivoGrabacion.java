package descansoApp.herramientas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoGrabacion {

    private BufferedWriter out;

    public ArchivoGrabacion(String unNombre) throws IOException {
        out = new BufferedWriter(new FileWriter(unNombre));
    }

    public void grabarLinea(String linea) throws IOException {
        out.write(linea);
        out.newLine();
    }

    public void cerrar() throws IOException {
        out.flush();
        out.close();
    }
}

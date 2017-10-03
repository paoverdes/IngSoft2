package descansoApp.herramientas;

import java.io.*;
import javax.swing.JOptionPane;

public class ArchivoLectura {
    private BufferedReader in;
    private String linea;
    
    public ArchivoLectura (String unNombre){
        try {
            in = new BufferedReader(new FileReader(unNombre));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: No se encuentra el archivo.", "No hay archivo!", 3);
        }
    }
    
    public boolean hayMasLineas() {
        try {
            linea = in.readLine();
        } catch (IOException e) {
            linea = null;
        }
        
        return linea != null;
    }
    
    public String linea(){
        return linea;
    }
    
    public boolean cerrar(){
        boolean ok = true;
        
        try {
            in.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo cerrar el archivo.", "Cerrar Archivo", 3);
            ok = false;
        }
        
        return ok;
    }
}
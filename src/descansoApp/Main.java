package descansoApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import descansoApp.dominio.Ciudad;
import descansoApp.dominio.Sistema;
import descansoApp.interfaz.Principal;
import descansoApp.interfaz.pnlInicio;

public class Main {

    public static Sistema modelo;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        modelo = cargarModelo();
      
        Principal p = new Principal(modelo);
        p.add(new pnlInicio(modelo, p));
        p.pack();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }

    //Método para cargar el sistema
    public static Sistema cargarModelo() throws IOException {
        Sistema unModelo;

        try {
            //Intento recuperar los datos guardados
            FileInputStream archivo = new FileInputStream("Sistema");
            ObjectInputStream leer = new ObjectInputStream(archivo);

            unModelo = (Sistema) leer.readObject();
            leer.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            //Si no puedo abrir el archivo, creo un modelo nuevo
            unModelo = new Sistema();

            ArrayList<Ciudad> cdads = Informacion.ciudades();
            for (int i=0; i < cdads.size(); i++)
                unModelo.agregarCiudad(cdads.get(i));
        }

        return unModelo;
    }

    //Metodo encargado de guardar los datos de esta sesión para poder recuperarlos luego
    public static void guardarModelo(Sistema unModelo) throws IOException {
        FileOutputStream archivo = new FileOutputStream("Sistema");
        ObjectOutputStream grab = new ObjectOutputStream(archivo);

        grab.writeObject(unModelo);
        grab.close();
    }
}

package descansoApp.herramientas;

public class EsNumero {
    
    public static boolean esNumero(String texto) {
        boolean correcto;
        int num;

        try {
            num = Integer.parseInt(texto);
            correcto = true;
        } catch (NumberFormatException e) {
            correcto = false;
        }

        return correcto;
    }
}

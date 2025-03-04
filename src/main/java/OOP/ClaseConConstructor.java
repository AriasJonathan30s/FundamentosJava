
package OOP;

/**
 *
 * @author jonathan.arias
 */
public class ClaseConConstructor {
    int inicio;
    int fin;
    
    
    public ClaseConConstructor(){
        inicio = 0;
        fin = 20;
        System.out.println("Ejecuta constructor vaicio");
    }
    
    public String llama(boolean llamando){
        String isCalling = llamando ? "Si" : "No";
        return isCalling;
    }
    
    public int tiempoLlamada(){
        int result = inicio + fin;
        return result;
    }
    
}

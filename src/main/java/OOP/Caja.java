
package OOP;

import java.nio.file.ProviderNotFoundException;

/**
 *
 * @author jonathan.arias
 */
public class Caja {
    
    private int alto, ancho, profundidad;
    
    public Caja (){
        alto = 2;
        ancho = 3;
        profundidad = 6;
    }
    public Caja (int alto, int ancho, int profundidad){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }
    
    public int volumen(){
        return this.alto * this.ancho * this.profundidad;
    }
    
}


package Palabras;

/**
 *
 * @author jonathan.arias
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Jonathan");
    }
}

class Persona {
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre;
        System.out.println("Operador this en persona: "+this); // Imprime el nombre del objeto y el lugar de la memoria
        Imprimir accion = new Imprimir();
        accion.imprimir(this); // Contiene referencia al objeto persona
    }
}

class Imprimir {
    public void imprimir(Persona p){
        System.out.println("Argumento persona en Imprimir: "+p); // Imprime el nombre del objeto y el lugar en la memoria
        System.out.println("This en Imprimir: "+this); // Contiene referencia al objeto Imprimir
    }
}
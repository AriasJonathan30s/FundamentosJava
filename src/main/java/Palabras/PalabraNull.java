
package Palabras;

/**
 *
 * @author jonathan.arias
 */
public class PalabraNull {
    public static void main(String[] args) {
        
        PersonaNull persona1 = new PersonaNull("Jonathan");
        System.out.println("Persona 1: "+ persona1.getName());
        PersonaNull persona2 = persona1;
        System.out.println("Persona 2 igual a persona 1: "+ persona2.getName());
        persona1 = null;
        if (persona1 != null) {
            System.out.println("Persona 1: "+ persona1.getName());
        } else {
            System.out.println("Persona 1 en null: ");
            // Tiene error (null pointer exception) porque null ya no apunta a ningun objeto
            // Pero si se agrega en este if, arreglamos el error
        }
        
        //Metodo garbage collector (gc)
        System.gc();
    }
}

class PersonaNull {
    String nombre;

    public PersonaNull(String nombre) {
        this.nombre = nombre;
    }
    
    public String getName(){
        return this.nombre;
    }
}

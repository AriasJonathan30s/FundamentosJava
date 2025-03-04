
package PasosParametros;

/**
 *
 * @author jonathan.arias
 */
public class Main {
    public static void main(String[] args) {
        
        // Curso Paso por Valor
        var x = 10;
        System.out.println("x Inicial: "+x);
        cabiarValor(x);
        System.out.println("x Terminal: "+x);
        
        // Curso Paso por Referencia
        String nombre = "Jonathan";
        PasoPorReferencia persona = new PasoPorReferencia();
        persona.setNombre(nombre);
        imprime(persona);
        modificaPersona(persona);
        imprime(persona);
        persona = new PasoPorReferencia(); // Asignando null o asignando nueva referencia pierde la referencia.
    }
    
    private static void cabiarValor(int getX){
        getX = 20;
        System.out.println("Metodo CambiarValor cambia x en metodo: "+ getX);
    }

    private static void imprime(PasoPorReferencia persona) {
        System.out.println("Nombre: "+persona.getNombre());
    }

    private static void modificaPersona(PasoPorReferencia persona) {
        persona.setNombre("Ricardo");
    }
}


package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class Variables {
    /**
     * Los datos Primitivos son los: Enteros y Flotantes
     * primitivos en java enteros: byte, short, char, long.
     * primitivos en java flotantes: float, double
     * Los datos referenciados (tipo Object) son: Clases, interfaces y arreglos.
     */
    
    public static String saludo = "Hola Mundo!";
    public static String nString = new String();
    // Comparador: saludo.equals("Hola Mundo!");
    // Concatenacion: nString.concat("Agregado");
    public static void main(String[] args) {
        //System.out.println("Saludos");
        System.out.println("Saludos");
        System.out.println("Saludos");
        
        // Asignando valores a una variable
        String saludar = "Saludos var";
        System.out.println(saludar);
        // Otra forma de llamar a una variable es var, pero infiere en automatico el tipo y no puede cambiar el tipo.
        var variable = "hasta luego";
        System.out.println(variable);
        var entero = 1;
        System.out.println(entero);
    }
}

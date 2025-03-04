
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class TiposPrimitivosBooleans {
    // Curso tipo primitivo booleano
    public static void main(String[] args) {
        System.out.println("true tipo boolean: "+ Boolean.TRUE);
        System.out.println("false tipo boolean: "+Boolean.FALSE);
        
        boolean booleanVar = true;
        
        if (booleanVar == true) {
            System.out.println("booleanVar es: "+booleanVar);
            // verdadero
        } else {
            System.out.println("booleanVar es: "+booleanVar);
            // falso
        }
        // Tambien se puede escribir
        if (booleanVar) {
            System.out.println("booleanVar es: "+booleanVar);
            // verdadero
        } else {
            System.out.println("booleanVar es: "+booleanVar);
            // falso
        }
        
        System.out.println("");
        
        var edad = 10;
        var esAdulto = edad >= 18;
        
        System.out.println("es adulto? "+esAdulto);
        // en caso de que var edad sea 18 o mayor, var esAdulto sera true, de lo contrario var esAdulto sera falso.
    }
}

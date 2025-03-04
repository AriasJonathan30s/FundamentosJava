
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class Etiquetas {
    // Curso Etiquetas
    public static void main(String[] args) {
         /**
        inicio:
        for (int i = 0; i < 3; i++) {
            // Imprime solo numeros pares
            if (i % 2 == 0) {
                System.out.println("i = "+i);
                break inicio;
            }
        }
        */
        
        inicio:
        for (int i = 0; i < 3; i++) {
            // Imprime solo numeros pares
            if (i % 2 != 0) {
                continue inicio;
            }
            System.out.println("i = "+i);
        }
    }
}

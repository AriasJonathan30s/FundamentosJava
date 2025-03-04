
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class PalabrasBreakContinue {
    // Palabras Break y Continue
    public static void main(String[] args) {
        /**
        for (int i = 0; i < 3; i++) {
            // Imprime solo numeros pares
            if (i % 2 == 0) {
                System.out.println("i = "+i);
                break; // Si el remamente es 0, entonces entra y rompe el ciclo.
            }
        }
        */
        
        
        for (int i = 0; i < 3; i++) {
            // Imprime solo numeros pares
            if (i % 2 != 0) {
                continue; // Continue va a saltar la linea de codigo de abajo en la iteración y no la va a imprimir pero continuará iterando.
            }
            System.out.println("i = "+i);
        }
        
    }
}

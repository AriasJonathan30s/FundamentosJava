
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class OperadoresCondicionales {
    // Curso Operador de condicionales
    public static void main(String[] args) {
        // Reciben 2 argumentos de tipo boolean ejemplo

        // && conocido como and
        int a = 10;
        int minVal = 0, maxVal = 10;
        boolean res = a >= minVal && a <= maxVal;
        System.out.println(a+" es mayor que "+minVal+" y menor que "+maxVal+"? "+res);
        a = -1;
        res = a >= minVal && a <= maxVal;
        System.out.println(a+" es mayor que "+minVal+" y menor que "+maxVal+"? "+res);
        a = 15;
        res = a >= minVal && a <= maxVal;
        System.out.println(a+" es mayor que "+minVal+" y menor que "+maxVal+"? "+res);
        
        // || conocido como or
        boolean vacations = false;
        boolean dayOff = false;
        if (vacations || dayOff) {
            System.out.println("Puede ir al juego del hijo");
        } else {
            System.out.println("No puede ir al juego del hijo");
        }
        
        vacations = true;
        dayOff = false;
        if (vacations || dayOff) {
            System.out.println("Puede ir al juego del hijo");
        } else {
            System.out.println("No puede ir al juego del hijo");
        }
        
        vacations = false;
        dayOff = true;
        if (vacations || dayOff) {
            System.out.println("Puede ir al juego del hijo");
        } else {
            System.out.println("No puede ir al juego del hijo");
        }
    }
}

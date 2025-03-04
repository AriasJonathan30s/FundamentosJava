
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class IteradoresCicloDoWhile {
    // Curso ciclo Do While
    public static void main(String[] args) {
        boolean repeat = true;
        int index = 0;
        do {            
            System.out.println("repeat: "+repeat);
            if (index == 3) {
                repeat = false;    
            }
            index++;
        } while (repeat);
        System.out.println("repeat: "+repeat+ ", index: "+index);
    }
}

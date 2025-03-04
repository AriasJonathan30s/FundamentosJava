
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class IteradoresCicloWhile {
    // Curso ciclo while
    public static void main(String[] args) {
        boolean repeat = true;
        int index = 0;
        while (repeat) {
            System.out.println("repeat: "+repeat);
            if (index == 3) {
                repeat = false;    
            }
            index++;
        }
        System.out.println("repeat: "+repeat+ ", index: "+index);
    }
}

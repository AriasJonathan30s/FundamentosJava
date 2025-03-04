
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class IteradoresCicloFor {
    // Curso for
    public static void main(String[] args) {
        int nacimiento = 1988;
        int hoy = 2025;
        int comparador = 0;
        System.out.println("nacimiento: "+nacimiento);
        System.out.println("hoy: "+hoy);
        System.out.println("comparador: "+comparador);
        for (int i = nacimiento; i < hoy; i++) {
            System.out.println("i: "+i);
            comparador+=1;
            System.out.println("comparador: "+comparador);
        }
        System.out.println("Tienes "+comparador+"años");
    }
}

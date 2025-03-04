
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class OperadoresUnarios {
    // Curso operadores unarios
    public static void main(String[] args) {
        
        int a =3;
        System.out.println("a: "+a);
        // Operador de inversion de signo
        int b = -a;// Resultara el negativo de a.
        System.out.println("b: "+b);
        
        boolean c = true;
        System.out.println("c: "+c);
        // tambien conocido como operador de complemento
        boolean d = !c; // resulta lo opuesto al valor actual.
        System.out.println("d: "+d);
        
        // incremento
        // preincremento
        int e = 3;
        int f = ++e; // Esto significa que los signos suman 1, o sea, se incrementa el valor de e en 1
        System.out.println("e: "+ e);
        System.out.println("f: "+ f);
        
        //postincremento
        int g = 5;
        int h = g++; // Esto significa que los signos suman uno, o sea, se asigna la letra g en h y g incrementa en 1.
        System.out.println("g: "+g);
        System.out.println("h: "+h);
        
        // predecremento
        int i = 2;
        int j = --i; // decrementa i antes de asignarse a j
        System.out.println("predecremento i: "+i);
        System.out.println("predecremento j: "+j);
        
        //postdecremento
        int k = 2;
        int l = k--; // decreementa k despues de signarse a l
        System.out.println("postdecremento k: "+k);
        System.out.println("postdecremento l: "+l);
        
    }
}

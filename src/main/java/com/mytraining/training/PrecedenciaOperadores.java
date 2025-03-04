
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class PrecedenciaOperadores {
    // Curso precedencia de operadores
    public static void main(String[] args) {
        // Ejemplo 1
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        // Antes de ejecutar, cual es el valor de variable z? 16
        
        System.out.println("x = "+x); // 6
        System.out.println("y= "+y); // 9
        System.out.println("z= "+z); // 16
        
        // Ejemplo 2
        var resultado = 4 + 5 * 6 / 3; // Se desarrolla 4+(5*6)/3 = 4+(30/3)= 4+10 = 14
        System.out.println("resultado: "+resultado);
        
        resultado = (4+5)*6/3; // Suma primero, luego la multiplicación y luego la division
        System.out.println("resultado: "+resultado);
        
        resultado = (++x+5)*6/3;
        System.out.println("resultado: "+resultado);
    }
}


package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class OperadoresIgualdadYRelacionales {
    // Curso Operadores de igualdad y relacionales
    public static void main(String[] args) {
        
        int a =3, b=2, c=3;
        // En tipos primitivos
        //Operadores de igualdad
        // == Significa si son iguales
        boolean d = (a == b);
        System.out.println("a y b es igual? "+d);
        d = (a == c);
        System.out.println("a y c es igual? "+d);
        
        // != significa si uno es diferente de otro
        boolean e = (a != b);
        System.out.println("a es diferente de b? "+e);
        e = (a != c);
        System.out.println("a es diferente de c? "+e);
        
        // Operadores Relacionales
        boolean f = a<b;
        System.out.println(a+" es menor que "+b+"? "+f);
        f = a>b;
        System.out.println(a+" es mayor que "+b+"? "+f);
        f = a>=b;
        System.out.println(a+" es mayor que "+b+"? "+f);
        f = a<=c;
        System.out.println(a+" es menor que "+c+"? "+f);
        
        //Comprobacion
        if (b % 2 == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero inpar");
        }
        
        int edad = 18;
        int adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es adulto");
        } else {
            System.out.println("Es menor de edad");
        }
        
        // En tipos no primitivos
        String cadena1 = "hola";
        String cadena2 = "adios";
        System.out.println( cadena1.equals(cadena2) );
        System.out.println( !cadena1.equals(cadena2) );
        
        
        
        
        
        
        
        
    }
}

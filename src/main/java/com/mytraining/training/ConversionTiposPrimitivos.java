
package com.mytraining.training;

import java.util.Scanner;

/**
 *
 * @author jonathan.arias
 */
public class ConversionTiposPrimitivos {
    // Curso conversion tipos primitivos
    public static void main(String[] args) {
        // Convertir un String a un tipo int
        int edad = Integer.parseInt("20");
        System.out.println("edad: "+edad);
        // Imprime el valor convertido de string a Int.
        
        var variableEdad = edad;
        System.out.println("variableEdad: "+variableEdad);
        // Imprime el valor de la variable que detectó de igual manera que el valor int edad.
        
        double valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi: "+valorPi);
        // Imprime en valor convertido de string a double
        
        // String tiene muchos caracteres y char tiene un solo caracter.
        char c = "hola".charAt(0);
        System.out.println("c: "+c);
        // Imprime el valor del indice 0 de la cadena de carateres Hola alojada en variable c, lo que imprime "h".
        
        //Usando metodo scanner obtendremos un valor string y lo convertiremos en int.
        var scanner = new Scanner(System.in);
        int getEdad = Integer.parseInt(scanner.nextLine());
        System.out.println("getEdad: "+getEdad);
        // Convierte la edad obtenida del scanner en un integer
        
        // Recuperando un caracter
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter en indice 0: "+caracter);
        // Obtiene caracter del inidice que esta en charAt y lo imprime.
        
        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto: "+edadTexto);
        // Obtiene el valor entero y lo convierte a string.
        
        String isTrue = String.valueOf(true);
        System.out.println("isTrue? "+isTrue);
        // Obtiene el valor booleano y lo convierte a string.
        
        short s = 10;
        byte b = (byte) s;
        int i = s;
        // El tipo byte no cabe del tipo short porque short tiene mas bites(16) que el byte(8), en cuanto al int, si se puede.
        // Pero se puede convertir el short a byte pero puede perder bits en su conversion.
        System.out.println("b: "+b);
    }
}

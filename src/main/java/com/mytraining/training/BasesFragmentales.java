
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class BasesFragmentales {
    // Este curso es para entender las bases Decimal, Hexadecimal y Octal
    public static void main(String[] args) {
        
        int numeroDecimal = 10;
        System.out.println("numeroDecimal: "+numeroDecimal);
        // Escribe el numero de manera decimal
        
        int numeroOctal = 012;
        System.out.println("numeroOctal: "+numeroOctal);
        // Escribe el numero 10 debido al formato octal con tantos 0s tiene a la izquierda.
        
        int numeroHexadecimal = 0xA;
        System.out.println("numeroHexadecimal: "+ numeroHexadecimal);
        // Escribe el numero 10 por el formato 0x y la letra sea minuscula o mayuscula "a"
        // La letra B seria 11, la letra C seria 12, la letra D seria 13...
        
        int numeroBinario = 0b1010;
        System.out.println("numeroBinario: "+numeroBinario);
        // Escribe el numero 10 siendo numero binario.
        
        var numerioVariable = numeroDecimal;
        // La declaración var es aplicable en cualquiera de estos formatos.
    }
}

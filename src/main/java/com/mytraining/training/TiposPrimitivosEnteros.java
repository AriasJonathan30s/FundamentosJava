
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class TiposPrimitivosEnteros {
    // Tipos primitivos de tipo entero
    // son byte, short, int, long
    public static void main(String[] args) {
        // byte byteVar = 150;  marca error por posible perdida en conversion de int a byte
        byte byteVar = 15;
        System.out.println("byteVar: "+byteVar);
        // Imprime el valor asignado en la variable
        System.out.println("bits tipo de bytes: "+ Byte.SIZE);
        // Imprime la cantidad de bits en un byte
        System.out.println("bytes tipo byte: "+ Byte.BYTES);
        // Imprime la cantidad de bytes del byte
        System.out.println("valor minimo tipo byte: "+ Byte.MIN_VALUE);
        // El valor minimo de tipo byte
        System.out.println("valor maximo tipo byte: " + Byte.MAX_VALUE);
        // El valor maximo de tipo byte y ese es el motivo del cual byteVar no puede asignarse mayor a 127, mucho menos 150.
        
        short shortVar = 1000;
        System.out.println("shortVar: "+shortVar);
        // Imprime el valor de shortvar en 1000 y funciona correctamente.
        System.out.println("bits tipo de short: "+ Short.SIZE);
        // Imprime la cantidad de bits en un short "16"
        System.out.println("bytes tipo short: "+ Short.BYTES);
        // Imprime la cantidad de bytes del short "2"
        System.out.println("valor minimo tipo short: "+ Short.MIN_VALUE);
        // El valor minimo de tipo short "-32768"
        System.out.println("valor maximo tipo short: " + Short.MAX_VALUE);
        // El valor maximo de tipo short "32767" de pasar este numero, habra error
        
        int intVar = 5000;
        System.out.println("intVar: "+intVar);
        // Imprime el valor de intVar en 5000 y funciona correctamente.
        System.out.println("bits tipo de int: "+ Integer.SIZE);
        // Imprime la cantidad de bits en un int "32"
        System.out.println("bytes tipo int: "+ Integer.BYTES);
        // Imprime la cantidad de bytes del int "4"
        System.out.println("valor minimo tipo int: "+ Integer.MIN_VALUE);
        // El valor minimo de tipo int "-2147483648"
        System.out.println("valor maximo tipo int: " + Integer.MAX_VALUE);
        // El valor maximo de tipo int "2147483647" de pasar este numero, habra error
        
        long longVar = 80000;
        System.out.println("long: "+longVar);
        // Imprime el valor de intVar en 5000 y funciona correctamente.
        System.out.println("bits tipo de long: "+ Long.SIZE);
        // Imprime la cantidad de bits en un long "64"
        System.out.println("bytes tipo long: "+ Long.BYTES);
        // Imprime la cantidad de bytes del long "8"
        System.out.println("valor minimo tipo long: "+ Long.MIN_VALUE);
        // El valor minimo de tipo long "-9223372036854775808"
        System.out.println("valor maximo tipo long: " + Long.MAX_VALUE);
        // El valor maximo de tipo long "9223372036854775807" de pasar este numero, habra error
        
        //Que pasaria si hay un numero mas grande que estos?
        // Usar el metodo getClass() getSimpleName(), no pueden ser derefenciados debido a que son primitivos
        // y el tipo primitivo mas largo que hay es el long, por ende se tiene que hacer uso de numero no primitivos como BigInt.
        var numero = 127;
        System.out.println("numero: "+numero);
        
    }
}

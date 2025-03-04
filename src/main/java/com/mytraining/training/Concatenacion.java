
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class Concatenacion {
    public static void main(String[] args){
        var usuario = "Jon";
        String saludo = "Hola";
        
        System.out.println(saludo + usuario);
        System.out.println(saludo.concat(usuario));
        // Resultado HolaJuan
        
        System.out.println(saludo + " " + usuario);
        System.out.println(saludo.concat(" "+ usuario));
        // Resultado Hola Juan
        
        var tres = 3;
        int cinco = 5;
        
        System.out.println(tres + cinco);
        // Resultado de la suma de los dos 3+5 = 8
        
        System.out.println(usuario+tres+cinco);
        // Resultado en concatenación de los dos numeros y un string
        
        System.out.println(tres+cinco+usuario);
        // Resultado suma primero los valores numero y luego concatena el string.
        
    }
}

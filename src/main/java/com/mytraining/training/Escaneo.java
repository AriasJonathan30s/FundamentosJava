
package com.mytraining.training;

import java.util.Scanner;

/**
 *
 * @author jonathan.arias
 */
public class Escaneo {
    
    public static void main(String[] args) {
        // Scanner es un comando para solicitar informacion de la consola.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa nombre de usuario");
        String usuario = scanner.nextLine();
        System.out.println("Usuario = "+ usuario);
        
        
    }
    
}

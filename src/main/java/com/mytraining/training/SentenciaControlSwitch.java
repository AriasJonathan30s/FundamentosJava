
package com.mytraining.training;

import java.util.Scanner;

/**
 *
 * @author jonathan.arias
 */
public class SentenciaControlSwitch {
    // Curso sentencia de control Switch
    public static void main(String[] args) {
        int opcion = 3;
        // Soporta byte, short, int, char o String
        var scanner = new Scanner(System.in);
        System.out.println("Del 0 al 3 cuanto te gusto?");
        opcion = scanner.nextInt();
        String eleccion = null;
        
        
        switch (opcion) {
            case 0:
                eleccion = "nada";
                break;
            case 1:
                eleccion = "poco";
                break;
            case 2:
                eleccion = "aceptable";
                break;
            case 3:
                eleccion = "mucho";
                break;
            default:
                eleccion = "Sin contestar";
                
        }
        System.out.println("Elegiste: "+eleccion);
        
        // Ejercicio 2
        
        System.out.println("Ingresa el numero del mes del año");
        var mes = scanner.nextInt();
        String estacion = null;
        
        switch (mes) {
            case 1:case 2:case 12:
                estacion = "Invierno";
                break;
            case 3:case 4:case 5:
                estacion = "Primavera";
                break;
            case 6:case 7:case 8:
                estacion = "Verano";
                break;
            case 9:case 10:case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes es incorrecto";
        }
        System.out.println("El mes "+mes+" esta en la estacion de "+estacion);
        
    }
}

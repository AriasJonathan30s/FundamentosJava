
package com.mytraining.training;

import java.util.Scanner;

/**
 *
 * @author jonathan.arias
 */
public class SentenciaControlIf {
    // Curso sentencia de control If
    public static void main(String[] args) {
        boolean booleano = true;
        if (booleano) {
            System.out.println("booleano: "+booleano);
        } else {
            System.out.println("booleano: "+booleano);
        }
        
        int opcion = 2;
        
        if (opcion == 0) {
            System.out.println("Eligio la opcion: "+opcion);
        }
        else if(opcion == 1) {
            System.out.println("Eligio la opcion: "+opcion);
        }
        else if (opcion == 2){
            System.out.println("Eligio la opcion: "+opcion);
        }
        else {
            System.out.println("Eligio la opcion: "+opcion);
        }
        
        
        var mes = 9; // Septiembre, mes del año
        String estacion = null;
        System.out.println("Proporciona el numero del mes");
        var scanner = new Scanner(System.in);
        mes = scanner.nextInt(); // Elige el mes en numero
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        }
        else if(mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        } else {
            estacion = "Mes es incorrecto";
        }
        
        System.out.println("El mes "+mes+" esta en la estacion de "+estacion);
        
    }
}

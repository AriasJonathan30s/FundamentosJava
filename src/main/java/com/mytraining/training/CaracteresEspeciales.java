
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class CaracteresEspeciales {
    
    public static void main(String[] args) {
        // Caracteres especiales
        
        // puede usarse String o var.
        String nombre = "Karla";
        String apellido = "Esparza";
        
        System.out.println(nombre + " " + apellido); // El espacio " " es uno de los caracteres que se pueden utilizar
        System.out.println("Comilla simple: '"+ nombre + "'"); // muestra las comillas simples en la consola.
        // Estos son caracteres especiales
        
        System.out.println("Nueva linea: \n" + nombre); // el caracter \n es una nueva linea en la consola (enter)
        System.out.println("Tabulador: \t"+nombre); // el caracter \t es un espacio tab o tabulador.
        System.out.println("Retroceso: \b"+ nombre); // el caracter \b es un backspace y se pueden adjuntar mas \b.
        System.out.println("Retorno en carro: \r"+nombre); // se comporta muy similar en una nueva linea pero depende del sistema operativo.
        System.out.println("Comilla simple: \'"+ nombre + "\'"); // muestra las comillas simples en la consola.
        System.out.println("Comilla doble: \""+nombre + "\""); // muestra las comillas dobles sin tronar
        // Estos caracteres especiales se llaman caracteres de escape.
        
        System.out.println("saludos"); // println significa print lane, lo que imprime y manda a que la siguiente impresion vaya a otra linea.
        System.out.print("adios"); // print no manda a que sea la siguiente linea, y la siguiente impresion mantiene en la misma linea.
        System.out.println(" cuidense"); // comprueba el argumento anterior.
    }
}

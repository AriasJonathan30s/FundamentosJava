
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class ReglasDefinicionVariable {
    
    public static void main(String[] args){
        // Reglas para la definicion variable 
        
        String defStrSaludos = "Hola desde Java";
        var defvarSaludos = "Hola desde Java";
        // El identificador de camello, tiene varias palabras juntas con la inicial en cada palabra.
        // Puede definirse tambien de las siguientes maneras
        float _hola;
        String $adios;
        int adios;
        // Declarar var con identificador pero sin valor, genera error porque requiere definirlo con un dato.
        char val0out;
        String string2out;
        // Se puede declarar al identificador con un caracter especial pero nunca al inicio.
        // Los identificadores no pueden coincidir con los nombres de funciones como while, for, if, else, etc.
    }
}

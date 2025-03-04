
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class TipoChar {
    // Curso tipo char
    public static void main(String[] args) {
        
        System.out.println("bite tipo Character: "+ Character.SIZE);
        // el tamaño del Character en bites es 16
        System.out.println("bytes tipo Character: "+ Character.BYTES);
        // el tamaño de Character en bytes 2
        System.out.println("valor minimo tipo Character: "+ Character.MIN_VALUE);
        // el minimo del Character es null
        System.out.println("valor maximo tipo Character: "+ Character.MAX_VALUE);
        // el maximo del Character es ?
        
        char varChar = 'a';
        System.out.println("varChar: "+varChar);
        // muestra la letra a en caracteres unicode del sistema operativo, puede cambiar segun el sistema operativo.
        char varCharUnicode = '\u0021';
        System.out.println("varCharUnicode: "+varCharUnicode);
        // uno de los valores unicode seria \u0021.
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal: "+varCharDecimal);
        // muestra el valor de la cadena de caracteres perteneciente al caraccter decimal.
        
        char varCharSimbolo = '!';
        // muestra el simbolo como es en la consola.
        
        var variableChar = varCharUnicode;
        // var puede aun respetar los valores establecidos
    }
}

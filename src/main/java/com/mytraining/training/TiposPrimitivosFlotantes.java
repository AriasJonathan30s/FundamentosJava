
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class TiposPrimitivosFlotantes {
    // Curso de tipos primitivos de tipo flotante
    public static void main(String[] args) {
        
        float floatVar = 1000;
        System.out.println("floatVar: "+floatVar);
        // Imprime el valor, pero si se agrega un punto decimal con numeros, el sistema generara el error de que
        // se pueda perder informacion porque con puntos decimales seria double.
        // Para definirla como float se tiene que poner una F en su valor asignado a la variable.
        float floatDecimalVar = 1000.10F;
        System.out.println("floatVar: "+floatDecimalVar);
        
        var variableFloat = floatDecimalVar;
        // var aun puede auto asignar el valor de la variable.
        
        System.out.println("bite tipo float: "+ Float.SIZE);
        // el tamaño del float en bites
        System.out.println("bytes tipo float: "+ Float.BYTES);
        // el tamaño de float en bytes
        System.out.println("valor minimo tipo float: "+ Float.MIN_VALUE);
        // el minimo del float es "1.4E-45" Exponencial 45
        System.out.println("valor maximo tipo float: "+ Float.MAX_VALUE);
        // el maximo del float es "3.4028235E38" Exponencial 38
        
        double doubleVar = 100.10;
        // Se puede poner el decimal double con los numeros directamente sin generar error
        System.out.println("doubleVar: "+doubleVar);
        double doubleDef = 100D;
        // Con esta forma tambien se puede definir el decimal double
        
        var variableDouble = doubleDef;
        
        System.out.println("bite tipo double: "+ Double.SIZE);
        // el tamaño del double en bites
        System.out.println("bytes tipo double: "+ Double.BYTES);
        // el tamaño de double en bytes
        System.out.println("valor minimo tipo double: "+ Double.MIN_VALUE);
        // el minimo del double es "4.9E-324" exponencial -324
        System.out.println("valor maximo tipo double: "+ Double.MAX_VALUE);
        // el maximo del double es "1.7976931348623157E308" exponencial 308
    }
}

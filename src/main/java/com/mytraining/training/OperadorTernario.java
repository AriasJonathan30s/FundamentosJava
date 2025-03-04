
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class OperadorTernario {
    // Curso operador ternario
    public static void main(String[] args) {
        // Es un operador condicional para estructurar if else
        
        var resultado = 3>2 ? true : false;
        System.out.println("resulstado: "+resultado);
        
        resultado = 3<2 ? true : false;
        System.out.println("resulstado: "+resultado);
        
        var res = 17>=18 ? "Si" : false;
        System.out.println("Mayor de edad?: "+res);
        
        int numero = 7;
        var par = numero %2 == 0 ? "numero par":"numero impar";
        System.out.println("es: "+par);
    }
}

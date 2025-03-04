
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class OperadoresAritmeticos {
    // Curso operadores Aritmeticos
    public static void main(String[] args) {
        int a=3, b=2;
        // La declaracion de variables del mismo tipo es permitido, a excepcion de var.
        
        int resultado = a + b;
        System.out.println("resultado de la suma de a y b: "+resultado);
        // Imprime la usma a+b, o sea 3+2 = 5
        
        System.out.println("Resultado de la suma de a y b: " + a + b);
        // Imprime la concatenación de los numeros ya que comienza con un string
        
        System.out.println("Resultado de la suma de a y b: " + (a + b));
        // Imprime la concatenación de el resultado de las dos variables
        
        resultado = a - b;
        System.out.println("Resultado de la resta de a menos b: "+ resultado);
        // Imprime el resultado
        
        // System.out.println("Resultado de la resta de a menos b: "+ a-b);
        // Este codigo tiene error ya que el signo menos entre a y b, no es reconocido para concatenar.
        
        System.out.println("Resultado de la resta de a y b: " + (a - b));
        // Imprime la concatenación de el resultado de las dos variables
        
        
        resultado = a*b;
        System.out.println("Resultado de la multiplicacion: "+ resultado);
        // Imprime el resultado
        
        resultado = a/b;
        System.out.println("Resultadod de la division: "+resultado);
        // Imprime solo el valor entero, aunque si se ve en la calculadora, el resultado es 1.5, no 1.
        // Entonces puede utilizarse flotante.
        
        var resDiv = 3f / b; // Tambien puede ser 3d de double en vez de f de float. Es importante indicarlo o va a dar resultado int.
        System.out.println("Resultado exacto de la division: "+resDiv);
        // Imprime el resultado exacto 1.5
        
        resultado = a % b;
        System.out.println("residuo de resultado: "+ resultado);
        // Devuelve el residuo de la division solo de su resultado en int.
        
        resultado = b % 2;
        System.out.println("residuo de resultado: " + resultado);
        // Devuelve el residuo 0
        
        if (resultado == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
    }
}

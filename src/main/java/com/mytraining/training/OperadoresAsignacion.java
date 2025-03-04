
package com.mytraining.training;

/**
 *
 * @author jonathan.arias
 */
public class OperadoresAsignacion {
    // Curso operaciones asignación
    public static void main(String[] args) {
        int a =3, b=2;
        int c = a;
        System.out.println("c: "+c);
        // El valor = es el operador de asignacion, describiendo que la variable a, se aloja en la variable c.
        int d = a +5 -b;
        System.out.println("d: "+d);
        // El valor = sigue asigando el resultado de la operación realizada de entre a mas cinco menos b.
        
        a+=1; // Es igual que escribir "a = a +1" o sea 3 +1 = 4. Este operador es el de composición.
        System.out.println("a: " +a);
        
        a += 3; // Siendo ya 4 segun el ultimo resultado, esta vez va a sumar 3
        System.out.println("a+3: "+a);
        
        b-=1; // Aplicando la operacion de composicion para restar igual "b=b-1"
        System.out.println("b: "+b);
        
        // Ejercicio de multiplicacion, difiision y modulo.
        a-=4;
        System.out.println("Ejercicio restar a: "+a);
        b+=1;
        System.out.println("Ejercicio sumar b: "+b);
        a*=b;
        System.out.println("Ejecicio multiplicar a con b: "+a);
        a/=b;
        System.out.println("Ejercicio division de a entre b: "+a);
        a%=b;
        System.out.println("Ejercicio residuo de 3/2 a con b: "+a);
        if (a == 0) {
            System.out.println("Valor de a es entero");
        } else {
            System.out.println("El valor de a es float");
        }
        a%=1;
        System.out.println("Ejercicio residuo 1/1 de a: "+a);
        if (a==0) {
            System.out.println("Valor de a es entero");
        } else {
            System.out.println("El valor de a es float");
        }
    }
}

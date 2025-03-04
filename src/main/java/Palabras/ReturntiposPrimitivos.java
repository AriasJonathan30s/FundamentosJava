
package Palabras;

/**
 *
 * @author jonathan.arias
 */
public class ReturntiposPrimitivos {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        sumarSinRetorno(a,b);
        var res = sumarConRetorno(a,b);
        System.out.println("Resultado retornado: "+res);
    }

    private static void sumarSinRetorno(int a, int b) {
        System.out.println("Suma de a + b: "+(a + b));
    }

    private static int sumarConRetorno(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Resultado en metodo sumarConRetorno es 0 pues los 2 parametros son 0");
            return 0;
        }
        int res = a+b;
        System.out.println("Resultado en metodo sumarConRetorno: "+ res);
        return res;
    }
}

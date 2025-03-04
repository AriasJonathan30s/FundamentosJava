
package Palabras;

/**
 *
 * @author jonathan.arias
 */
public class ReturntiposObject {
    public static void main(String[] args) {
        
        Suma s = createSumaObject(4,6);
        System.out.println("Obtiene resultado de objeto: "+ s.getSuma());
    }
    
    private static Suma createSumaObject(int a, int b){
        return new Suma(a,b);
    }
}

class Suma {
    private int a;
    private int b; 
    
    public Suma (int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int getSuma(){
        return this.a + this.b;
    }
    
}

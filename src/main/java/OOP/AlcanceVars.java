
package OOP;

/**
 *
 * @author jonathan.arias
 */
public class AlcanceVars {
    int a;
    int b;
    
    public AlcanceVars(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int sumar(){
        return this.a + this.b;
    }
    
    public int restar (){
        return this.a - this.b;
    }
    
    public int multiplicar(){
        return this.a * this.b;
    }
    
    public int dividir(){
        return this.a / this.b;
    }
}

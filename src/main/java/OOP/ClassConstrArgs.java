
package OOP;

/**
 *
 * @author jonathan.arias
 */
public class ClassConstrArgs {
    
    String name;
    int edad;
    
    public ClassConstrArgs(String newName, int newEdad){
            name = newName;
            edad = newEdad;
    }
    // Puede tener dos constructores.
    public ClassConstrArgs(){}
    
    public String getPersona(){
        return "El nombre es "+name+" tiene "+ edad +" años.";
    }
}

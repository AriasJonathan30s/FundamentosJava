package OOP;

/**
 *
 * @author jonathan.arias
 */
public class Main {
    // Paradigma de Programacion Orientado a Objetos
    public static void main(String[] args) {
        // Uso de los atributos de la clase
        Persona p1 = new Persona();
        p1.nombre = "Jonathan";
        p1.apellidoMaterno = "Cruz";
        p1.apellidoPaterno = "Arias";
        // Uso de metodo de la clase
//         p1.desplegarNombre();
        
        // Operaciones
        Operaciones operaciones = new Operaciones();
        int res = operaciones.sumar(5, 2);
//        System.out.println("res: "+res);
        
        // Uso de clase con constructor sin argumentos
        ClaseConConstructor construct = new ClaseConConstructor();
        String isResponding = construct.llama(true);
        int tiempoLlamada = construct.tiempoLlamada();
//        System.out.println("Si responde? "+isResponding);
//        System.out.println("Tiempo de llamada: "+tiempoLlamada);
        
        // Uso de clase con constructor con argumentos
        var edad = 36;
        var nombre = "Jonathan";
        ClassConstrArgs persona = new ClassConstrArgs(nombre, edad);
//        System.out.println(persona.getPersona());

        // Alcance de variables para .this
        
        //Variables locales
        var a = 6;
        var b = 2;
        AlcanceVars operacion = new AlcanceVars(a, b);
//        System.out.println("suma "+operacion.sumar());
//        System.out.println("resta "+operacion.restar());
//        System.out.println("multiplica "+operacion.multiplicar());
//        System.out.println("divide "+operacion.dividir());
        
        // Ejercicio Caja
        Caja caja1 = new Caja();
        System.out.println(caja1.volumen());
        
        int alto = 2;
        int ancho = 3;
        int profundidad = 6;
        Caja caja2 = new Caja(alto, ancho, profundidad);
        System.out.println(caja2.volumen());
        
        // Paso por valor
        
        
    }
}

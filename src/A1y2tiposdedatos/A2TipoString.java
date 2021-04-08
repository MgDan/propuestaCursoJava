package A1y2tiposdedatos;

import org.w3c.dom.ls.LSOutput;

public class A2TipoString {


    public static void main(String[] args) {
        /*
         * Los String son objetos de java, del tipo de referencia (es una secuencia de caracteres o arreglo de caracteres por eso no es un primitivo)
         *
         * Son inmutables (si se usa algun metodo, retornara un nuevo objeto, no reemplaza al anterior)
         * */
        String nombre = new String("Fulano"); //Actualmente deprecado
        String nombre2 = " Mengano";

        //concatenar  string: se usa el operador "+" para concatenar 2 string
        System.out.println(nombre + nombre2);

        //los strings no son primitivos no se pueden comparar con el operador de igualdad "=="

        //Checa si son el mismo objeto
        nombre2 = "Fulano"; //cambiamos para que las 2 variables tengan el mimos valor
        System.out.println( "Son el mismo objeto?: "+ (nombre == nombre2)); //va a comparar si son el mismo objeto pero no va comparar si tienen el mismo valor

        //Checa si tiene el mismo valor
        System.out.println( "Tienen el mismo valor?: "+ nombre.equals(nombre2));// se usa el metodo equals para poder comparar valores

        //INMUTABILIDAD

        /*
        * El String es inmutable, su valor no cambia una vez que se crea el objeto.
        *
        * Cuando cambiamos el valor en realidad crea un nuevo objeto osea que cambia la referencia hacia otro objeto
        * pero el original no cambia
        *
        * */

        //Ejemplo: puede parecer que estamos concatenando en el string original pero en 
        // realidad regresa un String nuevo
        String ejemplo = "texto de prueba";
        String ejemplo2 = " probamos la concatenacion";
        
        ejemplo.concat(ejemplo2);
        System.out.println("ejemplo = " + ejemplo); //seguira siendo "texto de prueba" ya que es inmutable
        
        //ahora probamos almacenando en otra variable
        String resultado = ejemplo.concat(ejemplo2);

        System.out.println("resultado = " + resultado); //al almacenar el resultado en una nueva variable podemos ver lo que retorna el metodo concat

        /*Validar String
        *
        * */
        String texto = null;
        boolean esNulo = texto == null; // checa si el objeto es nulo
        System.out.println("texto es Nulo? = " + esNulo);

        // si se intenta ejecutar algun metodo cuando la referencia es nula, lanzara un error
        // ejemplo:

        //System.out.println( texto.toUpperCase() );

        // esta sentencia lanzara error si se ejecuta ya que texto es nulo

        //--->se puede validar
        if(texto == null){
            texto = ""; // asi ya no causaria error;
            // incluso se puede validar si no es un string vacio
            if(texto.length() > 0){
                System.out.println("texto = " + texto);
            }
        }
    }
}

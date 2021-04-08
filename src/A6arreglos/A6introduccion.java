package A6arreglos;

import java.util.Arrays;

public class A6introduccion {
    /*
    * Arreglos
    *
    *Son tipos de datos de referencia, al instanciar se convierten en objetos
    *
    * pero esos objetos son especiales ya que agrupa o contienen datos
    * se pueden acceder a esos datos mediante una llave o un indice (empizan siempre en el indice 0)
    *
    * puedes acceder a la cantidad de datos usando el atributo "length" ej. arreglo.length
    *
    * para iterarlo siempre se le debe restar 1 a ese length para accede al ultimo dato del arreglo.
    *
    * puede contener datos primitivos o de referencia
    *
    *
    *
    * para declarar un arreglo esta es la estructura
    *
    * int[] enteros;
    *
    * primero el tipo de datos que contendra, en este ejemplo contiene el tipo de dato int;
    * despues los corchetes[] para indicar que es un arreglo;
    * y el nombre para poder hacer referencia a el en este caso: "enteros" pero podria ser cualquier nombre
    * siempre y cuando no sea una palabra reservada por Java (por convencion se usa en plural);
    *
    * otra manera especifica la cantidad de elementos que tendra el arreglo y se usa el operador "new"
    *
    * int[] enteros = new int[3] // ya no se podra modificar la cantidad de elementos que puede contener
    *
    * si se intenta acceder a los indices de este nuevo arreglo retornara valor null hasta que se le asignen valores
    * aunque en los arreglos de enteros el valor sera 0 ya que es el valor que tienen por defecto
    *
    * Declaracion, instanciacion e inicializacion de un arreglo (cuando ya conoces la cantidad de elementos e incluso sus valores);
    *
    * String[] nombres = {"Juan", "Jose", "Maria", "Miguel", "Sara"};
    *
    * // es mas resumido pero aun menos flexible
    *
    * */
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("numeros.length = " + numeros.length); // imprime la cantidad de elementos
        System.out.println("numeros[0] = " + numeros[0]); //imprime el valor del primer indice
        System.out.println("numeros[4] = " + numeros[4]); // imprime el valor del quinto elemento (como comienzan los indices en 0 por eso la quinta posicion es el indice 4)
        System.out.println("numeros[numeros.length - 1] = " + numeros[numeros.length - 1]); //imprime el valor del ultimo indice

        //===== Valores por defecto al crear un nuevo arreglo =====

        int[] digitos = new int[5];
        System.out.println("digitos[3] = " + digitos[3]); // el valor por defecto es cero
        digitos[3] = 4;
        System.out.println("digitos[3] = " + digitos[3]); // asignamos valor

        String[] palabras = new String[7];
        System.out.println("palabras[2] = " + palabras[2]); // el valor es null

        boolean[] booleans = new boolean[3];
        System.out.println("booleans[1] = " + booleans[1]); // aqui el valor por defecto es false
        
        // ======= Recorrer un arreglo =========
        
        String[] nombres = { "Sara", "Miguel", "Juan",  "Maria",  "Jose"};

        for (int i = 0; i < nombres.length; i++) {// se usa el operador "<" por la cuestion de los indices ya que al ultimo para acceder a el es el valor de length - 1
            System.out.println("\nnombres = " + nombres[i]);
        }
        
        //tambien se puede usar el foreach

        for (String nom: nombres) {
            System.out.println("\nnom = " + nom);
        }

        //Si se intenta acceder a un indice o incluso asignar un valor a un indice mayor al que fue definido un arreglo especifico causara error

        //System.out.println("nombres[5] = " + nombres[5]); //si se descomenta este ejemplo imprimira un error ya que se intenta acceder a un indice mayor al que fue definido el arreglo
        //nombres[5] = "Ale"; //tambien imprimira un error si se intenta asignar un valor a un indice mayor al que fue definido el arreglo

        //estos errores seran en tiempo de ejecucion

        //una solucion seria crear un nuevo arreglo a partir de los valores del original

        //======== ordenamiento ========

        //puedes utilizar la clase helper "Arrays" de java.util y usar el metodo sort para ordener
        //Ejemplo

        Arrays.sort(nombres); //en este caso ya que es un String ordenara basado en el alfabeto de la A - Z

        for (String n :nombres) {
            System.out.println("nombre = " + n);
        }
    }
    
    
}

package A3operadores;

public class A3OperadoresLogicos {
    //NOTA primero ver A3OperadoresRelacionales

    public static void main(String[] args) {
        /*Operadores Logicos
        *
        * Hay 2 tipos And se representa con "&&" y Or se represnta con "||": con ellos podemos evaluar 2 expresiones o mas
        *
        * */

        /*
        * And ambas expresiones deben ser true, para que devuelva un true
        * 
        * */
        
        boolean b1 = 1 == 1 && 2 > 1; // ambas se cumplen
        System.out.println("b1 = " + b1);

        boolean b2 = 1 == 1 && 2 < 1; // la segunda no se cumple
        System.out.println("b2 = " + b2);

        boolean b3 = 1 != 1 && 2 > 1; // si la primera no se cumple, hace una efecto corto circuito, ya que no tiene sentido evaluar la segunda si se sabe que la primera es un false
        System.out.println("b3 = " + b3);

        /*
         * Or al menos una expresion debe ser true para devolver true si ambas expresiones son falsas retornara false
         *
         * */

        boolean b4 = 1 == 1 || 2 > 1; // ambas se cumplen
        System.out.println("b4 = " + b4);

        boolean b5 = 1 == 1 || 2 < 1; // la segunda no se cumple pero aun asi retornara true
        System.out.println("b5 = " + b5);

        boolean b6 = 1 != 1 || 2 > 1; // si la primera no se cumple, aun asi retorna true
        System.out.println("b6 = " + b6);

        boolean b7 = 1 != 1 || 2 < 1; // ninguna se cumple asi que regresa false
        System.out.println("b7 = " + b7);

        /*Precedencia de Operadores Logicos

        Principalmente la precedencia siempre es de Izquierda a derecha, pero hay casos en que
        no es asi.

        por ejemplo tambien habra precedencia entre el operador "&&" y el "||" el AND "&&" tiene prioridad
        sobre el OR "||"
        * */

        int i = 3;
        byte j = 3;
        int k = 10000;
        int l = 1000;
        boolean m = false;
        
        boolean b8 = i == j || k < l && m == true; // aqui en otras circunstancias empezaria evaluando
        // " i == j " pero por la prioridad de primero evalua  " k < l && m == true "
        //entonces seria " k < l && m == true " seria " false "
        // y " i == j " seria true
        // al final " true || false " = a true

        System.out.println("b8 = " + b8);

        boolean b9 = (i == j || k < l) && m == true; // usando parentesis cambiamos la precedencia
        //ahora la prioridad esta en la expresion dentro de los parentesis
        //ahora se evaluara primer (i == j || k < l) que daria como resultado " true "
        //y luego " m == true " resulta en " false "
        // al final " true && false " da como resultado false
        System.out.println("b9 = " + b9);

    }
}

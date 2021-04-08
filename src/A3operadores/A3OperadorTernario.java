package A3operadores;

public class A3OperadorTernario {
    public static void main(String[] args) {
        /*El Operador Ternario
        *
        * Se compone de 3 partes
        *
        * la primera parte evalua una expresion booleana
        *
        * la segunda regresara el resultado si se cumple esa condicion
        *
        * y la tercera regresara el resultado si no se cumple esa condicion
        *
        * Es una version mas abreviada de un if/else solo que siempre asigna o devuelve un valor
        *
        * seria algo asi
        *
        * variable = condicion ? si es verdadero : si es falso;
        * */

        String variable = 7 == 7 ? "si es verdadero" : "es falso";

        System.out.println("variable = " + variable);


        variable = 7 == 5 ? "si es verdadero" : "es falso";

        System.out.println("variable = " + variable);

    }
}

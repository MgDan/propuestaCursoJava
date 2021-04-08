package A3operadores;

public class A3OperadoresRelaciones {
    public static void main(String[] args) {
        /*Operadores Relacionales

        Estos operadores se utilizan para verificar las relaciones

        por ejemplo la iguldad de 2 variables ya sea de tipo primitivo o tambien los de referencias (funciona algo distinto comparar referencias)

        retornan un true o false
        * */

        //doble igual "==" sirve para comparar si son iguales


        int i = 7;
        byte j  = 3;
        
        boolean b1 = 1 == j; //a pesar de que sean de distinto tipo se pueden comparar siempre y cuando sean numericos
        System.out.println("b1 = " + b1);
        
        j = 7;

        System.out.println("b1 = " + b1);

        //tambien se puede en forma literal

        boolean b2 = 5 == 5;

        System.out.println("b2 = " + b2); //se compararon literales

        //con los objetos comunmente se usa el metodo equals para comprarlos
        // los objetos de las clases Wrapers (Integer, Boolean, Short, Long, etc) tambien se usa el metodo equals


        // "!=" sirve para hacer comparacion y asegurar que 2 valores son distintos
        i = 3;
        j = 2;

        boolean b3 = i != j;
        System.out.println("b3 = " + b3);//son distintos asi que retorna true

        //nota tambien se puede hacer la comparacion con booleanos algo asi true == true o true == false
        //solo se podria usar un operador de igualdad "==" o si es distinto  "!=" los operadores como ">" o "<" no podrian usarse

        //operadores mayor que y menor que

        boolean b4 = i < j; //compara si "i" es mayor que "j"
        boolean b5 = i > j; //compara si "i" es menor que "j"

        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);

        //tambien estan los operadores compuestos mayor igual ">=" y menor igual "<=" (nota: el igual siempre va a la derecha)

        boolean b6 = i <= j; //compara si "i" es mayor o igual que "j"
        boolean b7 = i >= j; //compara si "i" es menor o igual que "j"

        System.out.println("b6 = " + b6);
        System.out.println("b5 = " + b5);

        i = 3;
        j = 3;

        boolean b8 = i <= j; //compara si "i" es mayor o igual que "j"
        boolean b9 = i >= j; //compara si "i" es menor o igual que "j"

        System.out.println("b8 = " + b8);
        System.out.println("b9 = " + b9);



    }
}

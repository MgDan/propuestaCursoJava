package A3operadores;

public class A3OperadorInstanceOf {
    public static void main(String[] args) {
        /*
        * Este operador nos permite si una instancia, un objeto es referencia de un tipo
        * Por ejemplo de una clase, una interface, una clase abstracta o de un tipo o si es un
        * descendiente o ancestro.
        *
        * */

        String texto = "creando de la clase String ";

        Integer num = 85;

        Boolean b1 = texto instanceof String;

        System.out.println("es del tripo String? b1 = " + b1);

        //Boolean b2 = texto instanceof Integer; //Si se descomenta marcara error (de sintaxis) ya que
        //no se puede evaluar con instanceof en objetos que son totalmente distintos e incompatibles
        //ejemplo un String y un Integer y tampoco hay una jerarquia en comun

        Boolean b3 = texto instanceof Object; //todos los tipos y objetos son del tipo Object
        //todos heredan de el

        System.out.println("es del tripo Object? b3 = " + b3);


        //Boolean b4 = num instanceof Long;
        //Boolean b5 = num instanceof Short;

        Boolean b6 = num instanceof Number;

        // no lo puedes comparar con short o con Long ya que son distintos mas que nada por
        //los tamaños que manejan pero con el tipo Number si ya que tanto Long como Short e Integer
        //heredan de Number

        System.out.println("es del tripo Number? b6 = " + b6);

    }
}

package A3operadores;

public class A3OperadoresAritmeticos {
    public static void main(String[] args) {
        /*
        * Java proporciona muchos tipos de operadores para distintas necesidades.
        *
        *
        * Operadores aritmeticos, para hacer operaciones aritmeticas basicas
        *
        * suma resta multiplicacion division...
        *
        * se pueden utilizar variables o literales para obtener resultados numericos (enteros y decimales)
        * */

        int i = 5, j = 4;
        int suma = i + j;
        System.out.println("suma = " + suma);

        // cuando se suma dentro de una concatenacion debe tenerse cuidado
        // ya que se evalua de izquierda a derecha
        //Ejemplo
        System.out.println("i + j = " + i + j); // por la concatenacion el resultado sera 54 en lugar de 9
        System.out.println(i + j + " = i + j" ); // pero si se hace asi, sera correcto

        int k = 5, l = 4;
        int resta = k - l;
        System.out.println("resta = " + resta);
        //System.out.println("i + j = " + k - l); // en las concatenaciones no se usa el operador de resta asi que por eso esta sentencia causa error al tratar de ejecutarla
        System.out.println("i + j = " + (k - l));// forma correcta para poder imprimir las restas (esto tambien es para la multiplicacion, la division y el modulo)

        int m = 5, n = 4;
        int multiplicacion = m * n;
        System.out.println("multiplicacion = " + multiplicacion);

        int div = m/n;
        System.out.println("division = " + div); // aqui el resultado es decimal pero al declararlo como entero, java aproximara el resultado
        //para que la division sea decimal la variable debe ser del tipo float o double
        
        double division = m/n;
        System.out.println("division = " + division); // sigue sin imprimir el valor con decimal inexacto.

        //para arreglarlo alguno de las 2 variables involucradas en la operacion tambien debe ser decimal
        double divisionDecimal = (double) m/n;
        System.out.println("divisionDecimal = " + divisionDecimal);
    }

}

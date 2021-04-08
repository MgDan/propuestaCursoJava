package A5ClasesWrapper;

public class A5ClasessWrapper {
    public static void main(String[] args) {
        /*
        *
        * Representan a un valor primitivo pero le dan a este mas funcionalidad
        *
        * Cada valor primitivo tiene su equivalente en Wrapper la diferencia es que
        * se defininen con mayuscula la primera en lugar de ser todas minusculas
        * (Excepto int y char que son Integer y Character)
        *
        * en los Wrapper numericos casi tienen los mismos metodos todos (Integer, Long, Byte, Double, Float)
        *
        *
        * desde la version del jdk 7 esta deprecado el uso del operador "new" para instanciar las
        * clases Wrapper en su lugar se usa el metodo estatico "valueOf"
        *
        * Integer i = Integer.valueOf(123456789) // puede recibir un primitivo o un string;
        *
        * tambien se puede usar el metodo toString para convertirlo en un string
        *
        * String s = i.toString()
        *
        * no es nada recomendable tratar de convertir numeros a una clase que tenga un limite
        * menor al numero que se esta tratando de convertir por ejemplo  de un Integer a un shor
        * o a un byte (Byte.MAX_VALUE = 127 y el short es de Short.MAX_VALUE = 32767 [los clases
        * wrapper tienen esas constantes estaticas para revisar minimos y maximos] )
        *
        * Asi que si se intenta convertir un numero con mayor capacidad al maximo que ese tipo soporta
        * puede tener ambiguedad o perdida de informacion
        *
        * tambien podemos convertir de un String
        *
        * int K = Integer.parseInt("12345")
        *
        * */

        //Integeger intObject = new Integer(1234) //esta deprecado

        Integer intObject = Integer.valueOf(1234); //desde Java 7
        Integer intObject2 = 1234; //Autoboxing (de forma automatica se convierte la literal en el Objeto Integer )

        int intPrimitivo = 123566;
        Integer intObject3 = Integer.valueOf(intPrimitivo); // desde una variable primitiva, no es obligatorio que sea una literal

        // convertir de la clase Wrapper a primitivo hay 2 maneras, la implicita y la explicita

        int num = intObject;//implicita (internamente ejecuta el metodo del ejemplo de abajo)
        int num2 = intObject2.intValue(); //explicita

        Integer[] enteros = {1,2,3,4,5,6,8}; // aqui tambien se hace autoboxing ya que
        //no se esta defininiendo de forma explicita que se convierta Integer (se estan
        // pasando enteros primitivos pero al final es un arreglo de Integers)

        int suma = 0;

        for(Integer i : enteros){
            if(i%2 == 0){ // aqui es un autounboxing
            //no es necesario converir la i que es Integer a un int primitivo gracias al autounboxing
            //al usar el operador aritmetico Java ya sabe que debe convertirlo en un int primitivo
            // internamente esta invocando el metodo "i.intValue()"
            // aun asi se podria usar la expresion i.intValue()%2 == 0 y funcionara igual
                suma += i;
            }
        }
        System.out.println("suma = " + suma);// el resultado de sumar usando el autounboxing

        //=========== Operadores Relacionales en Clases Wrapper ===============

        Integer x = Integer.valueOf(1000000);
        Integer y = 1000000;

        //

        System.out.println("son el mismo objeto?  " + (x == y)); //a pesar de tener el mismo valor
        // no son el mismo objeto asi que regresara "false"

        //aunque hay una particularidad si los objetos que esta comparando estan en el rango de
        //-128 hasta 127 la maquina virtual de java si hara la comparacion por valor y no por referencia

        System.out.println("son iguales " + x.equals(y)); // usando el metodo equals es la manera mas correcta

        // esta particularidad solo aplica con el operado "=="
        //con los operadores relaciones de ">< >= <=" y operadores aritmeticas hace un autounboxing
        //osea que los convierte en valores primitivos para interectuar con los operadores

        System.out.println("y >= x? " + (y >= x));

        /*
        *
        * Character
        *
        * crear instancia: Character c = Chracter.valueOf('A');
        *
        * //se puede convertir a String
        *
        * String s = c.toString()
        *
        * //para convertir a mayusculas se usa "toUpperCase" y para minusculas "toLowerCase"
        *
        * char c2 = c.toUpperCase();
        * char c3 = c.toLowerCase();
        *
        *
        * Alugnos metodos de comprobacion (retornan booleans):
        *
        * Character.isDigit(c)
        * Character.isAlphabetic(c)
        * Character.isLetter(c)
        * Character.isSpaceChar(c)
        *
        *
        *
        *
        *
        * */


        /*
        * Boolean
        *
        * instanciar: Boolean b1 = Boolean.valueOf(true); //tambien acepta String como "true";
        * convertir a String: String s.toString();
        * convertir a Primitivo boolean b2 = b1.booleanValue()
        *
        * constantes: Boolean.TRUE retorna true // Boolean.FALSE retorna false
        *
        * */

        //forma explicita para declarar una variable con el Wrapper Boolean

        Boolean objBoolean = Boolean.valueOf(true); // tambien puede aceptar expresiones de literales o variables
        // ejemplo: Boolean.valueOf(7 > 3) o Boolean.valueOf(variable1 >= variable2);
        // incluso tambien reconoce Strings Boolean.valueOf("true");

        //forma implicita (autoboxing) para declarar una variable con el Wrapper Boolean
        Boolean objBoolean2 = false;

        System.out.println("comparando 2 objetos Boolean: "+(objBoolean == objBoolean2) ); // no se comportan igual que los Wrappers numericos aqui si compara por el valor y no por la referencia
        // si se cambia el valor para que ambos tengan el mismo valor (true or false)
        //el resultado en consola sera true;

        System.out.println("comparando 2 objetos Boolean: "+objBoolean.equals(objBoolean2) ); //tambien se puede usar el metodo equals

        boolean primitivo = objBoolean; //autounboxing
        boolean primitivo2 = objBoolean2.booleanValue(); //forma explicita para obtener el valor primitivo

    }
}

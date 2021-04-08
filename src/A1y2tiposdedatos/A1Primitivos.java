package A1y2tiposdedatos;//Tipo de Variables Primitivas

public class A1Primitivos {

    public static void main(String[] args) {
    /*booelan

    Este es el tipo mas simple solo almacena un bit en memoria puede ser Verdadero o Falso

    para especificar un literal boolean, se usan las palabras clave true o false.
    Ambas escritas en minusculas

    */

        boolean a = false;
        boolean b = true;

    /*char

    Usa el codigo unicode y usa cada caracter 16 bits

    */

        char c = 'c';
        char d = '1';
        char f ='\u0021';

    /*numeros enteros

    Son 4 tipos (byte, short, int y long)
    cada uno tiene sus limites ejemplo el byt va desde -128 hasta 127

     no usan decimales y pueden ser positivos o negativos
     */


        //entre -128 a 127
        byte enteroByte = 127;

        //entre -22768 a 32767
        short  enteroShort= 32767;

        //entre -2147483648 a 2147483647
        int  entero = 2147483647;

        //entre -9223372036854775,808 a 9223372036854775807
        long  enteroLong = 2147483647;

        /*numeros reales

    Son un tipo de dato para guardar con precision simple o doble

     */


        float floatNumber = 3.1416f;
        double realDouble = 4.7029235;

        //los valores primitivos sus tipos de datos son en minusculas no confundir con las Clases equivalentes que si empiezan con Mayuscula
    }

}

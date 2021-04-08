package A3operadores;

public class A3OperadoresIncremento {
    public static void main(String[] args) {
        /*Operadores de Incremento y de Decremento

        tenemos el preincremento y el posincremento y en el decremento tambien hay preincremento y posincremento
        *
        * */

        int i = 1;
        int j = ++i; //aqui es pre incremento, primero incrementa y luego se asigna a "j"

        System.out.println("i = " + i);
        System.out.println("j = " + j); //valen igual porque primero hace el incremento y eso asegura que "j" tenga el mismo valor

        i = 5;
        System.out.println("original i = " + i);
        j = i++; //aqui es post incremento, primero asigna a "j" y luego se incrementa

        System.out.println("i = " + i);
        System.out.println("j = " + j); //"j" tiene el valor anterior de i, porque primero asigna el valor y luego lo incrementa

        i = 3;
        j = --i; //aqui es pre incremento, primero idecrementa y luego se asigna a "j"

        System.out.println("i = " + i);
        System.out.println("j = " + j); //valen igual porque primero hace el decremento y eso asegura que "j" tenga el mismo valor

        i = 3;
        j = i--; //aqui es post decremento, primero asigna a "j" y luego decrementa

        System.out.println("i = " + i);
        System.out.println("j = " + j);//"j" tendra el valor anterior de "i"

    }
}

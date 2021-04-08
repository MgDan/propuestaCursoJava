package A5ClasesWrapper;
//cuando se envia como argumento una referencia, y se modifica esa referencia, si afecta a los valores originales
public class A5EnviandoArgumentosConReferencia {
    public static void main(String[] args) {
        int[] enteros = {12, 30,2, 40};
        System.out.println("inicia metodo main");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("enteros["+i+"] = "+enteros[i]); //iternado con valores originales
        }
        System.out.println("\n llamando al metodo 'modificiando'");
        modificando(enteros); //aqui se modifican los valores
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("enteros["+i+"] = "+enteros[i]); //iternado ya no seran los orignales, se cambiaron en el metodo "modificando()"
        }


    }

    public static void modificando(int[] enterosArg){ //a pesar de que el metodo es void ("no regresa valores") si esta modificando al objeto original de enteros
        System.out.println("iniciando el metodo 'modificando()'");
        for (int i = 0; i < enterosArg.length; i++) {
            //modificamos con un nuevo valor
            enterosArg[i] = (int)Math.floor(Math.random()*(100-1+1)+1); //asignando un numero nuevo aleatorio entre 1 y 100
        }
        System.out.println("finalizando el metodo 'modificando()'");
    }
}

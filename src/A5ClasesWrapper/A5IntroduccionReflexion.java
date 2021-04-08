package A5ClasesWrapper;

import java.lang.reflect.Method;

public class A5IntroduccionReflexion {
    //La refelxion sirve para tener la informacion sobre la estuctura de algun objeto
    //por ejemplo campos, metodos, metadata, el package al que pertenece, herencia
    public static void main(String[] args) {
        String texto = "Hola";
        Class clss = texto.getClass();

        System.out.println("clss.getName() = " + clss.getName()); //muestra el nombre completo de la clase incluyendo el package
        System.out.println("clss.getSimpleName() = " + clss.getSimpleName()); // solo muestra el nombre de la clase sin el package
        System.out.println("clss.getPackage() = " + clss.getPackage()); //imprime el package al que pertenece la clase

        //imprimir los metodos que tiene la Clase a la que pertenece el objeto
        for(Method m:clss.getMethods()){ //"Method" clase del package "java.lang.reflect"
            System.out.println("m.getName() = " + m.getName());
        }

        Integer num = 3;
        Class clss2 = num.getClass();

        //Ejemplo con tipo "Integer"
        System.out.println("clss2.getName() = " + clss2.getName());
        System.out.println("clss2.getSimpleName() = " + clss2.getSimpleName());
        System.out.println("clss2.getPackage() = " + clss2.getPackage());

    }
}

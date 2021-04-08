package A7programacionorientadaaobjetos.A7CreacionDeClases.clases;

import A7programacionorientadaaobjetos.A7CreacionDeClases.clases.Automovil;

public class EjemploClases {
    public static void main(String[] args) {

        //instanciamos nuestra clase Automovil
        Automovil automovil = new Automovil();//creamos la instancia e inicializamos el objeto

        //en estos 2 atributos no se les asigno un valor asi que al imprimirlos imprimira el valor por defecto
        //segun el tipo de dato
        System.out.println("automovil.fabricante = " + automovil.fabricante); //String valor por defecto null
        System.out.println("automovil.clindros = " + automovil.clindros);//double valor por defecto 0
        // por cuestion de ejemplo se esta accediendo al atributo directamente
        // aunque el dicta que deberia ser a traves de metodos la lectura y la escritura de estos
        //Solamente para este ejemplo accederemos directamente al atributo

        //en estos atributos asignamos un valor por defecto que nosotros
        System.out.println("automovil.color = " + automovil.color);
        System.out.println("automovil.modelo = " + automovil.modelo);

        //Ahora en este ejemplo vemos que tambien se puede asignar valores en tiempo de ejecucion
        //normalmente esto se hace con los metodos "setter" pero se manejara de este modo para este ejemplo

        automovil.modelo = "Spark"; //sobreescribimos el valor que tiene por defecto en la clase
        automovil.color = "Rojo"; //sobreescribimos el valor que tiene por defecto en la clase
        automovil.fabricante = "Chevrolet";
        automovil.clindros = 1.4;

        System.out.println("\nautomovil.modelo = " + automovil.modelo);
        System.out.println("automovil.fabricante = " + automovil.fabricante);
        System.out.println("automovil.clindros = " + automovil.clindros);
        System.out.println("automovil.color = " + automovil.color);

        //podemos crear mas objetos con base a nuestra clase

        Automovil tsuru = new Automovil();
        tsuru.modelo = "Tsuru"; //sobreescribimos el valor que tiene por defecto en la clase
        tsuru.color = "Blanco"; //sobreescribimos el valor que tiene por defecto en la clase
        tsuru.fabricante = "Nissan";
        tsuru.clindros = 1.6;

        System.out.println("\ntsuru.modelo = " + tsuru.modelo);
        System.out.println("tsuru.fabricante = " + tsuru.fabricante);
        System.out.println("tusru.clindros = " + tsuru.clindros);
        System.out.println("tsuru.color = " + tsuru.color);

        //Ir a la clase Automovil para ver como se crea un metodo y regresar aqui

        automovil.detalle();
        tsuru.detalle();
        //gracias a la palabra reservada "this" podemos hacer distincion entre los objetos creadosç
        //y referirnos a su informacion especifica de cada objeto

        //Ejemplo con mejores practicas de un metodo
        System.out.println("tsuru.textDetalle() = " + tsuru.textDetalle());
        System.out.println("automovil.textDetalle() = " + automovil.textDetalle());

    }
}

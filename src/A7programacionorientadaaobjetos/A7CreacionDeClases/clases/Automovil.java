package A7programacionorientadaaobjetos.A7CreacionDeClases.clases;

//la clase debe llamarse igual que el archivo
public class Automovil {
    //Atributos

    String fabricante;
    String modelo = "sedan";
    String color = "gris";
    double clindros;

    //metodos

    //2.- Crear Metodos

    // Primero se debe crear el encabezado del metodo:
    // se define el modificador (public, private, protected, default [se vera mas adelante])
    // despues el tipo de datos que regres (void, String, int, algun tipo de dato personalizado, etc)
    // seguido se le define un nombre para el metodo seguido de parentesis donde puede definirse o no, si aceptara argumentos

    //Ejemplos:

    //public void metodoEjemplo(){} // en este ejemplo no esta aceptando parametros, y no devuelve ningun tipo de dato;
    //private int metodoEjemplo(int numero, String texto){} //en este ejemplo es privado, devuelve un entero y rquiere 2 parametros uno entero y otro String

    public void detalle(){
        // dentro de las llaves definiremos lo que hara este metodo en este caso solo imprimira los detalles del objeto en si

        //en este caso usamos la palabra reservada ==this== que hace referencia al objeto actual y no a la clase como tal
        //se vera de forma mas clara en el ejemplo en el metodo main

        System.out.println("\nimpriendo desde el metodo 'detalle'");
        System.out.println("\nthis.modelo = " + this.modelo);
        System.out.println("this.fabricante = " + fabricante); //tambien puedes obviar el operador this
        //de forma automatica Java intuye que se esta haciendo referencia al atributo definido en la clase

        //NOTA: si se declara dentro del contexto del metodo otra variable con el mismo nombre que el
        // atributo aqui si se debera obligatoria mente hacer uso de la palabra reservada "this"
        // para referirse al atributo, y sin la palabra reservada this para hacer referencia a la variable
        // ya que puede crear ambigüedad entre la variable y el atributo.
        System.out.println("this.clindros = " + this.clindros);
        System.out.println("this.color = " + this.color);
        System.out.println("--------------------------------------");

        //NOTA: como buena practica dentro de una clase no se deberian imprimir datos, en este caso
        //solo es para el ejemplo
    }

    public String textDetalle(){
        //Este seria un ejemplo mas correcto de un metodo
        //el metodo deberia regresar y no imprimir en consola
        StringBuilder sb = new StringBuilder();
        sb.append("\n\nimpriendo desde el metodo 'detalle'");
        sb.append("\nthis.modelo = " + this.modelo);
        sb.append("\nthis.fabricante = " + fabricante);
        sb.append("\nthis.clindros = " + this.clindros);
        return sb.toString(); //importante usar la palabra reservada "return"
        //esta regresara el resultado del metodo y ese resultado debe coincidir con el
        //tipo de dato que se definio en el encabezado del metodo
    }
}

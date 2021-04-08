package A5ClasesWrapper;

public class A5DiferenciaValorContraReferencia {
    //Cuando pasas argumentos por valor no debe afectar los valores originales que se envian por argumento
    //Caso contrario cuando pasas argumentos por Referencia (un objeto) y este cambia estos si afectan los valores originales
    public static void main(String[] args) {
        int a = 10;
        System.out.println("inicia a con = " + a);

        modificando(a);
        System.out.println("finaliza a con = " + a); //al pasar un valor en lugar de un objeto, el valor original no se ve afectado.
        //aun cuando el valor fue modificado en el metodo "modifcando" el valor permanece igual osea 10

        //pasa lo mismo con las clases Wrapper ya que son inmutables
        // (osea al modificar retorna una nueva instancia y no modifica a la referencia original)
        Integer b = 2;
        System.out.println("inicia b con = " + b);
        modificando(b);
        System.out.println("finaliza b con = " + b);
    }

    public static void modificando(int a){
        System.out.println("inicia este sub metodo");
        System.out.println("inicia a en el metodo con = " + a);
        a = 35;
        System.out.println("finaliza a en el metodo con = " + a);
    }

    public static void modificando(Integer b){
        System.out.println("inicia este sub metodo usando Wrapper");
        System.out.println("inicia a en el metodo con = " + b);
        b = 90;
        System.out.println("finaliza a en el metodo con = " + b);
    }
}

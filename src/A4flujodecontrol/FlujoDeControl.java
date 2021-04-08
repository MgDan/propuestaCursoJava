package A4flujodecontrol;

public class FlujoDeControl {

    public static void main(String[] args) {
        /*
        * If
        *
        * Es una sentencia booleana que si se cumple ejecuta otra sentencia, si no
        * se salta esa sentencia
        *
        * Siempre lleva llaves a menos que solo sea una linea de codigo la que se va ejecutar
        * entonces se pueden omitir llaves
        *
        * si se usa la sentencia "else" se puede ejecutar otra sentencia en caso de que
        * la expresion sea falsa o hasta encadenar sentencias if else algo como
        *
        * if(){
        *
        * }else if(){
        *
        * }else{
        *
        * }
        *
        * */
    float promedio = 8.6f; // puedes cambiar el promedio para ir probando casos

    if(promedio >= 7){//se pueden usar expresiones usando Operadores Relacionlaes y logicgos
        System.out.println("aprobado");
       //aqui se agrega el codigo que se ejecutara cuando la expresion resulte "true"
    }else{
        //codigo que se ejecuta si la expresion es "false"
        System.out.println("reprobado");
    }

    /*
    *
    *
    * Se podria usar asi ya que solo ejecutan una linea de codigo siempre que no se olvide identar
    if(promedio >= 7)
        System.out.println("aprobado");
    else
        System.out.println("reprobado");

    *===Aunque es recomendable usar las llaves ya que hace mas facil de leer el codigo===
    *
    * */

        // ### Ejemplo con else if()

        if(promedio >= 8.5f){//se pueden usar expresiones usando Operadores Relacionlaes y logicgos
            System.out.println("sobresaliente");
            //aqui se agrega el codigo que se ejecutara cuando la expresion resulte "true"
        }else if(promedio >=7){
            //codigo que se ejecuta si la expresion es "false"
            System.out.println("aprobado");
        }else if(promedio >=5){
            System.out.println("casi pero reprobado");
        }else{
            System.out.println("reprobado");
        }

        System.out.println("promedio es = " + promedio);

        /*
        * El Switch Case o interruptor
        *
        * Este en lugar de evaluar una expresion booleana, compara por valor
        *
        *no se puede utilizar cualquier tipo para usar un switch
        *
        *  (1) --> solo se puede usar el (primitivos: int, byte, short, char;  String [ desde la version 7 del jdk ])
        *
        *
        * utiliza la palabra "break" para evitar que ejecute en cascada los demas casos del switch
        *
        * */

        int num = 3; // si cambiamos el tipo de dato por ejemplo por un Long marcara error
        // solo admite ciertos tipos de datos mencionados en la parte superior --> (1)

        switch (num){
            case 0:
                System.out.println("el numero es 0");
                break;
            case 1:
                System.out.println("el numero es 1");
                break;// si se remueve el "break" imprimira tambien los demas casos definidos abajo
                //break evita que pase eso y saldra del switch
            case 2:
                System.out.println("el numero es 2");
                break;
            case 3:
                System.out.println("el numero es 03");
                break;
        }

        System.out.println("==========");
        System.out.println("Bucles");
        System.out.println("==========");

        /*
        * ******* Bucles **********
        *
        * While
        *
        * Ejecuta un bloque de codigo mientras se cumpla la condicion
        *
        * =============================
        * while(expresion){
        *
        * }
        * ==============================
        *
        * Es una sentencia pre condicion, osea que primero evalua y luego ejecuta
        * (al contrario de Do While que ejecuta primero y luego evalua )
        *
        *
        * */
        int num1 = 0;
        while (num1<5){ // primero evalua si num fuera 5 no ejecutaria
            System.out.println("num = " + num1);
            num1++;

            //un inconveniente es que este puede crear un bucle infinito, por ejemplo
            //si no se incrementara la variable num siempre seria menor a 5 asi que se seguiria
            //ejecutando el codigo hasta el infinito
        }

        int num2 = 0;
        boolean prueba = true;
        while (prueba){ //
            if (num2 == 7){
                prueba = false;
            }
            num2++;
        }

        /*
        *
        * Do While
        *
        *
        * Ejecuta un bloque de codigo mientras se cumpla la condicion (primero ejecuta y luego evalua
        * lo cual garantiza que el codigo se ejecute al menos una vez)
        *
        * do{
        *   //se ejecuta al menos una vez
        * }while(expresion);
        *
        *
        * */

        /*
         *
         * Do While
         *
         *
         * Ejecuta un bloque de codigo mientras se cumpla la condicion (primero ejecuta y luego evalua
         * lo cual garantiza que el codigo se ejecute al menos una vez)
         *
         * do{
         *   //se ejecuta al menos una vez el codigo
         * }while(expresion); // evalua la expresion si se cumple vuelve a ejecutar
         * //seguira ejecutando hasta que la expresion ya no se cumpla
         *
         *
         * */

        do{
            System.out.println("se ejecuta al menos una vez");
        }while (prueba); // este es postevaluacion asi que al menos se ejecuta una vez

        /*
         *
         * For
         *
         *
         * Ejecuta un bloque de codigo hasta que alcanza un limite establecido
         *
         * en esta se inicializa una variable de control, se incrementa o se decrementa
         * dependiendo del caso, este decremento/incremento sera despues de haber ejecutado
         * el codigo del bucle y seguira repitiendose el proceso mientras se cumpla la condicion
         * definida
         *
         *
         * for(inicializacion; condicion; incremento){
         *  //bloque de iteracion, se ejecuta si cumple la condicion
         * }
         *
         * */
        for (int i = 0; i < 5; i++) {
            System.out.println("i ="+i); //aqui tambien podriamos omitir las llaves ya que solo es una sola linea de codigo
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println("i ="+i);
        }

        //los ciclos for son bastante convenientes para usarlos con arreglos por ejemplo

        String[] nombres = {"Dan", "Larry", "Walter", "Zack", "Henry"};

        int count = nombres.length; // establecemos el limite

        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase("Dan") || nombres[i].equalsIgnoreCase("Henry") ) {
                continue; // continue es una palabra reservada que hara que el el "for" se
                //salte el bloque de codigo pero sin salirse del cilco aqui lo usamos dentro de una condicion,
                // para que si esa condicion se cumple salte este bloque
            }

            System.out.println("nombre: = " + nombres[i]);
        }
        
        // el continue hace que siga a la siguiente iteracion
        
        //podemos usar el break para salirnos totalmente del for
        
        //ejeplo de buscar un elemento en un array
        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase("Zack")  ) {
                encontrado = true;
                break; // continue es una palabra reservada que hara que el el "for" se
                //salte el bloque de codigo pero sin salirse del cilco aqui lo usamos dentro de una condicion,
                // para que si esa condicion se cumple salte este bloque
            }

            System.out.println("nombre: = " + nombres[i]);
        }

        System.out.println("encontrado = " + encontrado);

        //cuando tenemos bucles "for" anidados podemos usar etiquetas para controlar el flujo
        System.out.println("====bluces con etiquestas====");
        bucle1: //tiene que estar junto al for al que estamos etiquetando en este caso el for de "j"
        for (int j = 0; j<5; j++){
            for (int k = 0; k<5; k++){
                if(j==2){
                    continue bucle1;
                }
                System.out.println("j = " + j);
                System.out.println("k = " + k);
            }
        }

        // Es mas visible cuando usamos el brake
        System.out.println();
        System.out.println("================ Ejemplo 2 con etiquetas ==============");
        System.out.println();
        bucle1: //tiene que estar junto al for al que estamos etiquetando en este caso el for de "j"
        for (int l = 0; l<5; l++){
            for (int m = 0; m<5; m++){
                if(l==2 && m ==2){
                    break bucle1;
                }
                System.out.println("l = " + l);
                System.out.println("m = " + m);
            }
        }

        //tambien exite la sentencia foreach con este usado en un array obtendra un elemento
        // de ese array automaticamente
        System.out.println();
        System.out.println("================ Ejemplo foreach ==============");
        System.out.println();

        for (String nombre:nombres) {
            System.out.println(nombre);
        }
    }
}

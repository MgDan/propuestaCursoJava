package A3operadores;

public class A3OperadoresAsignacion {
    public static void main(String[] args) {
        //Operador de Asignacion

        /*
        * Declarar una variable de cualquier tipo necesita del operador de asignacion "="
        * */

        int i = 5; // aqui esta asignando 5 a "i" con el operador de asignacion


        //tambien hay operadores de asignacion compuestos

        //Ejemplo podriamos querer incrementar lo que tiene la variable: i = i + 2; 
        // el resultado seria 7 pero hay una forma mas sencilla usando un operador compuesto
        System.out.println("i = " + i);
        i += 2;
        System.out.println("i = " + i);
        i += 5;
        System.out.println("i = " + i);
        
        // tambien tenemos lo mismo para la resta (en realidad para todos los operadores aritmeticos)
        
        i -= 3;
        System.out.println("i = " + i);
        i *= 3;
        System.out.println("i = " + i);
        i /= 9;
        System.out.println("i = " + i);
        
        //esto tambien funciona para la concatenacion
        
        String texto = "Hola mundo";
        texto += " estoy aprendiendo java";
        texto += " voy en los operadores";
        System.out.println("texto = " + texto);


    }
}

package actividad01;

public class Ejercicio02 {
    public static void main(String[] args) {
//Part 3
        //Tipo de dato boolean con dos posibles valores: true o false
        boolean varBoolean = true;
        System.out.println("El variable tipo boolean muestra dos posibles valores: true o false. Ejemplo: "+varBoolean);

        //Tipo de dato char con un carácter Unicode de 16 bits
        char varChar = 'G';
        System.out.println("El variable tipo char muestra un carácter Unicode de 16 bits. Ejemplo: "+varChar);

        //Tipo de dato entero de 8 bits de longitud
        byte varByte = 50;
        System.out.println("El variable tipo byte muestra datos enteros de 8 bits. Ejemplo: "+varByte);

        //Tipo de dato entero de 16 bits de longitud
        short varShort = -28755;
        System.out.println("El variable tipo short muestra datos enteros de 16 bits. Ejemplo: "+varShort);

        //Tipo de dato entero de 32 bits de longitud
        int varInt = 2147483647;
        System.out.println("El variable tipo int muestra datos enteros de 32 bits. Ejemplo: "+varInt);

        //Tipo de dato entero de 64 bits de longitud
        long varLong = -9223372036854775808L;
        System.out.println("El variable tipo long muestra datos enteros de 64 bits. Ejemplo: "+varLong);

        //Almacena números decimales con una precición aproximada de 7 dígitos
        float varFloat = 3.402823F;
        System.out.println("El variable tipo float muestra números decimales de 32 bits. Ejemplo: "+varFloat);

        //Almacena números decimales con una precición aproximada de 16 dígitos
        double varDouble = 1.79769313486232;
        System.out.println("El variable tipo double muestra números decimales de 64 bits. Ejemplo: "+varDouble);
        System.out.println();

//Part 4
        //declare int
        int n1 = 50;
        int n2 = 10;
        System.out.println("Hemos declarado que \n" +
                "n1=50 y que\n" +
                "n2=10 ");
        System.out.println();

        //Operadores aritméticos binarios que permiten operar entre dos valores:

        System.out.println("--Operadores binarios--");
        System.out.println("Operador + | El resultado de n1 + n2 es: "+ (n1 + n2) );
        System.out.println("Operador - | El resultado de n1 - n2 es: "+ (n1 - n2) );
        System.out.println("Operador * | El resultado de n1 * n2 es: "+ (n1 * n2) );
        System.out.println("Operador / | El resultado de n1 / n2 es: "+ (n1 / n2) );
        System.out.println("Operador % | El resultado de n1 % n2 es: "+ (n1 % n2) );
        System.out.println();

        //Operadores aritméticos unarios que permiten operar con un único valor:

        System.out.println("--Operadores unarios--");
        int plusPlus = ++n1;
        System.out.println("Operador ++ | El resultado de ++n1 es: "+ plusPlus);
        n1 = 50;
        int minusMinus = --n1;
        System.out.println("Operador -- | El resultado de --n1 es: "+ minusMinus);
        n1 = 50;
        int minus = -n1;
        System.out.println("Operador  - | El resultado de -n1 es: "+ minus);
        n1 = 50;
        boolean alternateTF = !false;
        System.out.println("Operador  ! | El resultado de !false es: "+ alternateTF);
        System.out.println();

        /* Operadores aritméticos de asignación que permiten operar con un valor y la misma variable
        que almacenará el resultado de la operación.*/

        System.out.println("--Operadores aritméticos--");
        int resul = 50;
        System.out.println("Operador  = | El resultado de n1 = 50 es: "+ resul);
        resul += 50;
        System.out.println("Operador += | El resultado de += 50 es: "+ resul);
        resul -= 20;
        System.out.println("Operador -= | El resultado de -= 20 es: "+ resul);
        resul *= 7;
        System.out.println("Operador *= | El resultado de *= 7 es: "+ resul);
        resul %= 10;
        System.out.println("Operador %= | El resultado de %= 10 es: "+ resul);
        System.out.println();

        /*Operadores relacionales que nos permiten comparar dos valores para saber si son iguales
        o cual es mayor y cual menor.*/

        System.out.println("--Operadores relacionales--");
        boolean xyz = (n1 == 50);
        System.out.println("Operador == | El resultado de n1 == 50 es: "+ xyz);
        xyz = (n1 != 50);
        System.out.println("Operador != | El resultado de n1 != 50 es: "+ xyz);
        xyz = (n1 > 50);
        System.out.println("Operador  > | El resultado de n1 > 50 es: "+ xyz);
        xyz = (n1 < 50);
        System.out.println("Operador  < | El resultado de n1 < 50 es: "+ xyz);
        xyz = (n1 >= 50);
        System.out.println("Operador >= | El resultado de n1 >= 50 es: "+ xyz);
        xyz = (n1 <= 50);
        System.out.println("Operador <= | El resultado de n1 <= 50 es: "+ xyz);
        System.out.println();

        /*Operadores lógicos que nos permiten realizar operaciones lógicas obteniendo un valor boolean (true o false) a
        partir de dos valores boolean. Podremos saber si los dos valores son true, si los dos son
        false o si hay alguno que sea true o alguno que sea false.*/

        System.out.println("--Operadores lógicos--");
        System.out.println("El resultado de true && false es: "+ (true && false) );
        System.out.println("El resultado de true || false es: "+ (true || false) );
        System.out.println("El resultado de !true es: "+ (!true) );
        System.out.println();
    }
}

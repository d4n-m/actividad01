
package actividad01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Part 1
public class Ejercicio01 {
    public static void main(String[] args) throws IOException {
        /* Declaramos dos variables en las que almacenar valores numéricos
        las variables de tipo "int" nos permiten almacenar enteros
        las variables de tipo "double" nos permiten almacenar valores decimales */
        int total_melones;
        double total_leche;

        //guardamos valores enteros en las variables enteras
        total_melones = 10;
        total_leche = 20.5;

        //modificamos el contenido de las variables enteras	porque el granizo las ha mermado
        total_melones = total_melones - 5;
        total_leche = total_leche - 2;

        //mostramos por consola el valor actual de las variables enteras
        System.out.println("Quedan " + total_melones + " melones después del granizo"); //conversion implícita a String
        System.out.println("Quedan " + total_leche + " litros de leche después de beber 2 litros"); //conversion implícita a String

        //Mostramos un mensaje al usuario pidiéndole que indique un numero por consola
        System.out.println("Cuantos melones te quieres comer?"); //conversion implícita a String
        /*Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
        Las variables del tipo "BufferedReader" contienen funciones para leer datos por consola*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*utilizamos la función "readLine" de la variable "br" para leer un dato por consola
        guardamos el número introducido en la variable "valor_escrito"*/
        String valor_escrito = br.readLine();

        /*Convertimos la variable "valor_escrito" a un valor entero para poder operar con él
        y lo almacenamos en la variable "numero_melones_comer"*/
        int numero_melones_comer = Integer.parseInt(valor_escrito);  //conversion explícita a int

        total_melones = total_melones - numero_melones_comer;
        System.out.println("Finalmente quedan " + total_melones + " melones");
//Part 2
    //Mostramos un mensaje al usuario pidiéndole que indique un numero por consola
        System.out.println("Cuantos litros de leche vas a comprar?"); //conversion implícita a String

    /*utilizamos la función "readLine" de la variable "br" para leer un dato por consola
    guardamos el número introducido en la variable "valorLitrosComprar"*/
        String valorLitrosComprar = br.readLine();

    /*Convertimos la variable "valorLitrosComprar" a un valor decimal para poder operar con él
    y lo almacenamos en la variable "numero_litros_comprar"*/
        double numero_litros_comprar = Double.parseDouble(valorLitrosComprar);  //conversion explícita a double

        total_leche = total_leche + numero_litros_comprar;
        System.out.println("Finalmente quedan " + total_leche + " litros de leche.");
    }

}

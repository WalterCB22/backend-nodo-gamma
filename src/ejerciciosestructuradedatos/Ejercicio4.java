package ejerciciosestructuradedatos;

import java.util.Scanner;
/*Desarrollar un programa para mostrar por consola los primeros n numeros primos,
*siendo n un  valor que el usuario ingresará por consola.
*/
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("ingrese la cantidad de numeros primos que quieras encontrar: ");
        int insertNumber = reader.nextInt();
        int count = 0;


        for (int i = 2; count < insertNumber; i++) {
            if (isPrime(i)) {
                System.out.println("el numero " + i + " es primo");
                count++;
            }
        }
    }
    public static boolean isPrime(int numero){
        int count = 2;
        boolean prime = true;

        while ((prime) && (count != numero)){
            if(numero % count == 0)
                prime = false;
            count++;
        }
        return prime;
    }
}

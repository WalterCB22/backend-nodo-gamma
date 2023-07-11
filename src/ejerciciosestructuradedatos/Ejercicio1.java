package ejerciciosestructuradedatos;

import java.util.Scanner;
/*Desarrolar un programa para mostrar los primeros n numeros pares,
* siendo n un valor que el usuario ingresará por consola.
* Recordá que un numero es par cuando es divisible por 2
* */
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("por favor ingrese el numero a evaluar: ");
        int n = scanner.nextInt();

        System.out.println(" los primeros " + n + " numeros pares son: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }
    }
}

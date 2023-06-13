package ejerciciosestructuradedatos;

import java.util.Scanner;
/*Desarrolar un programa para mostrar los primeros n numeros pares,
 * siendo n un valor que el usuario ingresará por consola.
 * Recordá que un numero es par cuando es divisible por 2
 * */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to evaluate: ");
        int number = scanner.nextInt();

        System.out.println("The first " + number + " even numbers are: ");
        for (int i = 1; i <= number; i++){
            System.out.println(i * 2);
        }
    }
}

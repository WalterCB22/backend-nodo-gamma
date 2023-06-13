package ejerciciosestructuradedatos;

import java.util.Scanner;

/*Desarrollar un programa para mostrar por consola los primeros n numeros primos,
 *siendo n un  valor que el usuario ingresará por consola.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = scanner.nextInt();
        scanner.close();

        int count = 0;
        int number = 2;

        System.out.println("The first " + n + " prime numbers are: ");

        while (count < n){
            if(isPrime(number)){
                System.out.println(number + " ");
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for (int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}

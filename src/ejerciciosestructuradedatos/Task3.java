package ejerciciosestructuradedatos;

import java.util.Scanner;

/*
 * Desarrollar un programa para informar si un numero n es primo o no,
 * siendo n un valor que el usuario ingresara por consola.
 * Recordá que un numero es primo cuando solo es divisible por si mismo y por 1.
 * */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        boolean validation = true;
        int count = 2;

        while (validation && count < number){
            if(number % count == 0){
                validation = false;
            }else{
                count++;
            }
        }
        if(validation){
            System.out.println(number + " is prime");
        }else{
            System.out.println(number + " isn't prime");
        }
    }
}

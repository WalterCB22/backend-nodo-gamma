package ejerciciosestructuradedatos;

import java.util.Scanner;

/*
 * Desarrollar u programa para mostrar por consola los primeros n numeros naturales que
 * tienen al menos m digitos d, siendo n, m y d valores que el usuario ingresara por consola.
 * Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa debera mostrar por consola
 * los primeros 5 numeros naturales que tienen, al menos, 2 digitos 3. En este caso la salida
 * sera: 33, 133, 233, 303, 313.
 * Segun como decidas encarar la solucion de este ejercicio, es problable que necesites
 * utilizar recursos que aun no hemos estudiado. El desafio consiste en googlear como utilizar
 * dichos recursos y ¡utilizarlos!
 * */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number (n) to show the (n) first natural numbers that contain (n) digits (d): ");
        int n = scanner.nextInt();

        System.out.println("Enter an integer number (m): ");
        int m = scanner.nextInt();

        System.out.println("Enter an integer number (d): ");
        int d = scanner.nextInt();
        int count = 0;
        int number  = 1;

        while (count < n) {
            int digiteCount = 0;
            int temp = number;
            while (temp > 0){
                if (temp % 10 == d){
                    digiteCount++;
                }
                temp /= 10;
            }
            if (digiteCount == m) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

package ejerciciosestructuradedatos;

import java.util.Scanner;

/*
 * Desarrolar un programa para mostrar los primeros n multiplos de m,
 * siendo n y m valores que el usuario ingresara por consola.
 * Recordá que un numeroe s multiplo de b si es divisible por b.
 * */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        int cont = 1;

        System.out.println("What number do you want the multiples of: ");
        x = sc.nextInt();

        System.out.println("How many multiples do you want?: ");
        y = sc.nextInt();

        for (int i = 1; cont <= y; i++) {
            if (i % x == 0) {
                System.out.println(i);
                cont++;
            }
        }
    }
}

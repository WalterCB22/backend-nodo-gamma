package ejerciciosestructuradedatos;

import java.util.Scanner;

public class EjercicioDos {
    /*
     * Desarrolar un programa para mostrar los primeros n multiplos de m,
     * siendo n y m valores que el usuario ingresara por consola.
     * Recordá que un numeroe s multiplo de b si es divisible por b.
     * */

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n, m;

        System.out.println("Ingrese n: ");
        n = scanner.nextInt();

        System.out.println("Ingrese m: ");
        m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(m * i);
        }


    }
}

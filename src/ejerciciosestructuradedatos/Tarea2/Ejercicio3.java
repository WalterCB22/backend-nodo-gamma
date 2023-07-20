package ejerciciosestructuradedatos.Tarea2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número que desea evaluar: ");
        int n = scanner.nextInt();

        if (esPrimo(n)) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " NO es un número primo.");
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}

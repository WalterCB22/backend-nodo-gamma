package ejerciciosestructuradedatos.Tarea2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo para mostrar los primeros n números pares: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Debe ingresar un número válido.");
        } else {
            System.out.println("Los primeros " + n + " números pares son:");
            for (int i = 1; i <= n; i++) {
                System.out.print((i * 2) + " ");
            }
        }
    }

}

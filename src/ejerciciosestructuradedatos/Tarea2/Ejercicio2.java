package ejerciciosestructuradedatos.Tarea2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número n para la cantidad de múltiplos: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese un número m al que desea conocer sus múltiplos: ");
        int m = scanner.nextInt();

        System.out.println("Los primeros " + n + " múltiplos de " + m + " son:");

        for (int i = 1; i <= n; i++) {
            System.out.print((m * i) + " ");
        }
    }
}

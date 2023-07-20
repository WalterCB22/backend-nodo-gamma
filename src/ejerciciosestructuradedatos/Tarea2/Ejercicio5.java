package ejerciciosestructuradedatos.Tarea2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero n para mostrar los n primeros números naturales que contengan m digitos d: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese la cantidad mínima de dígitos (m): ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el dígito que desea contar (d): ");
        int d = scanner.nextInt();

        System.out.println("Los primeros " + n + " números naturales que tienen al menos " + m + " dígitos " + d + " son:");

        int contador = 0;
        int numero = 1;

        while (contador < n) {
            if (compararDigitos(numero, m, d)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
    }

    public static boolean compararDigitos(int numero, int m, int d) {
        int contador = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito == d) {
                contador++;
            }
            numero /= 10;
        }
        return contador >= m;
    }
}

package ejerciciosestructuradedatos.Tarea2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números primos que desea mostrar: ");
        int n = scanner.nextInt();

        System.out.println("Los primeros " + n + " números primos son:");
        int contador = 0;
        int numero = 2;

        while (contador < n) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
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

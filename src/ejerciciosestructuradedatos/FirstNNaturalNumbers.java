package ejerciciosestructuradedatos;

import java.util.Scanner;

public class FirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a mostrar: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese la cantidad mínima de dígitos: ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el dígito a buscar: ");
        int d = scanner.nextInt();
        scanner.close();

        showNumbers(n, m, d);
    }

    public static void showNumbers(int n, int m, int d) {
        int numerosMostrados = 0;
        int numero = 0;

        while (numerosMostrados < n) {
            int digitosD = contarDigitosD(numero, d);
            if (digitosD >= m) {
                System.out.println(numero);
                numerosMostrados++;
            }
            numero++;
        }
    }

    public static int contarDigitosD(int numero, int d) {
        int count = 0;
        while (numero != 0) {
            int digito = numero % 10;
            if (digito == d) {
                count++;
            }
            numero /= 10;
        }
        return count;
    }
}

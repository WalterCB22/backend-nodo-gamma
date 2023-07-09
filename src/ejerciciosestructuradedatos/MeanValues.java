package ejerciciosestructuradedatos;

import java.util.ArrayList;
import java.util.Scanner;

public class MeanValues {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una serie de números enteros (introduce -99 para finalizar):");

        int numero = scanner.nextInt();
        while (numero != -99) {
            numeros.add(numero);
            numero = scanner.nextInt();
        }

        int totalNumeros = numeros.size();
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }

        double media = (double) suma / totalNumeros;

        System.out.println("Número de valores leídos: " + totalNumeros);
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Media de los valores: " + media);

        System.out.println("Valores leídos:");
        int valoresMayoresQueMedia = 0;
        for (int n : numeros) {
            System.out.print(n + " ");
            if (n > media) {
                valoresMayoresQueMedia++;
            }
        }

        System.out.println("\nCantidad de valores mayores que la media: " + valoresMayoresQueMedia);
    }
}

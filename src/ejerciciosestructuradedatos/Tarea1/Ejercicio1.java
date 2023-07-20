package ejerciciosestructuradedatos.Tarea1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los números enteros (Ingrese -99 para terminar):");

        int valor = scanner.nextInt();
        while (valor != -99) {
            numeros.add(valor);
            valor = scanner.nextInt();
        }

        scanner.close();

        int cantidad = numeros.size();

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        double media = (double) suma / cantidad;

        System.out.println("Cantidad de valores leídos: " + cantidad);
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Media de los valores: " + media);

        System.out.println("Valores leídos:");
        int valoresMayoresQueMedia = 0;
        for (int numero : numeros) {
            System.out.print(numero + " ");
            if (numero > media) {
                valoresMayoresQueMedia++;
            }
        }
        System.out.println("\nCantidad de valores mayores que la media: " + valoresMayoresQueMedia);
    }

}

package ejerciciosestructuradedatos;

import java.util.Scanner;

public class EjercicioCinco {
    /*
     * Desarrollar u programa para mostrar por consola los primeros n numeros naturales que
     * tienen al menos m digitos d, siendo n, m y d valores que el usuario ingresara por consola.
     * Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa debera mostrar por consola
     * los primeros 5 numeros naturales que tienen, al menos, 2 digitos 3. En este caso la salida
     * sera: 33, 133, 233, 303, 313.
     * Segun como decidas encarar la solucion de este ejercicio, es problable que necesites
     * utilizar recursos que aun no hemos estudiado. El desafio consiste en googlear como utilizar
     * dichos recursos y ¡utilizarlos!
     * */
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Integer n, m, d, numerosMostrados = 0, numero = 0;

        System.out.println("Cuantos números quieres que se muestren?: ");
        n = scanner.nextInt();
        System.out.println("Cuantos digitos minimos quieres que tengan?: ");
        m = scanner.nextInt();
        System.out.println("Cual es digito que quieres que se repita?: ");
        d = scanner.nextInt();


        while(numerosMostrados < n) {
            if (numero.toString().contains(d.toString())){
                if (m <= numero.toString().length() - numero.toString().replace(d.toString(), "").length()) {
                    System.out.println(numero);
                    numerosMostrados++;
                }

            }
            numero++;
        }

    }
}

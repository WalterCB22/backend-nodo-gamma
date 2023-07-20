package ejerciciosestructuradedatos;

import java.util.Scanner;

public class EjercicioTres {
    /*
     * Desarrollar un programa para informar si un numero n es primo o no,
     * siendo n un valor que el usuario ingresara por consola.
     * Recordá que un numero es primo cuando solo es divisible por si mismo y por 1.
     * */
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n, m = 0;

        System.out.println("Ingrese n: ");
        n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            if(n % i == 0){
                m++;
            }
        }

        if(m<=2){
            System.out.println(n + " es primo");
        }else{
            System.out.println(n + " no es primo");

        }

    }
}

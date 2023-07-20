package ejerciciosestructuradedatos;

import java.util.Scanner;

public class EjercicioCuatro {
    /*Desarrollar un programa para mostrar por consola los primeros n numeros primos,
     *siendo n un  valor que el usuario ingresará por consola.
     */
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int cant = 0;

        System.out.println("Ingrese los n numeros primos que quieres ver: ");
        n = scanner.nextInt();

        for (int i = 2; cant < n; i++) {
            if(isPrime(i)){
                System.out.println(i + " es primo");
                cant++;
            }

        }

    }

    public static boolean isPrime(int n){
        int m = 0;
        boolean res;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                m++;
            }
        }

        if(m<=2){
            res = true;
        }else{
            res = false;
        }
        return res;

    }

}

package ejerciciosestructuradedatos;

import java.util.Scanner;

public class Multiples2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n; // numero1
        int m; // numero2

        System.out.print(" n: ");
        n = sc.nextInt();

        System.out.print(" m: ");
        m = sc.nextInt();

        if (n % m == 0) {
            System.out.printf("%d es múltiplo de %d", n, m);
        } else {
            System.out.println("No es múltiplo");

        }
    }
}

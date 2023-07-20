package estructuradedatos;

import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {

        System.out.printf("Escriba un número entero n para mostrar los n primeros números naturales que contengan m digitos d:");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        System.out.printf("Escriba un número entero m: ");
        int m = reader.nextInt();

        System.out.printf("Escriba un número entero d: ");
        int d = reader.nextInt();

        int count = 0;
        int number = 1;

        while (count < n ){
            int digitCount = 0;
            int temp = number;

            while (temp > 0){
                if (temp % 10 == d){
                    digitCount++;
                }
                temp /= 10;
            }
            if (digitCount == m){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    }
}

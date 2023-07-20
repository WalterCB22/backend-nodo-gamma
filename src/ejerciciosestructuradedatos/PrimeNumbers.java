package ejerciciosestructuradedatos;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Escribe un número n:");

        int n = sc.nextInt();

        int suma = 0;

        for(int i=1; i<=n; i++){

            int auxiliar = n%i;

            if(auxiliar == 0){
                suma = suma+1;
            }
        }

        if(suma <= 2){
            System.out.println("Si es primo");
        }
        else{
            System.out.println("No es primo");
        }

    }
}

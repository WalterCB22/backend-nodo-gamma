package ejerciciosestructuradedatos;

import java.util.Scanner;

public class EvenNumbers {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.print("Por favor ingrese un número n: ") ;
        n = teclado.nextInt () ;

        if(n % 2 == 0) {
            System.out.println(n+" es un número par.");
        }
        else {
            System.out.println(n+" no es un número par.");
        }


    }
}

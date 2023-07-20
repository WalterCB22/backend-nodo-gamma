import java.util.Scanner;


public class PrimeNumber {


    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el número a evaluar: ");
        int insertNumber = reader.nextInt();

        System.out.println("**** Número primo con ciclo FOR ***");

        boolean div = false;

        int moduloCero = 0;
        for (int i= 2; i < insertNumber && !div; i++) {
            if (insertNumber % i == 0) {
                moduloCero = moduloCero + 1;
                div = true;
            }
        }

        if (moduloCero > 0) {
            System.out.println("No es un número primo");
        } else {
            System.out.println("Si es un número primo");
        }

        System.out.println("**** Número primo con FUNCIÓN ***");

        if(esPrimo(insertNumber)) {
            System.out.println("El número " + insertNumber + " ES primo");
        } else {
            System.out.println("El número " + insertNumber + " NO es primo");
        }

    }
    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo= true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}

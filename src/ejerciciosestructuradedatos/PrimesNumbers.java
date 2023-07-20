import java.util.Scanner;

public class PrimesNumbers {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Inserte la cantidad de números primos que quiere encontrar: ");
        int InsertNumber = reader.nextInt();
        int contador = 0;

        for (int i = 2; contador < InsertNumber; i++) {
            if (isPrime(i)) {
                System.out.println("El número " + i + " Es es primo");
                contador++;
            }
        }
    }

    public static boolean isPrime(int numero) {
        int contador = 2;
        boolean prime = true;

        while ((prime) && (contador != numero)) {
            if (numero % contador == 0)
                prime = false;
            contador++;
        }
        return prime;
    }
}

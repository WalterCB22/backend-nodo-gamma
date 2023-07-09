package ejerciciosestructuradedatos;

public class NumberPrime {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese el número a validar: ");
        int n = scanner.nextInt();
        calculatePrime(n);
    }

    static void calculatePrime(Integer n) {

        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.print("El nùmero ingresado es primo");
        } else {
            System.out.print("El nùmero ingresado NO es primo");
        }
    }
}

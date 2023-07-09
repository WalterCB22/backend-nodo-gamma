package ejerciciosestructuradedatos;

public class FirstNPrimeNumbers {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese la cantidad de nùmeros primos que desea: ");
        int n = scanner.nextInt();
        calculateNPrimes(n);
    }
    static void calculateNPrimes(Integer n) {
        System.out.println("Los primeros " + n + " números primos son:");
        int contador = 0;
        for (int i = 1; contador < n; i++) {
            boolean primo = isPrime(i);
            if (primo) {
                System.out.println(i);
                contador++;
            }
        }
    }

    static boolean isPrime(Integer n) {
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        return contador == 2;
    }
}

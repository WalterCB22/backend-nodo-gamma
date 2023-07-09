package ejerciciosestructuradedatos;

public class FirstNEvenNumbers {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese la cantidad de nùmeros pares que se quieren visualizar: ");
        int n = scanner.nextInt();
        calculateNPairs(n);
    }

    static void calculateNPairs(Integer n) {
        System.out.println("Los primeros " + n + " números pares son:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }
    }
}

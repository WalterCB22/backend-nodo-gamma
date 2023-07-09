package ejerciciosestructuradedatos;

public class MultiplesNM {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese el número del que se obtendràn los multiplos: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese la cantidad: ");
        int m = scanner.nextInt();
        calculateMultiples(n,m);
    }

    static void calculateMultiples(Integer n, Integer m) {
        int contador = 0;
        for (int i = 1; contador < n ; i++) {
            if (m % i == 0) {
                System.out.println(i);
                contador++;
            }
        }
    }
}

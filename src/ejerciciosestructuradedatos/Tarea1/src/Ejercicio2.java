import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        int n = scanner.nextInt() ;
        System.out.printf("Ingrese el numero de multiplos: ");
        int m = scanner.nextInt();

        for (int i = 1; i<=m; i++){
            System.out.println("El multiplo "+ i + " de "+ n + " es: "+ n*i);
        }
    }
}

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        int n = scanner.nextInt();
        System.out.println("Numeros pares hasta "+n);
        for (int i = 2; i<=n ;i+=2){
            System.out.println(i);
        }

    }
}

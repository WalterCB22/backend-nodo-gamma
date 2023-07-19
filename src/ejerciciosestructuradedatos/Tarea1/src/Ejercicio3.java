import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        int n = scanner.nextInt();
        int cont = 0;
        for (int i = 2; i<n; i++){
            if(n%i==0){
                System.out.println("El numero no es primo");
                break;
            }else{
                System.out.println("El numero es primo");
            }
        }




    }
}

import java.util.Scanner;
public class Digitos {
    public static void main(String[]args){

        Scanner scanner =  new Scanner(System.in);

        System.out.printf("Escriba un número entero n para mostrar los n primeros números naturales que contengan m digitos d:");
        int n = scanner.nextInt();

        System.out.printf("Escriba un número entero m: ");
        int m = scanner.nextInt();

        System.out.printf("Escriba un número entero d: ");
        int d = scanner.nextInt();

        int count = 0;
        int number = 1;

        while (count < n ){
            int digitCount = 0;
            int temp = number;

            while (temp > 0){
                if (temp % 10 == d){
                    digitCount++;
                }
                temp /= 10;
            }
            if (digitCount == m){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

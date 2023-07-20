import java.util.Scanner;

public class MultipleNumbers {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el número sobre el cuál hallaremos sus multiplos: ");
        int number = reader.nextInt();
        System.out.println("Ingresa el número de multiplos que desea saber: ");
        int findToMultiples = reader.nextInt();
        int contador = 1;



        for (int i=1; contador<=findToMultiples; i++) {
            if (i % number == 0) {
                System.out.println(i);
                contador++;
            }
        }



        /*for (int i = 1; i <= findToMultiples; i++) {
            if (i % number == 0) {
                System.out.println("Los multiplos de " + number + " hasta el " + findToMultiples + " son " + i);
            }
        }*/

    }
}

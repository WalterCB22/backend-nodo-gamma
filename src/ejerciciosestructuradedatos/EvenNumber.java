import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese los números pares que quiere encontrar: ");
        int insertNumber = reader.nextInt();
        int contador = 0;

        for (int i = 2; contador < insertNumber; i++) {
            if (i % 2 == 0) {
                System.out.println("El número " + i + " es PAR");
                contador++;
            }
        }
    }
}

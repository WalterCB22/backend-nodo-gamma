import java.util.Scanner;

public class EvenNumber {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese el número a evaluar:");
        int InsertNumber = reader.nextInt();

        for (int i=2; i<= InsertNumber; i++){
            if (i%2 ==0){
                System.out.println("El número" +i + "es PAR");
            }
        }
    }
}
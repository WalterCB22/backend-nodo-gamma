import java.util.Scanner;

public class MultipleNumbers {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el número para saber sus multiplos:");
        int number = reader.nextInt();
        System.out.println("Ingresa el número mayor al anterior para saber sus multiplos hasta el número indicado");
        int findToMultiples = reader.nextInt();

        for(int i=1; i<=findToMultiples; i++){
            if (i % number == 0){
                System.out.println("Los múltiplos de"+ number + "hasta el" + findToMultiples + "son" +i);
            }
        }

    }
}

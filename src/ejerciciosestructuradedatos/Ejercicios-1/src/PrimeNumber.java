import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el número a evaluar:");
        int InsertNumber = reader.nextInt();

        System.out.println("Número primo con ciclo FOR");

        int moduloCero = 0;
        for(int i=2; i< InsertNumber; i++){
            if (InsertNumber % i == 0){
                moduloCero = moduloCero +1;
            }
        }

        if (moduloCero > 2){
            System.out.println("No es un número primo");
        } else {
            System.out.println("Si es número primo");
        }
        System.out.println("Número primo con función");
    }

}

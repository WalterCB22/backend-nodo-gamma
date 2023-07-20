import java.util.ArrayList;
import java.util.Scanner;

public class ReaderNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese un número diferente al -99: ");
        Integer number = reader.nextInt();
        ArrayList<Integer> wareHouse = new ArrayList<>();
        int stop = -99;

        while (number != stop) {
            wareHouse.add(number);
            System.out.print("Introduzca el número -99 para terminar o uno diferente para continuar: ");
            number = reader.nextInt();
        }
        System.out.println();
        System.out.println("El número total de valores que se han leido es: " + wareHouse.size());
        System.out.println("la sumatoria de los valores introducidos es: " + sumaNumeros(wareHouse));
        System.out.println("La media es: " +  mediaTotal(wareHouse));
        System.out.println("Los valores introducidos fueron: " + wareHouse);
        imprimirValores(wareHouse);
    }

    public static double sumaNumeros(ArrayList<Integer> listNumbers) {
        double suma = 0;
        for (int i = 0; i < listNumbers.size(); i++ ) {
            suma += listNumbers.get(i);
        }
        return suma;
    }

    public static double mediaTotal(ArrayList<Integer> listNumbers) {
        return (double) (sumaNumeros(listNumbers) / listNumbers.size());
    }

    public static int imprimirValores(ArrayList<Integer> listNumbers) {
        int numeroMayor = 0;
        for (Integer number : listNumbers) {
            if (number > mediaTotal(listNumbers)) {
                numeroMayor = number;
                System.out.println("El número " + numeroMayor + " es mayor que la media");
            }
        }
        return numeroMayor;
    }
}

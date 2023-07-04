import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa los números enteros(termina con -99:");

        int numero = scanner.nextInt();
        List<Integer> numeros = new ArrayList<>();

        while (numero !=-99) {
            numeros.add(numero);
            numero = scanner.nextInt();
        }
        double cantidad = numeros.size();
        int suma =0;
        for (int num: numeros) {
            suma += num;
        }

        double media = suma / cantidad;

        System.out.println("Cantidad de números leídos:" +  cantidad);
        System.out.println("Suma de los números:" +  suma);
        System.out.println("Media de los valores:" +  media);
        System.out.println("Números mayores que la media:" );

        int mayores = 0;
        for (int num: numeros) {
            if(num > media){
                System.out.println(num);
                mayores++;
            }
        }
        System.out.println("Cantidad de números mayores a la media:" +  mayores);
    }
}

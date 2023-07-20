package ejerciciosestructuradedatos;
import java.util.Scanner;
public class EjercicioUno {
    /*Desarrolar un programa para mostrar los primeros n numeros pares,
     * siendo n un valor que el usuario ingresará por consola.
     * Recordá que un numero es par cuando es divisible por 2
     * */
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int n, cont = 0;

        System.out.println("Ingrese num: ");
        n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            if(i%2==0) {
                cont++;
            }
        }

        System.out.println("La cantidad de numeros pares son: " + cont);
    }

}

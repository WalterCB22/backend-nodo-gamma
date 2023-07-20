package ejerciciosestructuradedatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioSiete {
    /*
     * Programa que lea una serie de valores numéricos enteros desde el teclado y los guarde en
     * un ArrayList de tipo Integer. La lectura de números enteros termina cuando se introduce el
     * valor -99. Este valor no se guarda en el ArrayList. A continuación el programa mostrará por
     * pantalla el número de valores que se han leído, su suma y su media. Por último se
     * mostrarán todos los valores leídos, indicando cuántos de ellos son mayores que la media.
     *
     * Necesitamos una aplicación para una tienda mediante la que queremos almacenar los
     * distintos productos que venderemos y el precio que tendrán. Y se quiere que tenga las
     * funciones básicas, introducir un elemento, modificar su precio, eliminar un producto y
     * mostrar los productos que tenemos con su precio. (todo esto solicitandoles los datos y las
     *                                                    opciones por consola)
     * */

    public static void main() {
        float media;
        int suma=0, numsMayoresMedia, num;
        List<Integer> nums = new ArrayList<Integer>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nums, -99 fin xd");
        num = scanner.nextInt();
        while(num != -99){
            nums.add(num);
            num = scanner.nextInt();
        }

        for (int n :
                nums) {
            System.out.print(n + "\t");
        }

        for (int n:
             nums) {
            suma+= n;
        }

        media = suma / nums.toArray().length;

        System.out.println("Nums leidos: " + nums.toArray().length);
        System.out.println("Suma: " + suma);
        System.out.println("media: " + media);
        System.out.println("Numeros mayores que la media: ");

        for (int n :
                nums) {
            if(n > media) System.out.print( n + "\t");
        }


    }
}

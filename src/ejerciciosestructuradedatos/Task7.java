package ejerciciosestructuradedatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integers numbers (finish with -99): ");

        int number = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        while (number != -99){
            numbers.add(number);
            number = scanner.nextInt();
        }
        double quantity = numbers.size();
        int plus = 0;
        for(int num:numbers){
            plus += num;
        }
        double media = plus / quantity;

        System.out.println("Quantity of numbers read: " + quantity);
        System.out.println("Plus of all numbers: " + plus);
        System.out.println("Average of values: " + media);
        System.out.println("numbers higher than average: ");

        int mayores = 0;
        for (int num:numbers){
            if(num > media){
                System.out.println(num);
                mayores++;
            }
        }
        System.out.println("numbers higher than average: " + mayores);
    }
}

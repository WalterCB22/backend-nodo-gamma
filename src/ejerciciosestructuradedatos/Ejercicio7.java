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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa los numeros enteros (termina con -99): ");

        int numero = scanner.nextInt();
        List<Integer> numeros = new ArrayList<>();
        while (numero != -99){
            numeros.add(numero);
            numero = scanner.nextInt();
        }
        double cantidad = numeros.size();
        int suma = 0;
        for(int num:numeros){
            suma += num;
        }
        double media = suma / cantidad;

        System.out.println("Cantidad de numeros leidos: " + cantidad);
        System.out.println("Suma de todos los numeros: " + suma);
        System.out.println("Media de los valores: " + media);
        System.out.println("Numeros mayores que la media: ");

        int mayores = 0;
        for (int num:numeros){
            if(num > media){
                System.out.println(num);
                mayores++;
            }
        }
        System.out.println("Cantidad de numeros mayores a la media: " + mayores);

    }
}

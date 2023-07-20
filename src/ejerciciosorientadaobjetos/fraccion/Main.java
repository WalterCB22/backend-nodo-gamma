package fraccion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Suma de dos fracciones: ");
        System.out.println(FraccionString.sumar("10/2", "2/4"));
        System.out.print("Suma de fraccion con entero: ");
        System.out.println(FraccionString.sumar("10/2", 5));

        char[] miArray = {'a', 'b', 'c'};
        System.out.println(miArray);
        System.out.println(String.valueOf(miArray));


    }
    /*public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;

        while (opcion !=  9) {
            mostrarMenu();
            opcion = reader.nextInt();
            switch (opcion) {
                case 1 -> sumarFraccion();
                case 2 -> sumarGraccionConEntero();
                case 3 -> restarFraccion();
                case 4 -> restarGraccionConEntero();
                case 5 -> multiplicarFraccion();
                case 6 -> multiplicarGraccionConEntero();
                case 7 -> dividirFraccion();
                case 8 -> dividirGraccionConEntero();

            }
        }

    }

    public static void mostrarMenu() {
        System.out.println("SELECCIONA LA OPCIÓN A EJECUTAR\n");
        System.out.println("1. Suma de fracionarios (a/b) + (c/d)");
        System.out.println("2. Suma de fracionarios con entero (a/b) + c");
        System.out.println("3. Resta de fracionarios (a/b) - (c/d)");
        System.out.println("4. Resta de fracionarios con entero (a/b) - c");
        System.out.println("5. Multiplicación de fracionarios (a/b) * (c/d)");
        System.out.println("6. Multiplicación de fracionarios con entero (a/b) * c");
        System.out.println("7. División de fracionarios (a/b) / (c/d)");
        System.out.println("8. División de fracionarios con entero (a/b) / c");
        System.out.println("9. Para salir");
    }

    public static void sumarFraccion() {

        System.out.println("La suma de fraccionarios es de tipo a/b + c/d, ingresa a,b,c y d en orden: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        int num4 = reader.nextInt();
        System.out.println(Fraccion.sumar(num1, num2, num3, num4));
    }

   public static void sumarGraccionConEntero() {
       System.out.println("La suma de fraccionarios es de tipo a/b + c, ingresa a,b y c en orden: ");
       int num1 = reader.nextInt();
       int num2 = reader.nextInt();
       int num3 = reader.nextInt();
       System.out.println(Fraccion.sumar(num1, num2, num3));
   }

    public static void restarFraccion() {
        System.out.println("La resta de fraccionarios es de tipo a/b - c/d, ingresa a,b,c y d en orden: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        int num4 = reader.nextInt();
        System.out.println(Fraccion.restar(num1, num2, num3, num4));
    }

    public static void restarGraccionConEntero() {
        System.out.println("La resta de fraccionarios es de tipo a/b - c, ingresa a,b y c en orden: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        System.out.println(Fraccion.restar(num1, num2, num3));
    }

    public static void multiplicarFraccion() {
        System.out.println("La multiplicación de fraccionarios es de tipo a/b * c/d, ingresa a,b,c y d en orden: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        int num4 = reader.nextInt();
        System.out.println(Fraccion.multiplicar(num1, num2, num3, num4));
    }

    public static void multiplicarGraccionConEntero() {
        System.out.println("La multiplicación de fraccionarios es de tipo a/b * c, ingresa a,b y c en orden: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        System.out.println(Fraccion.multiplicar(num1, num2, num3));
    }

    public static void dividirFraccion() {
        System.out.println("La división de fraccionarios es de tipo (a/b) / (c/d), ingresa a,b,c y d en orden: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        int num4 = reader.nextInt();
        System.out.println(Fraccion.dividir(num1, num2, num3, num4));
    }

    public static void dividirGraccionConEntero() {
        System.out.println("La división de fraccionarios es de tipo (a/b) / c, ingresa a,b y c en orden: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        System.out.println(Fraccion.dividir(num1, num2, num3));
    }*/


}

import Ejercicio1.CuentaCorriente;
import Ejercicio2.Contador;
import Ejercicio3.Libro;
import Ejercicio4.Fraccion;
import Ejercicio5.Fecha;

import java.util.Calendar;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    public static void ejercicio1(){
        Scanner scanner = new Scanner(System.in);
        CuentaCorriente cuenta1 = new CuentaCorriente();

        System.out.print("Ingrese el nombre del propietario de la cuenta: ");
        cuenta1.setNombre(scanner.nextLine());
        System.out.print("Ingrese el numero de la cuenta: ");
        cuenta1.setNumeroCuenta(scanner.nextLine());
        System.out.print("Ingrese el saldo de la cuenta: ");
        cuenta1.setSaldo(scanner.nextDouble());

        System.out.println(cuenta1.getNumeroCuenta());

        CuentaCorriente cuentaCopia = new CuentaCorriente(cuenta1);

        System.out.println(cuentaCopia.getNumeroCuenta());
    }
    public static void ejercicio2(){
        Contador contador = new Contador();

        System.out.println("AUMENTAR CONTADOR");
        while (contador.getContador()<=10){
            System.out.println(contador.getContador());
            contador.aumentarValor();
        }

        contador.setContador(10);
        System.out.println("CONTADOR = 10");
        System.out.println("DISMINUIR CONTADOR");
        while (contador.getContador()>0){
            contador.disminuirValor();
            System.out.println(contador.getContador());
        }

        contador.setContador(10);
        Contador contadorCopia = new Contador(contador);
        System.out.println(contadorCopia.getContador());
    }
    public static void ejercicio3(){
        Libro libro = new Libro();
        libro.setTitulo("Harry Potter");
        libro.setAutor("Jk rowling");
        libro.setIsbn("12313123");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Titulo del libro a prestar");
        libro.prestamo(scanner.nextLine());

        System.out.println(libro.getEstado());

        System.out.print("Titulo del libro a prestar");
        libro.prestamo(scanner.nextLine());
        System.out.println(libro.getEstado());

        System.out.print("Titulo del libro a devolver");
        libro.devolucion(scanner.nextLine());
        System.out.println(libro.getEstado());

        System.out.println(libro.toString());
    }
    public static void ejercicio4() {
        Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion();
        Scanner scanner = new Scanner(System.in);
        Integer numeroEntero = 0;


        System.out.println("El numero uno es fraccionario[1] o entero[2]: ");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese el numerador de la fraccion 1: ");
            fraccion1.setNumerador(scanner.nextInt());
            System.out.println("Ingrese el denominador de la fraccion 1: ");
            fraccion1.setDenominador(scanner.nextInt());
        } else if (opcion == 2) {
            System.out.println("Ingrese el numero entero: ");
            numeroEntero = scanner.nextInt();
        } else {
            System.out.println("Numero no valido");
        }

        System.out.println("El numero dos es fraccionario[1] o entero[2]: ");
        opcion = scanner.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese el numerador de la fraccion 1: ");
            fraccion2.setNumerador(scanner.nextInt());
            System.out.println("Ingrese el denominador de la fraccion 1: ");
            fraccion2.setDenominador(scanner.nextInt());
        } else if (opcion == 2) {
            System.out.println("Ingrese el numero entero: ");
            numeroEntero = scanner.nextInt();
        } else {
            System.out.println("Numero no valido");
        }

        if ((fraccion1.getNumerador() != null) && (fraccion2.getNumerador() == null)) {
            System.out.println("Suma de fraccion y entero: ");
            fraccion1.sumar(numeroEntero);
            System.out.println("Resta de fraccion y entero: ");
            fraccion1.restar(numeroEntero);
            System.out.println("Multiplicacion de fraccion y entero: ");
            fraccion1.multiplicar(numeroEntero);
            System.out.println("Division de fraccion y entero: ");
            fraccion1.dividir(numeroEntero);

        } else if ((fraccion1.getNumerador() == null) && (fraccion2.getNumerador() != null)) {
            System.out.println("Suma de fraccion y entero: ");
            fraccion2.sumar(numeroEntero);
            System.out.println("Resta de fraccion y entero: ");
            fraccion2.restar(numeroEntero);
            System.out.println("Multiplicaciom de fraccion y entero: ");
            fraccion2.multiplicar(numeroEntero);
            System.out.println("Division de fraccion y entero: ");
            fraccion2.dividir(numeroEntero);
        } else {
            System.out.println("Suma de las fracciones: ");
            fraccion1.sumar(fraccion2);
            System.out.println("Resta de las fracciones: ");
            fraccion1.restar(fraccion2);
            System.out.println("Multiplicacion de las fracciones: ");
            fraccion1.multiplicar(fraccion2);
            System.out.println("Division de las fracciones: ");
            fraccion1.dividir(fraccion2);
        }
    }
    public static void ejercicio5(){
        Fecha fecha = new Fecha();
        Scanner scanner = new Scanner(System.in);
        Calendar fechaHoy = Calendar.getInstance();
        String fechaActual = fechaHoy.getTime().toString();

        System.out.print("Ingrese un año: ");
        fecha.setAno(scanner.nextLine());
        System.out.print("Ingrese un mes: ");
        fecha.setMes(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Ingrese un dia: ");
        fecha.setDia(scanner.nextLine());
    }
}
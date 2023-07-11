package ejerciciosestructuradedatos;

import java.util.Scanner;
/*
* Desarrolar un programa para mostrar los primeros n multiplos de m,
* siendo n y m valores que el usuario ingresara por consola.
* Recordá que un numeroe s multiplo de b si es divisible por b.
* */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n; //cuenta
        int x; //multiplo  x:5
        int cont = 1;  //cont:1

        System.out.println("¿De que numero quieres los multiplos?: ");
        x = sc.nextInt();

        System.out.println("¿cuantos multiplos quieres?: ");
        n = sc.nextInt();

        for (int i = 1; cont <= n; i++) {   // % = modulo
            if (i % x == 0) {
                System.out.println(i);
                cont++;
            }
        }
    }
}

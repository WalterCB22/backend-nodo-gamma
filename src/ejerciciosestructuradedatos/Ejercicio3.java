package ejerciciosestructuradedatos;

import java.util.Scanner;
/*
* Desarrollar un programa para informar si un numero n es primo o no,
* siendo n un valor que el usuario ingresara por consola.
* Recordá que un numero es primo cuando solo es divisible por si mismo y por 1.
* */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner numerop = new Scanner(System.in);


        System.out.println("ingrese el numero: ");
        int num = numerop.nextInt();
        boolean cond = true;
        int i = 2;

        while(cond == true && i < num) {
            if(num % i == 0){
                cond = false;
            } else {
                i++;
            }
        }
        if (cond == true) {
            System.out.println(num + " es un numero primo");
        } else {
            System.out.println(num + " no es un numero primo");
        }
    }
}

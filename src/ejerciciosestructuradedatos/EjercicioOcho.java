package ejerciciosestructuradedatos;

import java.util.Scanner;
import java.util.Stack;

public class EjercicioOcho {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String texto, texto2="";

        System.out.println("Ingrese algo: ");
        texto = scanner.nextLine();

        Stack<Character> pila = new Stack<>();
        texto = texto.toLowerCase().replaceAll(" ", "");

        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        while(!pila.isEmpty()){
            texto2 += pila.pop();
        }

        if(texto.equals(texto2)) System.out.println(texto + " = " + texto2);
        else System.out.println(texto + " != " + texto2);
    }
}

package ejerciciosestructuradedatos;

import java.util.Scanner;
import java.util.Stack;
//Frase palindroma
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String frase = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        String fraseLimpia = frase.toLowerCase().replaceAll("\\s", "");

        for(int i = 0; i < fraseLimpia.length(); i++) {
            stack.push(fraseLimpia.charAt(i));
        }

        String nuevaFrase = "";
        while (!stack.isEmpty()) {
            nuevaFrase += stack.pop();
        }

        if(fraseLimpia.equals(nuevaFrase)) {
            System.out.println("La frase " + frase + " es un palindromo");
        } else {
            System.out.println("La frase " + frase + " no es un palindromo");
        }

    }
}

// frase.toLowerCase().replaceAll("\\s", "") = Cualquer espacio en blanco lo quita \\s*,\\s* y convierte las mayusculas



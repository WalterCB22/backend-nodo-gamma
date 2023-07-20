import java.nio.channels.Pipe;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class wordPalindrome {

    public static void main(String[] args) {

        if (isPalindrome("somos")) {
            System.out.println("La palabra es palíndrome");
        } else {
            System.out.println("La palabra no es palíndrome");
        }
    }

    public static boolean isPalindrome(String palabra) {

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }

        String backPila = "";

        while (!pila.isEmpty()) {
            backPila += pila.pop();
        }
        System.out.println(backPila);
        System.out.println(palabra.equals(backPila));
        return palabra.equals(backPila);

    }
}

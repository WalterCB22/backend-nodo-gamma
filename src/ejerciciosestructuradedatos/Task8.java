package ejerciciosestructuradedatos;

import java.util.Scanner;
import java.util.Stack;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        String cleanPhrase = phrase.toLowerCase().replaceAll("\\s", "");

        for(int i = 0; i < cleanPhrase.length(); i++) {
            stack.push(cleanPhrase.charAt(i));
        }

        String newPhrase = "";
        while (!stack.isEmpty()) {
            newPhrase += stack.pop();
        }

        if(cleanPhrase.equals(newPhrase)) {
            System.out.println("The phrase " + phrase + " is a palindrome");
        } else {
            System.out.println("The phrase " + phrase + " isn't a palindrome");
        }

    }
}

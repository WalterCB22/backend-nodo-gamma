import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el numero n: ");
        int n = scanner.nextInt();
        System.out.println("Escriba el numero m: ");
        int m = scanner.nextInt();
        System.out.printf("Escriba el numero d: ");
        int d = scanner.nextInt();

        int i = 0;
        int cont = 0;

        while (cont < n){
            if(isTrue(i, m, d)){
                cont++;
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }

    public static boolean isTrue(int i, int m, int d){
        return charCount(Integer.toString(i),(char)(d+'0'))==m;
    }

    public static int charCount(String s,char c){

        int i = 0;
        int cont = 0;
        while (i< s.length()){
            if (s.charAt(i)==c){//Recorrer un array de string
                cont++;
            }
            i++;
        }
        return cont;

    }

}

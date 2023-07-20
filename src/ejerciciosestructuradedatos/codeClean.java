public class codeClean {

    public static void main(String[] args) {

        char[] a1 = {'a', 'b', 'c', 'd', 'e'};
        char[] a2 = {};
        System.out.println(copyChars(a1, a2));
    }

    public static char[] copyChars(char[] a1, char[] a2) {
        for (int i = 0; i < a1.length; i++) {
            a1[i] = a2[i];
        }
        return a2;
    }
}

import java.util.*;

public class WordsConcurrency {

    public static void main(String[] args)  {

        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese el texto: ");
        String  text = reader.nextLine();
        text = text.replaceAll("[\\.\\,\\(\\)]", "");

        System.out.println("Solución Usando método putIfAbsent y Collections.frequency");
        concurrencyWithPutIfAndCollections(text);

        System.out.println("\nSolución Usando HashMap");
        concurrencyWithMap(text);
    }

    public static void concurrencyWithPutIfAndCollections(String text) {

        String[] textArray = text.split(" ");
        ArrayList<String> newTextList = new ArrayList<>();

        for (int i = 0; i < textArray.length; i++) {
            newTextList.add(textArray[i]);
        }

        HashMap<String, Integer> concurrencyWords = new HashMap<>();

        for (int j = 0; j < newTextList.size(); j++) {
            concurrencyWords.putIfAbsent(newTextList.get(j), Collections.frequency(newTextList, newTextList.get(j)));
        }

        imprimirWordsConcurrency(concurrencyWords);
    }

    public static void imprimirWordsConcurrency (Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.printf("La palabra '%s' se repite '%d'\n", key, map.get(key));
        }
    }
    public static void concurrencyWithMap(String text) {

        String[] textArray = text.split(" ");

        HashMap<String, Integer> concurrencyWords = new HashMap<>();

        for (String word: textArray) {
            if (concurrencyWords.containsKey(word)) {
                concurrencyWords.put(word, concurrencyWords.get(word) + 1);
            }   else {
                concurrencyWords.put(word, 1);
            }
        }
        for (HashMap.Entry<String, Integer> entry: concurrencyWords.entrySet()) {
            System.out.printf("La palabra '%s' se repite %d \n", entry.getKey(), entry.getValue());
        }
    }
}

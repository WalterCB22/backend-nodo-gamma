package ejerciciosestructuradedatos;

import java.util.*;

/*
 * Contador de palabras: Escribe un programa en Java que cuente la cantidad de
 * veces que aparece cada palabra en una cadena de texto
 * y las muestre en orden descendente de frecuencia.
 * */
public class Task6 {
    public static void main(String[] args) {
        String text = "hello hello hello hello world world house house paper";
        String[] words = text.split(" ");
        Map<String, Integer> wordsCounter = new HashMap<>();

        for(String word : words){
            if(wordsCounter.containsKey(word)){
                wordsCounter.put(word, wordsCounter.get(word) + 1);
            }else{
                wordsCounter.put(word, 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordsCounter.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> input : list) {
            System.out.println(input.getKey() + ": " + input.getValue());
        }
    }
}

package ejerciciosestructuradedatos;

import java.util.*;

public class EjercicioSeis {
    /*
     * Contador de palabras: Escribe un programa en Java que cuente la cantidad de
     * veces que aparece cada palabra en una cadena de texto
     * y las muestre en orden descendente de frecuencia.
     * */

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String text = "hola hola esto esto es es es un texto texto texto texto eso es todo claave";
        Map<String, Integer> contadorPalabras = new HashMap<String, Integer>();
        String[] palabras = text.split(" ");


        for (String palabra:palabras) {
            if(contadorPalabras.containsKey(palabra)) contadorPalabras.put(palabra, contadorPalabras.get(palabra)+1);
            else contadorPalabras.put(palabra, 1);
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(contadorPalabras.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> valor: list) {
            System.out.println(valor.getKey() + " -> " + valor.getValue());
        }
    }
}

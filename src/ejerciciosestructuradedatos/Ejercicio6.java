package ejerciciosestructuradedatos;

import java.util.*;

/*
* Contador de palabras: Escribe un programa en Java que cuente la cantidad de
* veces que aparece cada palabra en una cadena de texto
* y las muestre en orden descendente de frecuencia.
* */
public class Ejercicio6 {
    public static void main(String[] args) {
        String texto = "hola hola hola hola papel mundo mundo casa casa casa papel";

        String[] palabras = texto.split(" ");

        Map<String, Integer> contadorPalabras = new HashMap<>();

        for (String palabra : palabras) {
            if (contadorPalabras.containsKey(palabra)) {
                contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
            } else {
                contadorPalabras.put(palabra, 1);
            }
        }

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(contadorPalabras.entrySet());

        lista.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entrada : lista) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}

package fraccion;

import java.util.Scanner;

public class FraccionString {
    public static Scanner reader = new Scanner(System.in);

    public static String sumar(String fraccion1, String fraccion2) {
        String[] fraccionA = fraccion1.split("/");
        String[] fraccionB = fraccion2.split("/");

        Integer numeradorA = Integer.parseInt(fraccionA[0]);
        Integer numeradorB = Integer.parseInt(fraccionB[0]);
        Integer denominadorA = Integer.parseInt(fraccionA[1]);
        Integer denominadorB = Integer.parseInt(fraccionB[1]);


        Integer resultadoNumerador = numeradorA * denominadorB + numeradorB * denominadorA;
        Integer resultadoDenominador = denominadorA * denominadorB;

        return resultadoNumerador + "/" + resultadoDenominador;
     }

     public static String sumar(String fraccion1, Integer num) {
         String[] fraccionA = fraccion1.split("/");
         Integer numeradorA = Integer.parseInt(fraccionA[0]);
         Integer denominadorA = Integer.parseInt(fraccionA[1]);

        Integer resultadoNumerador = numeradorA + num * denominadorA;
        Integer resultadoDenominador = denominadorA;

        return resultadoNumerador + "/" + resultadoDenominador;
     }

    public static String restar(String fraccion1, String fraccion2) {
        String[] fraccionA = fraccion1.split("/");
        String[] fraccionB = fraccion2.split("/");

        Integer numeradorA = Integer.parseInt(fraccionA[0]);
        Integer numeradorB = Integer.parseInt(fraccionB[0]);
        Integer denominadorA = Integer.parseInt(fraccionA[1]);
        Integer denominadorB = Integer.parseInt(fraccionB[1]);

        Integer resultadoNumerador = numeradorA * denominadorB - numeradorB * denominadorA;
        Integer resultadoDenominador = denominadorA * denominadorB;

        return resultadoNumerador + "/" + resultadoDenominador;
    }

    public static String restar(String fraccion1, Integer num) {
        String[] fraccionA = fraccion1.split("/");
        Integer numeradorA = Integer.parseInt(fraccionA[0]);
        Integer denominadorA = Integer.parseInt(fraccionA[1]);

        Integer resultadoNumerador = numeradorA + num * denominadorA;
        Integer resultadoDenominador = denominadorA;

        return resultadoNumerador + "/" + resultadoDenominador;
    }

    public static String multiplicar(String fraccion1, String fraccion2) {
        String[] fraccionA = fraccion1.split("/");
        String[] fraccionB = fraccion2.split("/");

        Integer numeradorA = Integer.parseInt(fraccionA[0]);
        Integer numeradorB = Integer.parseInt(fraccionB[0]);
        Integer denominadorA = Integer.parseInt(fraccionA[1]);
        Integer denominadorB = Integer.parseInt(fraccionB[1]);

        Integer resultadoNumerador = numeradorA * numeradorB;
        Integer resultadoDenominador = denominadorA * denominadorB;

        return resultadoNumerador + "/" + resultadoDenominador;
    }

    public static String multiplicar(String fraccion1, Integer num) {
        String[] fraccionA = fraccion1.split("/");
        Integer numeradorA = Integer.parseInt(fraccionA[0]);
        Integer denominadorA = Integer.parseInt(fraccionA[1]);

        Integer resultadoNumerador = numeradorA * num;
        Integer resultadoDenominador = denominadorA;

        return resultadoNumerador + "/" + resultadoDenominador;
    }

    public static String dividir(String fraccion1, String fraccion2) {
        String[] fraccionA = fraccion1.split("/");
        String[] fraccionB = fraccion2.split("/");

        Integer numeradorA = Integer.parseInt(fraccionA[0]);
        Integer numeradorB = Integer.parseInt(fraccionB[0]);
        Integer denominadorA = Integer.parseInt(fraccionA[1]);
        Integer denominadorB = Integer.parseInt(fraccionB[1]);

        Integer resultadoNumerador = numeradorA * denominadorB;
        Integer resultadoDenominador = numeradorB * denominadorA;

        return resultadoNumerador + "/" + resultadoDenominador;
    }

    public static String dividir(String fraccion1, Integer num) {
        String[] fraccionA = fraccion1.split("/");
        Integer numeradorA = Integer.parseInt(fraccionA[0]);
        Integer denominadorA = Integer.parseInt(fraccionA[1]);

        Integer resultadoNumerador = numeradorA ;
        Integer resultadoDenominador = num * denominadorA;

        return resultadoNumerador + "/" + resultadoDenominador;
    }
}

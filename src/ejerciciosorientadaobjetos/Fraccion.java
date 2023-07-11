package ejerciciosorientadaobjetos;
/*
 *Crea una clase Fraccion con métodos necesarios para sumar, restar, multiplicar
 * y dividir fracciones. Todos los métodos deben estar sobrecargados de modo que también
 * puedan usarse para operar entre fracciones y números enteros (por ejemplo:⅗+2o⅝*4)
 * */
public class Fraccion {

    public static String sumar (String a, String b){
        String[] operandoA = a.split("/");
        String[] operandoB = b.split("/");

        Integer numeradorA = Integer.parseInt(operandoA[0]);
        Integer denominadorA = Integer.parseInt(operandoA[1]);

        Integer numeradorB = Integer.parseInt(operandoB[0]);
        Integer denominadorB = Integer.parseInt(operandoB[1]);

        String Numerador = String.valueOf(numeradorA * denominadorB + numeradorB * denominadorA);
        String Denominador = String.valueOf(denominadorA * denominadorB);

        return Numerador + "/" + Denominador;
    }

    public static String restar (String a, String b){
        String[] operandoA = a.split("/");
        String[] operandoB = b.split("/");

        Integer numeradorA = Integer.parseInt(operandoA[0]);
        Integer denominadorA = Integer.parseInt(operandoA[1]);

        Integer numeradorB = Integer.parseInt(operandoB[0]);
        Integer denominadorB = Integer.parseInt(operandoB[1]);

        String Numerador = String.valueOf(numeradorA * denominadorB - numeradorB * denominadorA);
        String Denominador = String.valueOf(denominadorA * denominadorB);

        return Numerador + "/" + Denominador;
    }

    public static String multiplicar (String a, String b){
        String[] operandoA = a.split("/");
        String[] operandoB = b.split("/");

        Integer numeradorA = Integer.parseInt(operandoA[0]);
        Integer denominadorA = Integer.parseInt(operandoA[1]);

        Integer numeradorB = Integer.parseInt(operandoB[0]);
        Integer denominadorB = Integer.parseInt(operandoB[1]);

        String Numerador = String.valueOf(numeradorA * numeradorB);
        String Denominador = String.valueOf(denominadorA * denominadorB);

        return Numerador + "/" + Denominador;
    }

    public static String dividir (String a, String b){
        String[] operandoA = a.split("/");
        String[] operandoB = b.split("/");

        Integer numeradorA = Integer.parseInt(operandoA[0]);
        Integer denominadorA = Integer.parseInt(operandoA[1]);

        Integer numeradorB = Integer.parseInt(operandoB[0]);
        Integer denominadorB = Integer.parseInt(operandoB[1]);

        String Numerador = String.valueOf(numeradorA * denominadorB );
        String Denominador = String.valueOf(numeradorB * denominadorA);

        return Numerador + "/" + Denominador;
    }

    public static String sumar (String a, Integer b){

        String[] operandoA = a.split("/");


        Integer numeradorA = Integer.parseInt(operandoA[0]);
        Integer denominadorA = Integer.parseInt(operandoA[1]);


        String Numerador = String.valueOf(numeradorA + b * denominadorA);
        String Denominador = String.valueOf(denominadorA);

        return Numerador + "/" + Denominador;
    }

    public static String restar (String a, Integer b){

        String[] operandoA = a.split("/");


        Integer numeradorA = Integer.parseInt(operandoA[0]);
        Integer denominadorA = Integer.parseInt(operandoA[1]);


        String Numerador = String.valueOf(numeradorA - b * denominadorA);
        String Denominador = String.valueOf(denominadorA);

        return Numerador + "/" + Denominador;
    }

    public static String multiplicar (String a,Integer b){
        String[] operandoA = a.split("/");


        Integer numeradorA = Integer.parseInt(operandoA[0]);
        Integer denominadorA = Integer.parseInt(operandoA[1]);


        String Numerador = String.valueOf(numeradorA * b);
        String Denominador = String.valueOf(denominadorA);

        return Numerador + "/" + Denominador;
    }

    public static String dividir (String a,Integer b){
        String[] operandoA = a.split("/");


        Integer numeradorA = Integer.parseInt(operandoA[0]);
        Integer denominadorA = Integer.parseInt(operandoA[1]);


        String Numerador = String.valueOf(numeradorA );
        String Denominador = String.valueOf(denominadorA * b);

        return Numerador + "/" + Denominador;
    }

}
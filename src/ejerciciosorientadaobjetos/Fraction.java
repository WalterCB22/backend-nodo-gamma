package ejerciciosorientadaobjetos;

/*
 *Crea una clase Fraccion con métodos necesarios para sumar, restar, multiplicar
 * y dividir fracciones. Todos los métodos deben estar sobrecargados de modo que también
 * puedan usarse para operar entre fracciones y números enteros (por ejemplo:⅗+2o⅝*4)
 * */

public class Fraction {
    public static String plus(String a, String b) {
        String[] operandA = a.split("/");
        String[] operandB = b.split("/");


        Integer numeratorA = Integer.parseInt(operandA[0]);
        Integer denominatorA = Integer.parseInt(operandA[1]);
        Integer numeratorB = Integer.parseInt(operandB[0]);
        Integer denominatorB = Integer.parseInt(operandB[1]);

        //Realizamos el calculo de la suma de a fraccion /B+C/D= (A*D+B+C)/B+D
        String Numerator = String.valueOf(numeratorA * denominatorB + numeratorB * denominatorA);
        String Demoninator = String.valueOf(denominatorA * denominatorB);

        return Numerator + "/" + Demoninator;
    }
}

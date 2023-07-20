package fraccion;

public class Fraccion {

    public static double sumar(double num1, double num2, double num3, double num4) {
        return (double) (num1/num2) + (num3/num4);
    }

    public static double sumar(double num1, double num2, double num3) {
        return (double) (num1/num2) + num3;
    }

    public static double restar(double num1, double num2, double num3, double num4) {
        return (double) (num1/num2) - (num3/num4);
    }

    public static double restar(double num1, double num2, double num3) {
        return (double) (num1/num2) - num3;
    }

    public static double multiplicar(double num1, double num2, double num3, double num4) {
        return (double) (num1/num2) * (num3/num4);
    }

    public static double multiplicar(double num1, double num2, double num3) {
        return (double) (num1/num2) * num3;
    }

    public static double dividir(double num1, double num2, double num3, double num4) {
        return (double) (num1/num2) / (num3/num4);
    }

    public static double dividir(double num1, double num2, double num3) {
        return (double) (num1/num2) / num3;
    }
}

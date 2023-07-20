package ejerciciosorientadaobjetos;

import java.util.Scanner;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int entero) {
        this.numerador = entero;
        this.denominador = 1;
    }

    public Fraccion sumar(Fraccion otraFraccion) {
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        int nuevoNumerador = (this.numerador * otraFraccion.denominador) + (otraFraccion.numerador * this.denominador);
        return simplificarFraccion(new Fraccion(nuevoNumerador, nuevoDenominador));
    }

    public Fraccion sumar(int entero) {
        return sumar(new Fraccion(entero));
    }

    public Fraccion restar(Fraccion otraFraccion) {
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        int nuevoNumerador = (this.numerador * otraFraccion.denominador) - (otraFraccion.numerador * this.denominador);
        return simplificarFraccion(new Fraccion(nuevoNumerador, nuevoDenominador));
    }

    public Fraccion restar(int entero) {
        return restar(new Fraccion(entero));
    }

    public Fraccion multiplicar(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.numerador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return simplificarFraccion(new Fraccion(nuevoNumerador, nuevoDenominador));
    }

    public Fraccion multiplicar(int entero) {
        return multiplicar(new Fraccion(entero));
    }

    public Fraccion dividir(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.numerador;
        return simplificarFraccion(new Fraccion(nuevoNumerador, nuevoDenominador));
    }

    public Fraccion dividir(int entero) {
        return dividir(new Fraccion(entero));
    }

    private int calcularMaximoComunDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMaximoComunDivisor(b, a % b);
        }
    }

    private Fraccion simplificarFraccion(Fraccion fraccion) {
        int mcd = calcularMaximoComunDivisor(fraccion.numerador, fraccion.denominador);
        return new Fraccion(fraccion.numerador / mcd, fraccion.denominador / mcd);
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numerador de la primera fracción:");
        int numerador1 = scanner.nextInt();

        System.out.println("Ingrese el denominador de la primera fracción:");
        int denominador1 = scanner.nextInt();

        System.out.println("Ingrese el numerador de la segunda fracción:");
        int numerador2 = scanner.nextInt();

        System.out.println("Ingrese el denominador de la segunda fracción:");
        int denominador2 = scanner.nextInt();

        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        System.out.println("Ingrese un número entero:");
        int entero = scanner.nextInt();

        Fraccion resultadoSuma = fraccion1.sumar(fraccion2);
        Fraccion resultadoResta = fraccion1.restar(fraccion2);
        Fraccion resultadoMultiplicacion = fraccion1.multiplicar(fraccion2);
        Fraccion resultadoDivision = fraccion1.dividir(fraccion2);

        Fraccion resultadoSumaEntero = fraccion1.sumar(entero);
        Fraccion resultadoRestaEntero = fraccion1.restar(entero);
        Fraccion resultadoMultiplicacionEntero = fraccion1.multiplicar(entero);
        Fraccion resultadoDivisionEntero = fraccion1.dividir(entero);

        System.out.println("Resultado de la suma de fracciones: " + resultadoSuma.getNumerador() + "/" + resultadoSuma.getDenominador());
        System.out.println("Resultado de la resta de fracciones: " + resultadoResta.getNumerador() + "/" + resultadoResta.getDenominador());
        System.out.println("Resultado de la multiplicación de fracciones: " + resultadoMultiplicacion.getNumerador() + "/" + resultadoMultiplicacion.getDenominador());
        System.out.println("Resultado de la división de fracciones: " + resultadoDivision.getNumerador() + "/" + resultadoDivision.getDenominador());

        System.out.println("Resultado de la suma de fracción y entero: " + resultadoSumaEntero.getNumerador() + "/" + resultadoSumaEntero.getDenominador());
        System.out.println("Resultado de la resta de fracción y entero: " + resultadoRestaEntero.getNumerador() + "/" + resultadoRestaEntero.getDenominador());
        System.out.println("Resultado de la multiplicación de fracción y entero: " + resultadoMultiplicacionEntero.getNumerador() + "/" + resultadoMultiplicacionEntero.getDenominador());
        System.out.println("Resultado de la división de fracción y entero: " + resultadoDivisionEntero.getNumerador() + "/" + resultadoDivisionEntero.getDenominador());
    }
}

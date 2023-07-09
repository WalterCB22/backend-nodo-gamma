package ejerciciosorientadaobjetos;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int numeroEntero) {
        this.numerador = numeroEntero;
        this.denominador = 1;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion otraFraccion) {
        int nuevoNumerador = (this.numerador * otraFraccion.denominador) + (otraFraccion.numerador * this.denominador);
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion sumar(int numeroEntero) {
        Fraccion fraccionEntero = new Fraccion(numeroEntero);
        return sumar(fraccionEntero);
    }

    public Fraccion restar(Fraccion otraFraccion) {
        int nuevoNumerador = (this.numerador * otraFraccion.denominador) - (otraFraccion.numerador * this.denominador);
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restar(int numeroEntero) {
        Fraccion fraccionEntero = new Fraccion(numeroEntero);
        return restar(fraccionEntero);
    }

    public Fraccion multiplicar(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.numerador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicar(int numeroEntero) {
        Fraccion fraccionEntero = new Fraccion(numeroEntero);
        return multiplicar(fraccionEntero);
    }

    public Fraccion dividir(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividir(int numeroEntero) {
        Fraccion fraccionEntero = new Fraccion(numeroEntero);
        return dividir(fraccionEntero);
    }
}

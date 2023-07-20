package ejerciciosorientadaobjetos;

public class Fraccion {
    private Integer numerador;
    private Integer denominador;

    public Fraccion(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(Integer numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion() {
    }


    public Fraccion sumar(Fraccion fraccionEntrante){
        Integer nuevoNumerador = (this.numerador * fraccionEntrante.getDenominador()) + (this.denominador * fraccionEntrante.getNumerador());
        Integer nuevoDenominador = this.denominador * fraccionEntrante.getDenominador();

        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion sumar(Integer numeroEntero) {
        Fraccion nuevaFraccion = new Fraccion(numeroEntero);
        return sumar(nuevaFraccion);
    }

    public Fraccion restar(Fraccion fraccionEntrante) {
        Integer nuevoNumerador = (this.numerador * fraccionEntrante.getDenominador()) - (fraccionEntrante.getNumerador() * this.denominador);
        Integer nuevoDenominador = this.denominador * fraccionEntrante.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restar(Integer numeroEntero) {
        Fraccion nuevaFraccion = new Fraccion(numeroEntero);
        return restar(nuevaFraccion);
    }

    public Fraccion multiplicacion(Fraccion fraccionEntrante){
        Integer nuevoNumerador = this.numerador * fraccionEntrante.getNumerador();
        Integer nuevoDenominador = this.denominador * fraccionEntrante.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicacion(Integer numeroEntero){
        Fraccion nuevaFraccion = new Fraccion(numeroEntero);
        return multiplicacion(nuevaFraccion);
    }

    public Fraccion division(Fraccion fraccionEntrante){
        Integer nuevoNumerador = this.numerador * fraccionEntrante.getDenominador();
        Integer nuevoDenominador = this.denominador * fraccionEntrante.getNumerador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion division(Integer numeroEntero){
        Fraccion nuevaFraccion = new Fraccion(numeroEntero);
        return division(nuevaFraccion);
    }

    @Override
    public String toString() {
        return "Fraccion: \n" + this.numerador + " --- " + this.denominador;
    }

    //getters  y setters


    public Integer getNumerador() {
        return numerador;
    }

    public void setNumerador(Integer numerador) {
        this.numerador = numerador;
    }

    public Integer getDenominador() {
        return denominador;
    }

    public void setDenominador(Integer denominador) {
        this.denominador = denominador;
    }
}

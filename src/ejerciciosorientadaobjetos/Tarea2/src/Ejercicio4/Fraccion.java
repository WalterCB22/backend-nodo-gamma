package Ejercicio4;

public class Fraccion {
    private Integer numerador;
    private Integer denominador = 1;

    public Fraccion() {
    }

    public Fraccion(Integer numerador) {
        this.numerador = numerador;
    }

    public Fraccion(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        if (denominador!=0){
            this.denominador = denominador;
        }else {
            System.out.println("El denominador tiene que ser diferente a 0");
        }
    }

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
        if (denominador!=0){
            this.denominador = denominador;
        }else {
            System.out.println("El denominador tiene que ser diferente a 0");
        }

    }

    public void sumar(Fraccion b){
        Fraccion suma = new Fraccion();
        suma.numerador = (numerador * b.denominador) + (denominador * b.numerador);
        suma.denominador = denominador* b.denominador;
        float entero;
        entero = (float) suma.numerador / suma.denominador;
        System.out.println( suma.numerador+ "/" + suma.denominador + " = " + entero);
    }

    public void sumar(Integer a){
        Fraccion suma = new Fraccion();
        suma.numerador = (numerador) + (denominador*a);
        suma.denominador = denominador;
        float entero;
        entero = (float) suma.numerador / suma.denominador;
        System.out.println( suma.numerador+ "/" + suma.denominador + " = " + entero);
    }
    public void restar(Fraccion b){
        Fraccion resta = new Fraccion();
        resta.numerador = (numerador * b.denominador) - (denominador * b.numerador);
        resta.denominador = denominador* b.denominador;
        float entero;
        entero = (float) resta.numerador / resta.denominador;
        System.out.println(resta.numerador + "/" + resta.denominador + " = " + entero );
    }
    public void restar(Integer b){
        Fraccion resta = new Fraccion();
        resta.numerador = (numerador) - (denominador * b);
        resta.denominador = denominador;
        float entero;
        entero = (float) resta.numerador / resta.denominador;
        System.out.println(resta.numerador + "/" + resta.denominador + " = " + entero );
    }

    public void multiplicar(Fraccion b){
        Fraccion multiplicar = new Fraccion();
        multiplicar.numerador = numerador*b.numerador;
        multiplicar.denominador = denominador*b.denominador;
        float entero;
        entero = (float) multiplicar.numerador / multiplicar.denominador;
        System.out.println(multiplicar.numerador + "/" + multiplicar.denominador + " = " + entero );
    }
    public void multiplicar(Integer b){
        Fraccion multiplicar = new Fraccion();
        multiplicar.numerador = numerador*b;
        multiplicar.denominador = denominador;
        float entero;
        entero = (float) multiplicar.numerador / multiplicar.denominador;
        System.out.println(multiplicar.numerador + "/" + multiplicar.denominador + " = " + entero );
    }

    public void dividir(Fraccion b){
        Fraccion dividir = new Fraccion();
        dividir.numerador = numerador*b.denominador;
        dividir.denominador = denominador*b.numerador;
        float entero;
        entero = (float) dividir.numerador / dividir.denominador;
        System.out.println(dividir.numerador + "/" + dividir.denominador + " = " + entero );
    }
    public void dividir(Integer b){
        Fraccion dividir = new Fraccion();
        dividir.numerador = numerador;
        dividir.denominador = denominador*b;
        float entero;
        entero = (float) dividir.numerador / dividir.denominador;
        System.out.println(dividir.numerador + "/" + dividir.denominador + " = " + entero );
    }
    public void mostrar(){
        float entero;
        entero = (float) numerador / denominador;
        System.out.println("Fraccion: "+this.numerador + "/" + this.denominador);
        System.out.println("Decimal: "+entero);
    }
}

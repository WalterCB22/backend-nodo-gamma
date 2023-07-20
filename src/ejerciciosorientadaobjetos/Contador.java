package ejerciciosorientadaobjetos;

import java.util.Scanner;

public class Contador {

    private int valor;


    public Contador() {
        this.valor = 0;
    }

    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }

    public Contador(Contador otroContador) {
        this.valor = otroContador.getValor();
    }

    public void incrementar() {
        this.valor++;
    }

    public void decrementar() {
        this.valor--;
    }

    public void setValor(int nuevoValor) {
        this.valor = nuevoValor;
    }

    public int getValor() {
        return this.valor;
    }

    //IMPLEMENTACIÓN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor inicial del contador: ");
        int valorInicial = scanner.nextInt();

        Contador contador1 = new Contador(valorInicial);
        System.out.println("Valor inicial del contador: " + contador1.getValor());

        System.out.print("Ingrese la cantidad de incrementos: ");
        int incrementos = scanner.nextInt();
        for (int i = 0; i < incrementos; i++) {
            contador1.incrementar();
        }
        System.out.println("Valor después de incrementar: " + contador1.getValor());

        System.out.print("Ingrese la cantidad de decrementos: ");
        int decrementos = scanner.nextInt();
        for (int i = 0; i < decrementos; i++) {
            contador1.decrementar();
        }
        System.out.println("Valor después de decrementar: " + contador1.getValor());
    }
}

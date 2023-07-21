package ejerciciosorientadaobjetos;

public class Contador {
    private int valor;

    // Constructor por defecto
    public Contador() {
        this.valor = 0;
    }

    // Constructor con parámetros
    public Contador(int valor) {
        this.valor = valor;
    }

    // Constructor copia
    public Contador(Contador otroContador) {
        this.valor = otroContador.valor;
    }

    // Método de acceso para obtener el valor del contador
    public int getValor() {
        return valor;
    }

    // Método de acceso para establecer el valor del contador
    public void setValor(int valor) {
        this.valor = valor;
    }

    // Método para incrementar el valor del contador
    public void incrementar() {
        valor++;
    }

    // Método para decrementar el valor del contador
    public void decrementar() {
        valor--;
    }
}

package ejerciciosorientadaobjetos;
/*
 * Crea una clase Contador (sí, contador de programación) con métodos que permitan
 *  incrementar y decrementar su valor. La clase contendrá un constructor por defecto
 * un constructor con parámetros, un constructor copia y los setters y getters
 * (métodos de acceso) que corresponda.
 * */
public class Contador {
    private int valor;

    //Constructor por defecto
    public Contador() {
    }

    //Constructor con parámetros
    public Contador(int valorInicial) {
        valor = valorInicial;
    }

    //Constructor copia
    public Contador(Contador otroContador) {
        valor = otroContador.getValor();
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int nuevoValor) {
        valor = nuevoValor;
    }

    public void incrementar(){
        valor++;
    }
    public void decrementar(){
        valor--;
    }
}

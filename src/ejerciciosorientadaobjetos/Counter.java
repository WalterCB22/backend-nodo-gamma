package ejerciciosorientadaobjetos;

/*
 * Crea una clase Contador (sí, contador de programación) con métodos que permitan
 *  incrementar y decrementar su valor. La clase contendrá un constructor por defecto
 * un constructor con parámetros, un constructor copia y los setters y getters
 * (métodos de acceso) que corresponda.
 * */

public class Counter {
    private int value;

    //Default constructor
    public Counter(){}

    //Constructor with parameters

    public Counter(int value) {
        this.value = value;
    }

    //Constructor duplicate
    public Counter(Counter otroContador) {
        value = otroContador.getValue();
    }

    public int getValue(){
        return value;
    }

    public void setValue(int newValue){
        value = newValue;
    }

    public void increment(){
        value++;
    }

    public void decrement(){
        value--;
    }

}

package Ejercicio2;

public class Contador {
    private int contador = 0;

    public Contador() {
    }

    public Contador(int contador) {
        this.contador = contador;
    }

    public Contador(Contador contador){
        this.contador = contador.contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void aumentarValor(){
        contador++;
    }
    public void disminuirValor(){
        contador--;
        if (contador<0){
            contador = 0;
        }
    }
}

public class Contador {
 private int valor;
 public Contador(){
     valor = 0;
 }

 public Contador(int valorInicial){ valor= valorInicial;}

    public Contador(Contador otroContador){ valor = otroContador.getValor();}
    public int getValor(){return valor;}

    public void setValor(int nuevoValor) {
        valor = nuevoValor;
    }

    public void incrementar(){valor++;}
    public void decrementar(){valor--;}
}

package ejerciciosorientadaobjetos;

public class Contador {

        private int valor;

        public Contador() {
            this.valor = 0;
        }

        public Contador(int valor) {
            this.valor = valor;
        }

        public Contador(Contador contador) {
            this.valor = contador.valor;
        }


        public int getValor() {
            return valor;
        }


        public void setValor(int valor) {
            this.valor = valor;
        }

        public void incrementar() {
            valor++;
        }

        public void decrementar() {
            valor--;
        }

}

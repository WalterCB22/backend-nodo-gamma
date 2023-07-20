package contador;

public class Main {
    public static void main(String[] args) {
      /*  Contador cuenta = new Contador();
        cuenta.setNumeroInicial(3);
        cuenta.setNumeroIncremento(5);
        cuenta.setNumeroDecremento(5);
        System.out.println("Numero inicial");
        System.out.println(cuenta.getNumeroInicial());
        cuenta.incrementar();

        System.out.println("Numero después de incremento");
        System.out.println(cuenta.getNumeroInicial());
        cuenta.decrementar();
        cuenta.decrementar();

        System.out.println("Número después del decremento");
        System.out.println(cuenta.getNumeroInicial());

        Contador cuenta2 = new Contador(cuenta);

        System.out.println("\n Valor de la cuenta 2");
        System.out.println(cuenta2.getNumeroInicial());*/

           Contador cuenta = null;
           Contador cuenta2 = new Contador(cuenta);

        System.out.println(cuenta2.getNumeroInicial());
    }
}

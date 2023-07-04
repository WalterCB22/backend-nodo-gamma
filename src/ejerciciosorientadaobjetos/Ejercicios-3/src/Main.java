import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* System.out.println("Ejercicio 1");
        ejercicio1();*/

       /* System.out.println("Ejercicio 2");
        ejercicio2();*/

        /*System.out.println("Ejercicio 3");
        ejercicio3();*/

      /*  System.out.println("Ejercicio 4");
        ejercicio4();*/

        System.out.println("Ejercicio 5");
        ejercicio5();
    }


    /*private static void ejercicio1() {
        CuentaCorriente cuenta = new CuentaCorriente();
        cuenta.setTitular("Walter");
        cuenta.setSaldo(5000000);
        System.out.println(cuenta);


        CuentaCorriente cuenta1 = new CuentaCorriente();
        cuenta1.setTitular(" Astrid Paredes");

        cuenta1.ingreso(120000);

        System.out.println("Titular de la cuenta1: " + cuenta1.getTitular());
        System.out.println("saldo actual cuenta1: " + cuenta1.getSaldo());


        cuenta1.egreso(50000);
        cuenta1.reintegro(12000);

        System.out.println("saldo actual después de las operaciones:" + cuenta1.getSaldo());

        CuentaCorriente cuenta2 = new CuentaCorriente(cuenta1);
        cuenta2.setTitular(" Juanito Perez");

        cuenta2.ingreso(300000);

        System.out.println("Titular de cuenta2: " + cuenta2.getTitular());
        System.out.println("saldo cuenta2: " + cuenta2.getSaldo());

        System.out.println("saldo de cuenta1 después de la transferencia: " + cuenta1.getSaldo());
        System.out.println("saldo de cuenta2 después de la transferencia: " + cuenta2.getSaldo());*/

   /* }*/

   /* private static void ejercicio2() {
        Contador contador1 = new Contador();
        System.out.println("valor inicial: " + contador1.getValor());



        contador1.incrementar();
        System.out.println("Valor después de incrementar: " + contador1.getValor());


        contador1.decrementar();
        System.out.println("Valor después de decrementar: " + contador1.getValor());

        Contador contador2 = new Contador(contador1);
        System.out.println("Valor Contador2: " + contador2.getValor());

        contador2.setValor(5);
        System.out.println("Nuevo valor de contador2: " + contador2.getValor());

    }*/

    /*private static void ejercicio3() {
        Libro libro1 = new Libro("El principito", "KH28373", "Alex",true );


        System.out.println("detalles del libro" + libro1);

        libro1.Prestamo();

        if (!libro1.getDisponible()) {
            System.out.println("el libro está prestado" + libro1);
        } else {
            System.out.println("el libro no está prestado" + libro1);
        }
        System.out.println("detalles del libro" + libro1.toString());

    }*/

    /*private static void ejercicio4() {

        String fraccionA = "3/4";
        String fraccionB = "1/2";
        Integer entero = 2;

        String sumaFracciones = Fraccion.sumar(fraccionA, fraccionB);
        System.out.println("Suma de fracciones: " + sumaFracciones);

        String sumaFraccionEntero = Fraccion.sumar(fraccionA, entero);
        System.out.println("Suma de fracción y entero: " + sumaFraccionEntero);

        String restaFracciones = Fraccion.restar(fraccionA, fraccionB);
        System.out.println("Resta de fracciones: " + restaFracciones);

        String restaFraccionEntero = Fraccion.restar(fraccionA, entero);
        System.out.println("Resta de fracción y entero: " + restaFraccionEntero);

        String divisionFracciones = Fraccion.dividir(fraccionA, fraccionB);
        System.out.println("Resta de fracciones: " + divisionFracciones);

        String divisionFraccionEntero = Fraccion.restar(fraccionA, entero);
        System.out.println("Resta de fracción y entero: " + divisionFraccionEntero);

        String multiplicacionFracciones = Fraccion.multiplicar(fraccionA, fraccionB);
        System.out.println("Resta de fracciones: " + multiplicacionFracciones);

        String multiplicacionFraccionEntero = Fraccion.multiplicar(fraccionA, entero);
        System.out.println("Resta de fracción y entero: " + multiplicacionFraccionEntero);
    }*/

    private static void ejercicio5() {

       var fecha = new Fecha();
        System.out.println(fecha);

        Fecha fecha2 = new Fecha();
        fecha.sumar();

        System.out.println(fecha2);
    }
}

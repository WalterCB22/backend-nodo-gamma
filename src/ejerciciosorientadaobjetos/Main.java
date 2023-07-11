package ejerciciosorientadaobjetos;

public class Main {
    public static void main(String[] args) {
        //cuenta();
        //contador();
        //libro();
        //fraccion();
        // fecha();
    }
    private static void cuenta() {
        CuentaCorriente cuenta = new CuentaCorriente();
        System.out.println(cuenta);
        //Crear una cuenta nueva
        CuentaCorriente cuenta1 = new CuentaCorriente("Andres Puerta", 1000.0);

        //Mostrar los datos de la cuenta
        System.out.println("Titular de la cuenta: " + cuenta1.getTitular());
        System.out.println("Saldo actual: " + cuenta1.getSaldo());


        //Realizar operaciones de la cuenta
        cuenta1.ingreso(500.0);

        cuenta1.egreso(200.0);

        cuenta1.reintegro(100.0);

        //Mostrar saldo actualizado
        System.out.println("Saldo actual despues de las operaciones: " + cuenta1.getSaldo());

        //Crear una nueva cuenta copiando los datos de la cuenta1
        CuentaCorriente cuenta2 = new CuentaCorriente(cuenta1);

        //Mostrar los datos de la cuenta2
        System.out.println("Titular de la cuenta2: " + cuenta2.getTitular());
        System.out.println("Saldo de cuenta2: " + cuenta2.getSaldo());

        //Realizar una transferencia desde cuenta1 a cuenta2
        cuenta1.transferencia(cuenta2, 300.0);

        //Mostrar saldos actualizados despues de la transferencia
        System.out.println("Saldo cuenta1 despues de la transferencia: " + cuenta1.getSaldo());
        System.out.println("Saldo cuenta1 despues de la transferencia: " + cuenta2.getSaldo());
    }

    private static void contador() {
        //Crear un contador nuevo
        Contador contador1 = new Contador();

        //Mostrar el valor inicial
        System.out.println("Valor inicial: " + contador1.getValor());

        //Incrementar el valor
        contador1.incrementar();
        System.out.println("Valor despues de incrementar: " + contador1.getValor());

        //Decrementar el valor
        contador1.decrementar();
        System.out.println("Valor despues del decremento: " + contador1.getValor());


        //crear un nuevo contador copiando los datos del contador1
        Contador contador2 = new Contador(contador1);
        System.out.println("Valor del contador2: " + contador2.getValor());

        //Establecer un nuevo valor para contador2
        contador2.setValor(10);
        System.out.println("Nuevo valor del contador2: " + contador2.getValor());
    }

    private static void libro() {
        //Crear nuevo libro
        Libro libro1 = new Libro("Harry Potter", "9780545582889", "Rowling, J. K.", false);

        //Mostrar los detalles del libro
        System.out.println("Detalles del libro: " + libro1.toString());

        //Mostrar el libro como prestado
        libro1.Prestamo();

        //Comprobar si el libro esta prestado
        if(!libro1.getDisponible()){
            System.out.println("El libro está prestado");
        } else {
            System.out.println("El libro no está prestado");
        }
        System.out.println("Detalles del libro: " + libro1.toString());

        //Marcar el libro como devuelto
        libro1.Devolucion();

        //Comprobar nuevamente el estado del prestamo del libro
        if(!libro1.getDisponible()){
            System.out.println("El libro está prestado");
        } else {
            System.out.println("El libro no está prestado");
        }
    }

    /*private static void fraccion() {
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

    private static void fecha(){
        Fecha fechaActual = new Fecha();
        System.out.println("Fecha actual: " + fechaActual);

        fechaActual.setDia(31);
        fechaActual.setMes(12);
        fechaActual.setAno(2022);
        System.out.println("Nueva fecha: " + fechaActual);

        if (fechaActual.esFechaCorrecta()) {
            fechaActual.sumarUnDia();
            System.out.println("Fecha después de sumar un día: " + fechaActual);
        } else {
            System.out.println("La fecha no es correcta.");
        }
    }
}
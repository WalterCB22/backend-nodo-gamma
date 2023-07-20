package cuentacorriente;

import java.util.Scanner;

public class AppTransferencia {

    public static Scanner reader= new Scanner(System.in);

    public static void main(String[] args) {
        CuentaCorriente cuentaAlex = new CuentaCorriente();
        System.out.println(cuentaAlex.getNombreCliente());

        System.out.println(" --- CREANDO CUENTA ---");
        System.out.print("Ingresa tu nombre: ");
        cuentaAlex.setNombreCliente(reader.nextLine());
        System.out.print("Ingresa número de cuenta de 6 dígitos: ");
        cuentaAlex.setNumeroCuenta(reader.nextLine());
        System.out.print("Ingresa el saldo disponible: ");
        cuentaAlex.setSaldo(reader.nextDouble());

        CuentaCorriente cuentaExtraño = new CuentaCorriente("Raro", "540275", 1000000);

        CuentaCorriente cuentaIgual = new CuentaCorriente(cuentaAlex);


        System.out.println("\n--- DATOS DE LA CUENTA ALEX ---");
        cuentaAlex.mostrarDatos();
        System.out.println("\n--- DATOS DE LA CUENTA IGUAL ---");
        cuentaIgual.mostrarDatos();
        System.out.println("\n--- DATOS DE LA CUENTA EXTRAÑO ---");
        cuentaExtraño.mostrarDatos();

        System.out.println("\n --- SALDO CUENTA ALEX DESPUÉS DE INGRESO");
        cuentaAlex.ingreso(50000);
        System.out.println(cuentaAlex.getSaldo());

        System.out.println("\n --- SALDO CUENTA ALEX DESPUÉS DEL EGRESO");

        if (cuentaAlex.egreso(500000)) {
            System.out.println("El saldo de la cuenta es: " + cuentaAlex.getSaldo());
        } else {
            System.out.println("No posee fondos suficientes");
        }


        System.out.println("\n --- TRANSFERENCIA DE 500000 LA CUENTA EXTRAÑO A CUENTA ALEX ---");
        cuentaExtraño.transferencia(cuentaAlex, 2000000);
        System.out.println("\n SALDO CUENTA ALEX DESPUÉS DE TRANSFERENCIA");
        System.out.println("El saldo de la cuenta es: " + cuentaAlex.getSaldo());
        System.out.println("\n SALDO CUENTA EXTRAÑO DESPUÉS DE TRANSFERENCIA");
        System.out.println("El saldo de la cuenta es: " + cuentaExtraño.getSaldo());


        System.out.println("\n SALDO DE LA CUENTA ALEX DESPUÉS DE REINTEGRO");
        CuentaCorriente.reintegro(cuentaAlex, 200000);
        System.out.println("El saldo de la cuenta es: " + cuentaAlex.getSaldo());

    }
}

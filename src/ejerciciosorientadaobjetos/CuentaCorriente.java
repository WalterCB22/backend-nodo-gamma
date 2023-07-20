package ejerciciosorientadaobjetos;

import java.util.Scanner;

public class CuentaCorriente {

    private double saldo;
    private String titular;


    public CuentaCorriente() {
        this.saldo = 0;
        this.titular = "";
    }

    public CuentaCorriente(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }


    public CuentaCorriente(CuentaCorriente otraCuenta) {
        this.saldo = otraCuenta.getSaldo();
        this.titular = otraCuenta.getTitular();
    }


    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }


    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }


    public void ingreso(double cantidad) {
        saldo += cantidad;
    }

    public void egreso(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void reintegro(double cantidad) {
        saldo += cantidad;
    }

    public void transferencia(double cantidad, CuentaCorriente cuentaDestino) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            cuentaDestino.saldo += cantidad;
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia");
        }
    }


    //IMPLEMENTACIÓN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaCorriente cuenta = null;
        boolean salir = false;

        while (!salir) {
            System.out.println("=== Menú ===");
            System.out.println("1. Crear una cuenta");
            System.out.println("2. Realizar ingreso");
            System.out.println("3. Realizar egreso");
            System.out.println("4. Realizar reintegro");
            System.out.println("5. Realizar transferencia");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            CuentaCorriente cuentaDestino = null;
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el titular de la cuenta: ");
                    String titular = scanner.nextLine();

                    cuenta = new CuentaCorriente(saldoInicial, titular);
                    System.out.println("Cuenta creada correctamente.");
                    System.out.println("Saldo cuenta origen: " + cuenta.getSaldo());
                    break;
                case 2:
                    if (cuenta != null) {
                        System.out.print("Ingrese la cantidad a ingresar que sea mayor a cero: ");
                        double cantidadIngreso = scanner.nextDouble();
                        cuenta.ingreso(cantidadIngreso);
                        System.out.println("Ingreso realizado correctamente.");
                        System.out.println("Saldo final cuenta origen: " + cuenta.getSaldo());
                    } else {
                        System.out.println("Primero debe crear una cuenta");
                    }
                    break;
                case 3:
                    if (cuenta != null) {
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double cantidadEgreso = scanner.nextDouble();
                        cuenta.egreso(cantidadEgreso);
                        System.out.println("Retiro realizado correctamente.");
                        System.out.println("Saldo final cuenta origen: " + cuenta.getSaldo());
                    } else {
                        System.out.println("Primero debe crear una cuenta");
                    }
                    break;
                case 4:
                    if (cuenta != null) {
                        System.out.print("Ingrese la cantidad a reintegrar: ");
                        double cantidadReintegro = scanner.nextDouble();
                        cuenta.reintegro(cantidadReintegro);
                        System.out.println("Reintegro realizado correctamente.");
                        System.out.println("Saldo final cuenta origen: " + cuenta.getSaldo());
                    } else {
                        System.out.println("Primero debe crear una cuenta");
                    }
                    break;
                case 5:
                    if (cuenta != null) {
                        System.out.print("Ingrese el saldo inicial de la cuenta destino: ");
                        double saldoInicialDestino = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Ingrese el titular de la cuenta destino: ");
                        String titularDestino = scanner.nextLine();
                        cuentaDestino = new CuentaCorriente(saldoInicialDestino, titularDestino);

                        System.out.print("Ingrese la cantidad a transferir: ");
                        double cantidadTransferencia = scanner.nextDouble();
                        cuenta.transferencia(cantidadTransferencia, cuentaDestino);
                        System.out.println("Transferencia realizada correctamente.");
                        System.out.println("Saldo final cuenta origen: " + cuenta.getSaldo());
                        System.out.println("Saldo final cuenta destino: " + cuentaDestino.getSaldo());
                    } else {
                        System.out.println("Primero debe crear una cuenta");
                    }
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
            System.out.println();
        }

        scanner.close();
    }
}

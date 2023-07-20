package cuentacorriente;

public class CuentaCorriente {
    private String nombreCliente;
    private String numeroCuenta;
    private double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombreCliente, String numeroCuenta, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente account) {
        this.nombreCliente = account.nombreCliente;
        this.numeroCuenta = account.numeroCuenta;
        this.saldo = account.saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean ingreso(double valorIngreso) {
        if (valorIngreso < 0) {
            return false;
        }
        this.saldo = this.saldo + valorIngreso;
        return true;
    }

    public boolean egreso(double valorEgreso) {
        if (valorEgreso > this.saldo) {
            return false;
        }
        this.saldo = this.saldo - valorEgreso;
        return true;
    }

    public static boolean reintegro(CuentaCorriente account, double valorReintegro) {
        if (valorReintegro < 0) {
            return false;
        }
        account.saldo = account.saldo + valorReintegro;
        return true;
    }


    public boolean transferencia(CuentaCorriente destino, double importe) {
        if (importe > this.saldo) {
            return  false;
        } else {
            egreso(importe);
            destino.ingreso(importe);
        }
        return true;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombreCliente + ", el número de la cuentas es:" + numeroCuenta + ", saldo disponible: " + saldo);
    }
}

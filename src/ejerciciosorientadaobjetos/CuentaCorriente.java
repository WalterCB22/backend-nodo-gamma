package ejerciciosorientadaobjetos;

public class CuentaCorriente {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor por defecto
    public CuentaCorriente() {
    }

    // Constructor con parámetros
    public CuentaCorriente(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Constructor que copia los datos de otra CuentaCorriente
    public CuentaCorriente(CuentaCorriente otraCuenta) {
        this.numeroCuenta = otraCuenta.numeroCuenta;
        this.titular = otraCuenta.titular;
        this.saldo = otraCuenta.saldo;
    }

    // Métodos de acceso - Getter y Setter
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos de la clase
    public void ingreso(double monto) {
        saldo += monto;
    }

    public void egreso(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void reintegro(double monto) {
        saldo += monto;
    }

    public void transferencia(CuentaCorriente otraCuenta, double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            otraCuenta.saldo += monto;
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        }
    }
}

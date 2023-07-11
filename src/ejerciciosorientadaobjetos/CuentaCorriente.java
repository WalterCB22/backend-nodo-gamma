package ejerciciosorientadaobjetos;
/*
 *Crea una clase CuentaCorriente, con los métodos: ingreso, egreso, reintegro y transferencia.
 *La clase contendrá un constructor por defecto, uno con parámetros y otro
 * que recibirá una CuentaCorriente de la cual copiará todos sus datos. Además se deben
 * desarrollar los métodos de acceso (para cada variable de instancia de la clase, desarrollar
 * un método set y otro get. Por ejemplo: si la clase tiene una variable double saldo, sus
 * métodos de acceso serán: double getSaldo() y void setSaldo(double s).
 **/
public class CuentaCorriente {
    private String titular;
    private double saldo;

    //Constructor por defecto
    public CuentaCorriente() {
        titular = "";
        saldo = 0.0;
    }

    //Constructor con parametros
    public CuentaCorriente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Constructor que copia los datos de otra cuenta
    public CuentaCorriente(CuentaCorriente otraCuenta) {
        this.titular = otraCuenta.getTitular();
        this.saldo = otraCuenta.getSaldo();
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

    public void ingreso(double cantidad) {
        saldo += cantidad;
    }

    public void egreso(double cantidad) {
        if(cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void reintegro(double cantidad) {
        saldo += cantidad;
    }

    public void transferencia(CuentaCorriente cuentaDestino, double cantidad) {
        if(cantidad <= saldo) {
            saldo -= cantidad;
            cuentaDestino.ingreso(cantidad);
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia");
        }
    }
}

package Ejercicio1;

public class CuentaCorriente {
    private String nombre;
    private String numeroCuenta;
    private Double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombre, String numeroCuenta, Double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this.nombre = cuentaCorriente.nombre;
        this.numeroCuenta = cuentaCorriente.numeroCuenta;
        this.saldo = cuentaCorriente.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}

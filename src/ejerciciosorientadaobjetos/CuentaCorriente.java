package ejerciciosorientadaobjetos;


public class CuentaCorriente {
    private String titular;
    private Double saldo;


    public CuentaCorriente(){
        this.titular = "JPRP";
        this.saldo = 0.0;
    }

    public CuentaCorriente(String titular, Double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this.titular = cuentaCorriente.getTitular();
        this.saldo = cuentaCorriente.getSaldo();
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}

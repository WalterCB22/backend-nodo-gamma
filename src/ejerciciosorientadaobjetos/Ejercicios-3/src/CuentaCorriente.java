public class CuentaCorriente {


    private String titular;

    private double saldo;

    public CuentaCorriente() {
        titular ="Astrid Paredes" ;
        saldo = 0.0;
    }

    public CuentaCorriente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

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

    public double getSaldo()    {
        return saldo;
    }

    public void setSaldo(double saldo) {this.saldo = saldo;}

 public void ingreso (double cantidad){ saldo+= cantidad;}

    public void egreso (double cantidad){
        if (cantidad
        <= saldo ) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void reintegro (double cantidad){saldo += cantidad;}

    public void transferencia (CuentaCorriente cuentaDestino, double cantidad){
        if (cantidad <= saldo) {
            saldo -= cantidad;
            cuentaDestino.ingreso(cantidad);
        } else{
            System.out.println("Saldo insuficiente para realizar la transferencia");
        }
    }

    @Override
    public String toString(){
        return "Cuenta Corriente {" +
            " titular='" + titular + '\''+", saldo=" + saldo + '}';
        }
    }



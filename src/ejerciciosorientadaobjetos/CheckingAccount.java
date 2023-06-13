package ejerciciosorientadaobjetos;

/*
 *Crea una clase CuentaCorriente, con los métodos: ingreso, egreso, reintegro y transferencia.
 *La clase contendrá un constructor por defecto, uno con parámetros y otro
 * que recibirá una CuentaCorriente de la cual copiará todos sus datos. Además se deben
 * desarrollar los métodos de acceso (para cada variable de instancia de la clase, desarrollar
 * un método set y otro get. Por ejemplo: si la clase tiene una variable double saldo, sus
 * métodos de acceso serán: double getSaldo() y void setSaldo(double s).
 **/
public class CheckingAccount {
    private String owner;
    private double balance;

    //Default constructor
    public CheckingAccount(){
        owner = "";
        balance = 0.0;
    }

    //Constructor with parameters
    public CheckingAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    //Constructor copying data from another account
    public CheckingAccount(CheckingAccount anotherAccount) {
        this.owner = anotherAccount.getOwner();
        this.balance = anotherAccount.getBalance();
    }

    //Getters and setters
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void income(double quantity){
        balance += quantity;
    }
    public void egress(double quantity){
        if(quantity <= balance){
            balance-=quantity;
        }else{
            System.out.println("insufficient balance");
        }
    }
    public void refund(double quantity){
        balance+=quantity;
    }

    public void transference(CheckingAccount destinationAccount, double quantity){
        if(quantity <= balance){
            balance -= quantity;
            destinationAccount.income(quantity);
        }else{
            System.out.println("Insufficient balance for transfer");
        }
    }
}

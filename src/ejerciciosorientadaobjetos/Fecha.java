package ejerciciosorientadaobjetos;
import java.util.GregorianCalendar;
/*
 * Crea una clase Fecha. La clase contendrá además de los constructores que
 * consideres adecuados, métodos de acceso y el método toString, tal como lo explicamos en
 * el ejercicio anterior, un método para comprobar si la fecha es correcta y otro para sumarle
 * un día al valor actual de la fecha. Se debe investigar y utilizar la clase GregorianCalendar
 * para implementar los métodos y constructores de Fecha
 * */

public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    private GregorianCalendar calendar;

    public Fecha() {
        GregorianCalendar calendario = new GregorianCalendar();
        this.dia = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        this.mes = calendario.get(GregorianCalendar.MONTH) + 1;
        this.ano = calendario.get(GregorianCalendar.YEAR);
    }

    //Constructor
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean esFechaCorrecta() {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setLenient(false);
        calendario.set(GregorianCalendar.YEAR, this.ano);
        calendario.set(GregorianCalendar.MONTH, this.mes - 1); // Restamos 1 para ajustar al rango 0-11
        calendario.set(GregorianCalendar.DAY_OF_MONTH, this.dia);

        try {
            calendario.getTime(); // Intentamos obtener la fecha, esto lanza una excepción si es inválida
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void sumarUnDia() {
        GregorianCalendar calendario = new GregorianCalendar(this.ano, this.mes - 1, this.dia);
        calendario.add(GregorianCalendar.DAY_OF_MONTH, 1);

        this.dia = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        this.mes = calendario.get(GregorianCalendar.MONTH) + 1;
        this.ano = calendario.get(GregorianCalendar.YEAR);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}

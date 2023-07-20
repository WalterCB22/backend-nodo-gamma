package ejerciciosorientadaobjetos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    /*
     * Crea una clase Fecha. La clase contendrá además de los constructores que
     * consideres adecuados, métodos de acceso y el método toString, tal como lo explicamos en
     * el ejercicio anterior, un método para comprobar si la fecha es correcta y otro para sumarle
     * un día al valor actual de la fecha. Se debe investigar y utilizar la clase GregorianCalendar
     * para implementar los métodos y constructores de Fecha
     * */

    private int day;
    private int month;
    private int year;
    private GregorianCalendar gregorianCalendar;


    public Fecha(){
        GregorianCalendar calendario = new GregorianCalendar();
        this.day = calendario.get(calendario.DAY_OF_MONTH);
        //se suma uno porque GregorianCalendar maneja los meses de 0 a 11
        this.month = calendario.get(calendario.MONTH) + 1;
        this.year = calendario.get(calendario.YEAR);
    }

    public Fecha(int dia, int mes, int ano, GregorianCalendar calendario) {
        this.day = dia;
        this.month = mes;
        this.year = ano;
        this.gregorianCalendar = calendario;
    }

    public void addOneDay(){
        GregorianCalendar calendario = new GregorianCalendar(this.year, this.month - 1, this.day);
        calendario.add(GregorianCalendar.DAY_OF_MONTH, 1);

        this.day = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        //se suma uno porque GregorianCalendar maneja los meses de 0 a 11
        this.month = calendario.get(GregorianCalendar.MONTH) + 1;
        this.year = calendario.get(GregorianCalendar.YEAR);
    }

    public boolean verificarFecha(){
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setLenient(false);
        calendario.set(GregorianCalendar.YEAR, this.year);
        //se resta -1 pa que quede de 0 a 11 y no de problemas
        calendario.set(GregorianCalendar.MONTH, this.month - 1);
        calendario.set(GregorianCalendar.DAY_OF_MONTH, this.day);

        try{
            calendario.getTime();
            return true;
        }catch (Exception e){
            return false;
        }
    }


    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }


    //getter y setters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }
}

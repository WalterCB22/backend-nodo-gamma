package ejerciciosorientadaobjetos;

/*
 * Crea una clase Fecha. La clase contendrá además de los constructores que
 * consideres adecuados, métodos de acceso y el método toString, tal como lo explicamos en
 * el ejercicio anterior, un método para comprobar si la fecha es correcta y otro para sumarle
 * un día al valor actual de la fecha. Se debe investigar y utilizar la clase GregorianCalendar
 * para implementar los métodos y constructores de Fecha
 * */

import java.util.GregorianCalendar;

public class Date {
   private int day;
   private int month;
   private int year;
   private GregorianCalendar gregorianCalendar;

   public Date(){
       GregorianCalendar calendar = new GregorianCalendar();
       this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
       this.month = calendar.get(GregorianCalendar.MONTH) + 1;
       this.year = calendar.get(GregorianCalendar.YEAR);
   }
    //Constructor
    public Date(int day, int month, int year, GregorianCalendar gregorianCalendar) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.gregorianCalendar = gregorianCalendar;
    }

    //Getters and setters

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

   public boolean isCorrectDate(){
       GregorianCalendar calendar = new GregorianCalendar();
       calendar.setLenient(false);
       calendar.set(GregorianCalendar.YEAR, this.year);
       calendar.set(GregorianCalendar.MONTH, this.month - 1); // Restamos 1 para ajustar al rango 0-11
       calendar.set(GregorianCalendar.DAY_OF_MONTH, this.day);

       try{
           calendar.getTime();
           return true;
       }catch (Exception e){
           return false;
       }
   }

    public void plusDay() {
        GregorianCalendar calendar = new GregorianCalendar(this.year, this.month - 1, this.day);
        calendar.add(GregorianCalendar.DAY_OF_MONTH, 1);

        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        this.month = calendar.get(GregorianCalendar.MONTH) + 1;
        this.year = calendar.get(GregorianCalendar.YEAR);
    }

    @Override
    public String toString(){
       return String.format("%02d/%02d/%04d", day, month, year);
    }
}

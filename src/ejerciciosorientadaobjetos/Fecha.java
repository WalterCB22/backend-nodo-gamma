package ejerciciosorientadaobjetos;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha() {

        GregorianCalendar calendario = new GregorianCalendar();
        this.dia = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        this.mes = calendario.get(GregorianCalendar.MONTH) + 1;
        this.año = calendario.get(GregorianCalendar.YEAR);
    }

    public int getDia() { return dia; }

    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }

    public void setMes(int mes) { this.mes = mes; }

    public int getAño() { return año; }

    public void setAño(int año) { this.año = año; }

    public boolean esFechaCorrecta() {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setLenient(false);
        calendario.set(GregorianCalendar.YEAR, año);
        calendario.set(GregorianCalendar.MONTH, mes - 1);
        calendario.set(GregorianCalendar.DAY_OF_MONTH, dia);
        try {
            calendario.getTime();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void sumarUnDia() {
        GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
        calendario.add(GregorianCalendar.DAY_OF_MONTH, 1);
        this.dia = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        this.mes = calendario.get(GregorianCalendar.MONTH) + 1;
        this.año = calendario.get(GregorianCalendar.YEAR);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, año);
    }


    //IMPLEMENTACION
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha (formato: dd/mm/yyyy):");
        String input = scanner.nextLine();
        String[] dateParts = input.split("/");

        if (dateParts.length == 3) {
            int dia = Integer.parseInt(dateParts[0]);
            int mes = Integer.parseInt(dateParts[1]);
            int año = Integer.parseInt(dateParts[2]);

            Fecha date = new Fecha(dia, mes, año);
            System.out.println("Fecha ingresada: " + date);

            if (date.esFechaCorrecta()) {
                date.sumarUnDia();
                System.out.println("La fecha después de agregar un día es: " + date);
            } else {
                System.out.println("Fecha incorrecta!");
            }
        } else {
            System.out.println("Formato de entrada inválido!");
        }
    }
}

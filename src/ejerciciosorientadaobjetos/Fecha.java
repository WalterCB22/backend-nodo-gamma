package ejerciciosorientadaobjetos;

import java.util.GregorianCalendar;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    public Fecha() {
        GregorianCalendar calendario = new GregorianCalendar();
        dia = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        mes = calendario.get(GregorianCalendar.MONTH) + 1; // Sumamos 1 porque enero es representado por 0
        ano = calendario.get(GregorianCalendar.YEAR);
    }

    public Fecha(int dia, int mes, int ano) {
        if (validarFecha(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Fecha inválida.");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validarFecha(dia, mes, ano)) {
            this.dia = dia;
        } else {
            System.out.println("Día inválido.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validarFecha(dia, mes, ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mes inválido.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validarFecha(dia, mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Año inválido.");
        }
    }

    private boolean validarFecha(int dia, int mes, int ano) {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setLenient(false); // Desactivamos la opción de tolerancia de calendario

        try {
            calendario.set(ano, mes - 1, dia); // Restamos 1 al mes porque enero es representado por 0
            calendario.getTime(); // Intentamos obtener la fecha correspondiente
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void sumarUnDia() {
        GregorianCalendar calendario = new GregorianCalendar(ano, mes - 1, dia); // Restamos 1 al mes porque enero es representado por 0
        calendario.add(GregorianCalendar.DAY_OF_MONTH, 1);

        dia = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        mes = calendario.get(GregorianCalendar.MONTH) + 1; // Sumamos 1 porque enero es representado por 0
        ano = calendario.get(GregorianCalendar.YEAR);
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

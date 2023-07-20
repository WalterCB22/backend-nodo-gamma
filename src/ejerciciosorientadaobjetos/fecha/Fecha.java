package fecha;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    public static void main(String[] args) {
        Calendar fecha = GregorianCalendar.getInstance();
        System.out.println("La fecha actual es: " + fecha.getTime().toLocaleString());

        fecha.set(2005, Calendar.MARCH, 29);
        System.out.println("La fecha actualizada con SET es: " + fecha.getTime());
        fecha.set(Calendar.MONTH,1);
        System.out.println("El mes actualizado con set: " + fecha.getTime()); //MUESTRA INCOHERENCIA PORQUE SET ES PARA ACTUALIZAR FECHA COMPLETA
        fecha.set(Calendar.DAY_OF_MONTH, 32);
        System.out.println("El día actualizado con set: " + fecha.getTime()); //MUESTRA INCOHERENCIA PORQUE SET ES PARA ACTUALIZAR FECHA COMPLETA
        fecha.add(Calendar.MONTH, 13);
        System.out.println("Mes actualizado con add: " + fecha.getTime());
        fecha.add(Calendar.HOUR, 25);
        System.out.println("Hora actualizada con add: " + fecha.getTime());
        fecha.roll(Calendar.HOUR, 25);
        System.out.println("HORA ACTUALIZADA CON ROLL: " + fecha.getTime()); //NO ACTUALIZA YA QUE ROLL PERMITE AGREGAR MAXIMO 23 HORAS
        //SI LA FECHA ACTUAL YA VAN CORRIDAS 12 HORAS, CON ROLL PODREMOS AGREGAR COMO MAXIMO OTRAS 11 HORAS

        DateFormat newFecha = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        System.out.println("Fecha formateada: " + newFecha.format(fecha.getTime()));

    }
}

package fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class FechaEjercicio {
    private Calendar fecha;
    private Locale locale;
    private SimpleDateFormat formatOfDate;

    public FechaEjercicio(){
        this.fecha = GregorianCalendar.getInstance();
        this.locale = Locale.ENGLISH;
        this.formatOfDate = this.formatOfDate;
    }

    public FechaEjercicio(String fecha){
        this.fecha = GregorianCalendar.getInstance();

        this.locale = Locale.getDefault();

        this.formatOfDate = new SimpleDateFormat("dd-MM-yyyy");
        this.formatOfDate.setLenient(false);

        try {
            this.fecha.setTime(formatOfDate.parse(fecha));
        } catch (ParseException e){
            this.fecha = GregorianCalendar.getInstance();
        }
    }


    public Calendar getFecha(){return fecha;}

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Calendar sumar(){

        this.fecha.add(Calendar.DAY_OF_MONTH, 1);
        return this.fecha;
    }
    public static Boolean validar(String fecha){

        try {
            SimpleDateFormat a = new SimpleDateFormat(fecha);
            a.parse(fecha);

            return true;
        } catch (ParseException e){
            return false;
        }
    }

    @Override
    public String toString(){

        return "la fecha es: " + this.fecha.get(Calendar.DAY_OF_MONTH) + " de "
                + this.fecha.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("es")) + " del año "
                + this.fecha.get(Calendar.YEAR);
    }
}

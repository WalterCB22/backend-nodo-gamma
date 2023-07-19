package Ejercicio5;


public class Fecha {
    private String ano;
    private Integer mes;
    private String dia;

    public Fecha() {
    }

    public Fecha(String ano, Integer mes, String dia) {
        this.ano = ano;
        /*if (mes>12){
            System.out.println("Ingrese un mes valido");
        }else {*/
            this.mes = mes;

        this.dia = dia;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        /*if (mes>12){
            System.out.println("Ingrese un mes valido");
        }else {
            */this.mes = mes;

    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    public void fechaCorrecta(Fecha fecha){

    }
}

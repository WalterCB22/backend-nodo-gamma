package ejerciciosorientadaobjetos;

public class Libro {
    private String titulo;
    private String ISBN;
    private String autor;
    private Boolean disponible;


    public Libro(String titulo, String ISBN, String autor, Boolean disponible) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.disponible = disponible;
    }

    public Libro() {

    }

    public boolean prestar(){
        if(this.disponible) {
            setDisponible(false);
            return true;
        }
        else return false;
    }

    public boolean devolver(){
        if(this.disponible == false) {
            setDisponible(true);
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Libro: \n" + this.titulo + "\t" + this.ISBN + "\t" + this.autor;
    }

    //getter y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}

package ejerciciosorientadaobjetos;
/*
 *Crea una clase Libro con los métodos: préstamo, devolución y toString, cuyo prototipo
 * debe ser: public String toString(). Este método debe retornar una cadena que represente al
 * objeto. Por ejemplo: si la clase tiene los atributos: título, isbn y autor, una cadena que
 * represente a un libro podría ser: “Harry Potter, 9780545582889, Rowling, J. K.”. La clase
 * contendrá un constructor por defecto, un constructor con parámetros y los
 * métodos de acceso.
 * */
public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private Boolean disponible;

    public Boolean Prestamo(){
        if(this.disponible.equals(true)){
            this.disponible = false;
            return true;
        } else
            return false;
    }

    public void prestamoDevolucion(){
        this.disponible = !this.disponible;
    }

    public Boolean Devolucion(){
        if(this.disponible.equals(false)){
            this.disponible = true;
            return true;
        } else
            return false;
    }

    public Libro(String titulo, String isbn, String autor, Boolean disponible) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = disponible;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", disponible=" + disponible +
                '}';
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

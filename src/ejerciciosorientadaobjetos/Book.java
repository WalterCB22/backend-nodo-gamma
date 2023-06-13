package ejerciciosorientadaobjetos;
/*
 *Crea una clase Libro con los métodos: préstamo, devolución y toString, cuyo prototipo
 * debe ser: public String toString(). Este método debe retornar una cadena que represente al
 * objeto. Por ejemplo: si la clase tiene los atributos: título, isbn y autor, una cadena que
 * represente a un libro podría ser: “Harry Potter, 9780545582889, Rowling, J. K.”. La clase
 * contendrá un constructor por defecto, un constructor con parámetros y los
 * métodos de acceso.
 * */
public class Book {
    private String title;
    private String isBn;
    private String author;
    private Boolean available;

    public Boolean load(){
        if(this.available.equals(true)){
            this.available = false;
            return true;
        }else{
            return false;
        }
    }

    public void loadReturn(){
        this.available = !this.available;
    }

    public Boolean returnn(){
        if(this.available.equals(false)){
            this.available = true;
            return true;
        } else
            return false;
    }

    public Book(){}

    public Book(String title, String isBn, String autor, boolean available) {
        this.title = title;
        this.isBn = isBn;
        this.author = autor;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsBn() {
        return isBn;
    }

    public void setIsBn(String isBn) {
        this.isBn = isBn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isBn + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}

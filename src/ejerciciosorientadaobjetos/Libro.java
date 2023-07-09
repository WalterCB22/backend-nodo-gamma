package ejerciciosorientadaobjetos;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private boolean prestado;

    public Libro() {
        prestado = false;
    }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        prestado = false;
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

    public boolean isPrestado() {
        return prestado;
    }

    public void prestamo() {
        if (prestado) {
            System.out.println("El libro ya está prestado.");
        } else {
            prestado = true;
            System.out.println("El libro se ha prestado correctamente.");
        }
    }

    public void devolucion() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro se ha devuelto correctamente.");
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    /*
    Cuando intentas imprimir un objeto de la clase Libro,
    si el método toString no ha sido anulado correctamente
    (es decir, si no has utilizado la anotación @Override y cambiado el nombre a toString),
    se utilizará el comportamiento predeterminado del método toString de la clase Object.
     */
    @Override
    public String toString() {
        return titulo + ", " + isbn + ", " + autor;
    }
}

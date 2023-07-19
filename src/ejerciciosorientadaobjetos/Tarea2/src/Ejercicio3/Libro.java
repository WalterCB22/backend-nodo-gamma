package Ejercicio3;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private String estado = "En biblioteca";

    public Libro() {
    }

    public Libro(String titulo, String isbn, String autor, String estado) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.estado = estado;
    }

    public Libro(Libro libro){
        this.titulo = libro.titulo;
        this.isbn = libro.isbn;
        this.autor = libro.autor;
        this.estado = libro.estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public void prestamo (String Titulo){

        if (Titulo.equals(titulo)) {
            if (estado == "En biblioteca") {
                estado = "En prestamo";
            } else {
                System.out.println("El libro ya se encuentra prestado");
            }
        }else {
            System.out.println("El libro no existe");
        }
    }

    public void devolucion (String Titulo){

        if (Titulo.equals(titulo)){
            if (estado == "En prestamo"){
                estado = "En biblioteca";
            }else {
                System.out.println("El libro ya se encuentra en biblioteca");
            }
        }else {
            System.out.println("El libro no existe");
        }

    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

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

    public Boolean Prestamo() {
        if (this.disponible.equals(true)) {
            this.disponible = false;
            return true;
        } else {
            return false;
        }
    }


    public void prestamoDevolucion() {
        this.disponible = !this.disponible;
    }

    public Boolean Devolucion() {
        if (this.disponible.equals(false)) {
            this.disponible = true;
            return true;
        } else{
            return false;
    }

}



    @Override

    public String toString(){
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", ISBN= '" + ISBN +  '\'' +
                ", autor= '" + autor + '\'' +
                ", disponible= '" + disponible +
                '}';
    }


}
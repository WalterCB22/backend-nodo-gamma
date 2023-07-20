package libro;

public class Libro {
    private String titulo;
    private String autor;
    private int cantidad;
    private int prestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int cantidad, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public boolean prestarLibro() {
        boolean prestamo = true;
        if (prestados < cantidad) {
            prestados++;
        } else {
            prestamo = false;
        }
        return prestamo;
    }

    public boolean devolverLibro() {
        boolean devolucion = true;
        if (prestados != 0) {
            prestados--;
        } else  {
            devolucion = false;
        }
        return devolucion;
    }


    public String toString() {
        return  "Título: " + titulo + " autor: " + autor + " cantidad : " + cantidad + " prestados: " + prestados;
    }

    /*@Override
    public String toString() {
        return "Título: " + titulo + " autor: " + autor + " cantidad : " + cantidad + " prestados: " + prestados;
    }*/
}

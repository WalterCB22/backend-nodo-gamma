package ejerciciosorientadaobjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = true;
    }


    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getIsbn() { return isbn; }

    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getAutor() { return autor; }

    public void setAutor(String autor) { this.autor = autor; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }


    public void prestamo() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible en este momento.");
        }
    }


    public void devolucion() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }


    @Override
    public String toString() {
        return titulo + ", " + isbn + ", " + autor;
    }

    //IMPLEMENTACIÓN

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Libro> libros = new ArrayList<>();

        System.out.println("Bienvenido al sistema de gestión de libros");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n¿Qué acción desea realizar?");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese los datos del libro:");
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    Libro libro = new Libro(titulo, isbn, autor);
                    libros.add(libro);
                    System.out.println("El libro ha sido agregado correctamente.");
                    break;
                case 2:
                    if (libros.isEmpty()) {
                        System.out.println("\nNo hay libros disponibles.");
                    } else {
                        System.out.println("\nLibros disponibles:");
                        for (int i = 0; i < libros.size(); i++) {
                            System.out.println((i + 1) + ". " + libros.get(i).toString());
                        }

                        System.out.print("Seleccione el número del libro a prestar: ");
                        int numPrestamo = scanner.nextInt();
                        scanner.nextLine();

                        if (numPrestamo >= 1 && numPrestamo <= libros.size()) {
                            Libro libroPrestamo = libros.get(numPrestamo - 1);
                            libroPrestamo.prestamo();
                        } else {
                            System.out.println("Número de libro inválido.");
                        }
                    }
                    break;
                case 3:
                    if (libros.isEmpty()) {
                        System.out.println("\nNo hay libros disponibles.");
                    } else {
                        System.out.println("\nLibros prestados:");
                        for (int i = 0; i < libros.size(); i++) {
                            if (!libros.get(i).isDisponible()) {
                                System.out.println((i + 1) + ". " + libros.get(i).toString());
                            }
                        }

                        System.out.print("Seleccione el número del libro a devolver: ");
                        int numDevolucion = scanner.nextInt();
                        scanner.nextLine();

                        if (numDevolucion >= 1 && numDevolucion <= libros.size()) {
                            Libro libroDevolucion = libros.get(numDevolucion - 1);
                            libroDevolucion.devolucion();
                        } else {
                            System.out.println("Número de libro inválido.");
                        }
                    }
                    break;
                case 4:
                    continuar = false;
                    System.out.println("\n¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción inválida.");
                    break;
            }
        }
        System.out.println("\nLista de libros:");
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }

        scanner.close();
    }
}

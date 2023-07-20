package ejerciciosestructuradedatos.Tarea1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    private static Map<String, Double> productos = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("----- Tienda -----\n");
            System.out.println("1. Introducir un producto");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar los productos");
            System.out.println("5. Salir");
            System.out.print("\nIngrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> introducirProducto();
                case 2 -> modificarPrecioProducto();
                case 3 -> eliminarProducto();
                case 4 -> mostrarProductos();
                case 5 -> System.out.println("¡Gracias por utilizar la aplicación!");
                default -> System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }

            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }

    private static void introducirProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        if (productos.containsKey(nombre)) {
            System.out.println("El producto ya existe. Se actualizará su precio.");
        }

        productos.put(nombre, precio);
        System.out.println("Producto agregado exitosamente.");
    }

    private static void modificarPrecioProducto() {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();

        if (productos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            productos.put(nombre, precio);
            System.out.println("Precio del producto modificado exitosamente.");
        } else {
            System.out.println("El producto no existe. No se puede modificar el precio.");
        }
    }

    private static void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("El producto no existe. No se puede eliminar.");
        }
    }

    private static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
        } else {
            System.out.println("----- Productos -----\n");

            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                String nombre = entry.getKey();
                double precio = entry.getValue();
                System.out.println(nombre + " - Precio: $" + precio);
            }
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Mapa {
    public static void main(String[] args) {
        Map<String, Double> productos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> agregarProducto(productos, scanner);
                case 2 -> modificarPrecio(productos, scanner);
                case 3 -> eliminarProducto(productos, scanner);
                case 4 -> mostrarproductos(productos);
                case 5 -> System.out.println("Hasta luego");
                default -> System.out.println("Opción inválida. Inténtalo de nuevo");
            }

        }

    }

    public static void mostrarMenu() {
        System.out.println("\n------MENÚ------");
        System.out.println("1.Agregar producto");
        System.out.println("2.Modificar precio de un producto");
        System.out.println("3.Eliminar producto");
        System.out.println("4.Mostrar productos");
        System.out.println("5.Salir");
        System.out.println("selecciona una opción");
    }


    public static void agregarProducto(Map<String, Double> productos, Scanner scanner) {
        System.out.println("\n------AGREGAR PRODUCTO------");
        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.next();

        System.out.println("Ingrese en precio del producto");
        double precio = scanner.nextDouble();

        productos.put(nombre, precio);
        System.out.println("Producto agregado correctamente");
    }


    public static void modificarPrecio(Map<String, Double> productos, Scanner scanner) {
        System.out.println("\n------MODIFICAR PRECIO------");
        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.next();

        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio del producto");
            double nuevoPrecio = scanner.nextDouble();

            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio del prodcuto modificado correctamente");
        } else {
            System.out.println("El prodcuto no existe en la lista");
        }
    }

    public static void eliminarProducto(Map<String, Double> productos, Scanner scanner) {
        System.out.println("\n------ELIMINAR PRODUCTO------");
        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.next();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente");
        } else {
            System.out.println("El producto no existe en la lista");
        }
    }

    public static void mostrarproductos(Map<String, Double> productos) {
        System.out.println("\n------PRODUCTOS------");

        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados");
        } else {
            for (Map.Entry<String, Double> producto : productos.entrySet()) {
                System.out.println("Producto:" + producto.getKey() + ", precio:" + producto.getValue());
            }
        }
    }
}
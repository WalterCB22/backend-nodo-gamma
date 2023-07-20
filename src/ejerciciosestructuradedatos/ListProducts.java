import java.util.*;


public class ListProducts {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Integer> listaProductos = new HashMap<>();
        int opcionElegida = 0;

        while (opcionElegida != 5) {
            System.out.println("\nMENÚ DE OPCIONES\n");
            mostrarMenu();
            System.out.print("Introduzca la opción que desea ejecutar: ");
            opcionElegida = reader.nextInt();

            switch (opcionElegida) {
                case 1 -> introducirProducto(listaProductos);
                case 2 -> modificarProducto(listaProductos);
                case 3 -> eliminarProducto(listaProductos);
                case 4 -> mostrarProductos(listaProductos);
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1 para Introducir un producto");
        System.out.println("2 para modificar precios a productos");
        System.out.println("3 para eliminar un producto");
        System.out.println("4 para mostrar lista de productos");
        System.out.println("5 para salir");
    }
    public static void introducirProducto(HashMap<String, Integer> producto) {
        System.out.println("\n--- AGREGAR PRODUCTOS ---\n");
        System.out.println("Ingrese el nombre del producto: ");
        String nombreProducto = reader.next();
        System.out.println();
        System.out.print("Ingrese el valor: ");
        Integer valorProducto = reader.nextInt();

        if (producto.containsKey(nombreProducto)) {
            System.out.println("El producto ya se encuentra registrado");
        } else
            producto.put(nombreProducto, valorProducto);
    }
    public static void modificarProducto(HashMap<String, Integer> producto ) {

        System.out.println("\n--- MODIFICAR PRECIO ---\n");
        System.out.println("Ingrese el nombre del producto al que le desea modificar su valor: ");
        String nombreProducto = reader.next();

        if (!producto.containsKey(nombreProducto)) {
            System.out.println("El producto no existe en el inventario");
        } else {
            System.out.println("Ingrese el nuevo valor del producto: ");
            Integer precioNuevo = reader.nextInt();
            producto.put(nombreProducto, precioNuevo);
        }
    }
    public static void eliminarProducto(HashMap<String, Integer> producto) {
        System.out.println("\n--- ELIMINA PRODUCTOS ---\n");
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        String nombreProducto = reader.next();

        if (producto.containsKey(nombreProducto)) {
            producto.remove(nombreProducto);
        } else
            System.out.println("El producto no existe en el inventario");
    }
    public static void mostrarProductos(HashMap<String, Integer> producto) {
        System.out.println("\n--- LOS PRODUCTOS EN EL INVENTARIO SON: ---\n");
        if (producto.isEmpty()){
            System.out.println("No hay productos en el inventario");
        } else {
            for (String key: producto.keySet()) {
                System.out.printf("El producto: '%s' cuesta: %d \n", key, producto.get(key));
            }
        }
    }
}

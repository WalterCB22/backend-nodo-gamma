package libro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libro elPrincipito = new Libro();

        elPrincipito.setTitulo("El Principito");
        elPrincipito.setAutor("Antoine de Saint-Exupéry");
        elPrincipito.setcantidad(3);
        elPrincipito.setPrestados(1);

        System.out.println("\n VALORES INICIALES \n ");
        System.out.println(elPrincipito.toString());

        System.out.println("\n VALORES DESPUÉS DE PRESTAR 2 LIBRO \n ");
        elPrincipito.prestarLibro();
        elPrincipito.prestarLibro();
        System.out.println(elPrincipito);


        System.out.println("\n VALORES DESPUÉS DE DEVOLVER 1 LIBRO \n ");
        elPrincipito.devolverLibro();
        System.out.println(elPrincipito);


    }
}

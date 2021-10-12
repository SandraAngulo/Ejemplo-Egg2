package coleccionpelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ColeccionPelicula {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> ListPelicula = new ArrayList();
        String qhago;
        Pelicula objPelicula3 = new Pelicula();
        objPelicula3.setTitulo("Bella y bestia");
        objPelicula3.setDirector("Romina");
        objPelicula3.setDuracion(2);
        ListPelicula.add(objPelicula3);
        Pelicula objPelicula4 = new Pelicula();
        objPelicula4.setTitulo("Era de hielo");
        objPelicula4.setDirector("Sandra");
        objPelicula4.setDuracion(3);
        ListPelicula.add(objPelicula4);

        do {
            Pelicula objPelicula = new Pelicula();

            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = Leer.next(); //pido la informa

            System.out.println("Ingrese el director de la pelicula");
            String director = Leer.next(); //pido la informa
            System.out.println("Ingrese la duracion de la pelicula");
            Integer duracion = Leer.nextInt(); //pido la informa

            objPelicula.setTitulo(titulo);
            objPelicula.setDirector(director);
            objPelicula.setDuracion(duracion);
            ListPelicula.add(objPelicula);

            System.out.println("Desea ingresar otra Pelicula? ");
            qhago = Leer.next();
        } while (qhago.equalsIgnoreCase("S"));
        System.out.println("----------Lista de peliculas ingresadas  :");

        ListPelicula.forEach((a) -> System.out.println(a));
        System.out.println("----------Lista de peliculas de mas de 1 hora de duracion  :");
        for (Pelicula aux : ListPelicula) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        }

        ListPelicula.sort(Pelicula.ordenPorDuracionAsc);
        System.out.println("----------Lista de peliculas ordenadas por duracion (de mayor a menor): ");
        ListPelicula.forEach((a) -> System.out.println(a));
        
        ListPelicula.sort(Pelicula.ordenPorDuracionDesc);
        System.out.println("----------Lista de peliculas ordenadas por duracion (de menor a mayor): ");
        ListPelicula.forEach((a) -> System.out.println(a));
        
        ListPelicula.sort(Pelicula.ordenPorTitulo);
        System.out.println("-------------Listado ordenado porTitulo: ");
        ListPelicula.forEach((a) -> System.out.println(a));

        ListPelicula.sort(Pelicula.ordenPorDirector);
        System.out.println("-------------Listado ordenado por director: ");
        ListPelicula.forEach((a) -> System.out.println(a));

    }
}

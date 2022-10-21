package booking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList< Alojamiento> aloja = new ArrayList();

        Hotel_4 h1 = new Hotel_4(true, "Los Mas Picantes", 45, 45, 80, 5, 50, "La Trampa", "Av Siempreviva", "Springfield", "El Seba");
        
        Hotel_5 h2 = new Hotel_5(3, 10, 3, true, "Resto Betancour and Cristian ", 60, 70, 120, 8, 50, "Telooo", "Alla", "Tuculandia", "Goku");

        Hotel_4 h3 = new Hotel_4(true, "Resto picante", 45, 4, 70, 15, 20, "Hotelll", "Av Siempreviva", "Springfield", "Scaloneta");

        Hotel_5 h5 = new Hotel_5(5, 6, 1, false, "Resto Betancour and Cristian ", 40, 30, 60, 3, 40, "Kakaroto", "Mar Del Plata", "Planeta Kaio", "Vegeta");

        Camping c1 = new Camping(50, 3, false, false, 1000, "Guerreros Z", "Miramar ", "3 Picos", "Gohan");

        Camping c4 = new Camping(40, 1, true, true, 2000, "Universo 7", "Mendoza ", "San Luis", "Quique");

        Residencia r3 = new Residencia(45, true, true, true, 200, "La resi", "Messirve", "Santa Fe", "El pulga");

        aloja.add(h1);
        aloja.add(h2);
        aloja.add(h3);
        aloja.add(h5);
        aloja.add(c1);
        aloja.add(c4);
        aloja.add(r3);

        mostrarTodos(aloja);

        System.out.println("***********");

        masCaroaBarato(aloja);

        System.out.println("***********");

        campingConResto(aloja);

        System.out.println("***********");

        dtoResidencia(aloja);
        System.out.println("************");
    }

    public static void mostrarTodos(ArrayList<Alojamiento> aloja) {
        for (Alojamiento aux : aloja) {
            System.out.println(aux.toString());

        }

    }

    public static void masCaroaBarato(ArrayList<Alojamiento> aloja) {
        ArrayList<Hotel> hoteles = new ArrayList();

        for (Alojamiento alojamiento : aloja) {
            if (alojamiento instanceof Hotel) {
                Hotel object = (Hotel) alojamiento;

                hoteles.add(object);
            }
            Collections.sort(hoteles, ordenarporprecio);

        }

        for (Hotel hotele : hoteles) {
            System.out.println(hotele);

        }

    }

    public static Comparator<Hotel> ordenarporprecio = new Comparator<Hotel>() {

        @Override
        public int compare(Hotel t, Hotel t1) {
            Double precio1 = t.preciohab();
            Double precio2 = t1.preciohab();
            return precio2.compareTo(precio1);
        }

    };

    public static void campingConResto(ArrayList<Alojamiento> aloja) {

        for (Alojamiento alojamiento : aloja) {
            if (alojamiento instanceof Camping) {
                Camping object = (Camping) alojamiento;
                if (object.restaurante) {
                    System.out.println(object);

                }
            }

        }

    }

    public static void dtoResidencia(ArrayList<Alojamiento> aloja) {

        for (Alojamiento alojamiento : aloja) {
            if (alojamiento instanceof Residencia) {
                Residencia object = (Residencia) alojamiento;
                if (object.descuento_gremio) {
                    System.out.println(object);

                }
            }

        }

    }

}

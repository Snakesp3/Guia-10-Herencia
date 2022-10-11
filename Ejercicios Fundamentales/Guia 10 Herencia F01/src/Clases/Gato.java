package Clases;



    public class Gato extends Animal {

        public Gato(String nombre, String alimento, int ano, String raza) {
            super(nombre, alimento, ano, raza);
        }

              

        @Override
        public void feed() {
            System.out.println("El es " + nombre + " el de la Pelicula,un Gato de "+ano+ " años de raza " +raza+ " y come " + alimento);
        }
    }



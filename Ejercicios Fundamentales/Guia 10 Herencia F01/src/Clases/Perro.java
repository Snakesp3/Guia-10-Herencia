package Clases;

 public class Perro extends Animal {

        public Perro(String nombre, String alimento, int ano, String raza) {
            super(nombre, alimento, ano, raza);
        }

        @Override
        public void feed() {
            System.out.println("El es " + nombre + " el de la vida Moderna, un Perro de "+ ano + " años de raza " +raza+ " y come "  + alimento  );
        }
    }



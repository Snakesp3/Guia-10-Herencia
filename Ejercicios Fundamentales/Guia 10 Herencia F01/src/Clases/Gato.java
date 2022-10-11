package Clases;

public class Gato {

    public class gato extends Animal {

        public gato(String name, String food, int age, String breed) {
            super(name, food, age, breed);
        }

        @Override
        public void feed() {
            System.out.println("Hi, i am " + name + " a cat, i eat " + food);
        }
    }
}

package Clases;

public class Perro {

    public class perro extends Animal {

        public perro(String name, String food, int age, String breed) {
            super(name, food, age, breed);
        }

        @Override
        public void feed() {
            System.out.println("Hi, i am " + name + " a dog, i eat " + food);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Caballo extends Animal {
    public Caballo(String name, String food, int age, String breed) {
        super(name,food,age,breed);
    }

    @Override
    public void feed() {
        System.out.println("Hi, i am "+name+" a horse, i eat "+food);
    }
}

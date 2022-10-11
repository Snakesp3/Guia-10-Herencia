/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Caballo extends Animal {
    public Caballo(String nombre, String alimento, int ano, String raza) {
        super(nombre,alimento,ano,raza);
    }

    @Override
    public void feed() {
        System.out.println("El es "+nombre+" un Caballo Culiado de "+ ano + " años de raza " +raza+ " y come " +alimento);
    }
}


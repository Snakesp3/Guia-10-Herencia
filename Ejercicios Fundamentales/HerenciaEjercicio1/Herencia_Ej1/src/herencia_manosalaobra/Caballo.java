/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_manosalaobra;

/**
 *
 * @author Maxi
 */
public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
public void Alimentarse(){
    
        System.out.println("Hola soy un caballo, me llamo "+nombre+" y como "+alimento);
    
}    
}

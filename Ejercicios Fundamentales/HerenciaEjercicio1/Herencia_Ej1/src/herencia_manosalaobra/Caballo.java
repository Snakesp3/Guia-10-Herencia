
package herencia_manosalaobra;


public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
public void Alimentarse(){
    
        System.out.println("Hola soy un caballo, me llamo "+nombre+" y como "+alimento);
    
}    
}

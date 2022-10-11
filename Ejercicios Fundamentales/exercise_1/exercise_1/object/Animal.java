
package exercise_1.object;


public class Animal {
    
    protected String nombre;
    protected String alimento;
    protected int ano;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int ano, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.ano = ano;
        this.raza = raza;
    }
    
    public void feed(){
        
    }
}

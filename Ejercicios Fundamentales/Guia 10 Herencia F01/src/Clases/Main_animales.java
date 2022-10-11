
package Clases;


public class Main_animales {

    
    public static void main(String[] args) {
        Animal dog1 = new Dog("Stich", "Carnivorous",15,"Doberman");
        dog1.feed();
        
        Animal dog2 = new Dog("Teddy","Croquettes",10,"chihuahua");
        dog2.feed();
        
        Animal cat1 = new Cat("Pelusa","Cookies",15,"SiamÃ©s");
        
        Animal horse1 = new Horse("Spark","Grass",25,"Fino");
        horse1.feed();
    }
    
}

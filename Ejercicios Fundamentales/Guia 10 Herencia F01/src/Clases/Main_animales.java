
package Clases;




public class Main_animales {

    
    public static void main(String[] args) {
        System.out.println("******************************************************************************************");
        Animal p1 = new Perro("Roco", "Hambuerguesas",7,"Doberman");
        p1.feed();
        System.out.println("******************************************************************************************");
         //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // System.out.println("**************************************************************************");
        Animal c1 = new Gato("Hercules","Whiska",4,"Cordon con vereda");
        c1.feed();
        System.out.println("******************************************************************************************");
       // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       // System.out.println("****************************************************************");
        Animal h1 = new Caballo("Tornado","Pasto",12,"Mustang");
        h1.feed();
        System.out.println("******************************************************************************************");
    }
    
}

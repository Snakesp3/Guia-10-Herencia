
package Herenciaeje03;


public class Main_electrodomestico {

   
    public static void main(String[] args) {
        Electrodomestico ele1 = new Electrodomestico();
        Tv t1 = new Tv();
        Lavadora l1 = new Lavadora();
        ele1.crearElectrodomestico();
        System.out.println(ele1.toString());
        System.out.println(t1.toString());
        System.out.println(l1.toString());
    }
    
}

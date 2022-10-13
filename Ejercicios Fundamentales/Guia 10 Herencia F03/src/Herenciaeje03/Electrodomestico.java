/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herenciaeje03;

import java.util.Scanner;

/**
 *
 * @author Snakesp2
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;
    
    Scanner leer = new Scanner(System.in);
    
    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

//    @Override
//    public String toString() {
//        return "Electrodomestico" + " precio: " + precio + " color: " + color + " consumo: " + consumo + " peso: " + peso + "";
//    }
    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
      sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
      objeto y no será visible.*/
   
    public void comprobarConsumoEnergetico(char letra) {

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            consumo = letra;
        } else {
            consumo = 'F';

        }
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.*/

    public void comprobarColor(String color) {

        if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")) {
            color = color;
        } else {
            color = "Blanco";
        }
    }
    
    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.*/
    
    public void crearElectrodomestico(){
        System.out.println("**************************************");
        System.out.println("***INFORMACION DEL ELECTRODOMESTICO***");
        System.out.println("**************************************");
        
        System.out.println("Ingrese el consumo enegetico A,B,C,D,E,F");
        String color=leer.next();
        
        System.out.println("Ingrese el color del electrodomestico");
        char consumo=leer.next().charAt(0);
        
        System.out.println("Ingrese el peso del electrodomestico");
        double peso=leer.nextDouble();
        
        precio=1000d;
        
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);
    }
    
}

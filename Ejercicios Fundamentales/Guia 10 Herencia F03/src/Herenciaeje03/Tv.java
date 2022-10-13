/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herenciaeje03;

/**
 *
 * @author Snakesp2
 */
public class Tv extends Electrodomestico{
    
    protected double resolucion;
    protected boolean tdt;

    public Tv() {
    }

    public Tv(double resolucion, boolean tdt, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Tv" + "resolucion:" + resolucion + " tdt: " + tdt + "";
    }

  
    
    
}


package booking;


public class Hotel_4 extends Hotel {

    protected boolean gimnasio;
    protected String nombre_resto;
    protected int cap_rest;

    public Hotel_4(boolean gimnasio, String nombre_resto, int cap_rest, int cantHab, int numeroCamas, int cantPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(cantHab, numeroCamas, cantPisos, precioHab, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombre_resto = nombre_resto;
        this.cap_rest = cap_rest;

    }

    public Hotel_4() {
    }

    @Override
    public double capacidadHotel() {
        return this.numeroCamas * this.cantPisos;

    }

    @Override
    public double valorGym() {

        double valor;
        if (gimnasio) {
            valor = 50;
        } else {
            valor = 30;

        }
        return valor;

    }

    @Override
    public String toString() {

        return super.toString()+"\n" + "\n     <<<Hotel 4 Estrellas>>>\n" + "\n Gimnasio:" + gimnasio + "\n Nombre Restoran: " + nombre_resto + "\n Capacidad del Restaurante:" + cap_rest +" Personas";
    }

    @Override
    public double preciohab() {

        return this.precioHab = 50 + (1 * capacidadHotel()) + valorResto() + valorGym();

    }

    @Override
    public double valorResto() {
        double valor2 = 0;
        if (this.cap_rest < 30) {
            valor2 = 10;

        } else if (this.cap_rest >= 30 && this.cap_rest <= 50) {
            valor2 = 30;
        } else if (this.cap_rest > 50) {
            valor2 = 50;
        }

        return valor2;
    }

    public void mostrar() {
        System.out.println("");

    }

}

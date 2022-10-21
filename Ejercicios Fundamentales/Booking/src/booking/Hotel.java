package booking;

public abstract class Hotel extends Alojamiento {

    protected int cantHab;
    protected int numeroCamas;
    protected int cantPisos;
    protected double precioHab;

    public Hotel(int cantHab, int numeroCamas, int cantPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.numeroCamas = numeroCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    @Override
    public String toString() {
        return "           \n           ***HOTEL"
                + "*****************************\n" + "\n Cantidad de Habitaciones:" + cantHab + "\n Numero de Camas:" + numeroCamas + "\n Cantidad de Pisos:" + cantPisos + "\n Precio de habitacion:" + "$"+precioHab + "";
    }
    
    

    public Hotel() {
    }

    public abstract double preciohab();

    public abstract double valorResto();

    public abstract double valorGym();

    public abstract double capacidadHotel();

}

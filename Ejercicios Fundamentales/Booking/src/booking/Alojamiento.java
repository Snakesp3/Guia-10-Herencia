package booking;

public class Alojamiento {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public Alojamiento() {

    }

    @Override
    public String toString() {
        return "Alojamientos" + "\n Nombre:" + nombre + "\n Direccion:" + direccion + "\n Localidad:" + localidad + "\n Gerente:" + gerente +"";
    }

}

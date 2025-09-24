package clases;

public class Lavadora extends Electrodomestico {

    private int capacidad;

    public Lavadora() {

    }

    public Lavadora(String marca, String nombre, int capacidad) {
        super(marca, nombre);
        this.capacidad = capacidad;

    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

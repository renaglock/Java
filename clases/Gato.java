package clases;

public class Gato extends Animal {

    private String raza;

    public Gato() {
    }

    public Gato(String nombre, String tipoAlimento, int edad, String raza) {
        super(nombre, tipoAlimento, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}

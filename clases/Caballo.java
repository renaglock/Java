package clases;

public class Caballo extends Animal {

    private String comida;

    public Caballo() {
    }

    public Caballo(String nombre, String tipoAlimento, int edad, String comida) {
        super(nombre, tipoAlimento, edad);
        this.comida = comida;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}

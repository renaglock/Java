package clases;

public class Perro extends Animal {

    private String messure;

    public Perro() {
    }

    public Perro(String nombre, String tipoAlimento, int edad, String messure) {
        super(nombre, tipoAlimento, edad);
        this.messure = messure;
    }

    public String getMessure() {
        return messure;
    }

    public void setMessure(String messure) {
        this.messure = messure;
    }
}

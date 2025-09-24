package clases;

public class Animal {

    private String nombre;
    private String tipoAlimento;
    private int edad;

    public Animal() {
    }

    public Animal(String nombre, String tipoAlimento, int edad) {
        this.nombre = nombre;
        this.tipoAlimento = tipoAlimento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

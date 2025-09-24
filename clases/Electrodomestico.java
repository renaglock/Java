package clases;

public class Electrodomestico {

    private String marca;
    private String color;

    public Electrodomestico() {

    }

    public Electrodomestico(String marca, String color) {
        this.marca = marca;
        this.color = color;

    }
    public String getMarca(){
        return marca;
    }
        public String getColor(){
        return color;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setColor(String color){
        this.color = color;
    }
}
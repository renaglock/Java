package clases;

public class Principal {

    public static void main(String[] args) {
        Perro objPerro = new Perro();

        objPerro.setNombre("Princeso");
        objPerro.setTipoAlimento("Carne");
        objPerro.setEdad(5);
        objPerro.setMessure("Grande");

        System.out.println(objPerro.getMessure() + "Nombre: " + objPerro.getNombre()
                + "\n Alimentación: " + objPerro.getTipoAlimento()
                + "\n Edad: " + objPerro.getEdad()
                + "\n Tamaño: " + objPerro.getMessure());
    }

}

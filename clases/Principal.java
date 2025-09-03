package clases;

public class Principal {

    public static void main(String[] args) {
        
        Operacion objetoOperacion = new Operacion();
        int resta = objetoOperacion.metodoResta(5, 2);
        System.out.println("La resta es "+ resta);
       
        int suma = objetoOperacion.metodoSuma(3, 7);
        System.out.println("La suma es "+ suma);
        
        int multi = objetoOperacion.metodoMulti(2, 3);
        System.out.println("La multiplicacion es "+ multi);
        
        double divi = objetoOperacion.metodoDiv(8, 2);
        System.out.println("La division es "+ divi);
        
    }

}

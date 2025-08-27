
import java.util.Scanner;


public class principal {
    
    
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
       
       System.out.print("Ingresa un numero: ");
       int primerNumero = lector.nextInt();
       
       System.out.print("Ingresa un numero: ");
       int segundoNumero = lector.nextInt();
       
       if (primerNumero == segundoNumero){
           System.out.println("Son iguales");
       }  else {
           if (primerNumero > segundoNumero){
               System.out.println("Numero "+primerNumero+" es el mayor");
           } else {
               System.out.println("Numero "+segundoNumero+" es el mayor");
           }
       }      
    }
    
}

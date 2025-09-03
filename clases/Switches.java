package clases;


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
        System.out.print("Ingresa el numero del dia: ");
        int dia = lector.nextInt();
        
        switch (dia){
            case 1:
                System.out.println("El dia es Lunes");
                break;
            case 2:
                System.out.println("El dia es Martes");
                break;
            case 3:
                System.out.println("El dia es Miercoles");
                break;
            case 4:
                System.out.println("El dia es Jueves");
                break;
            case 5:
                System.out.println("El dia es Viernes");
                break;
            case 6:
                System.out.println("El dia es Sabado");
                break;
            case 7:
                System.out.println("El dia es Domingo");
        }
    }
    
}

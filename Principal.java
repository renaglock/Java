package clases;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

//      FORMA1       
//      String[] flores = new String[5];
//
//      flores[0] = "Margarita";
//      flores[1] = "Rosa";
//      flores[2] = "Violeta";
//      flores[3] = "Tulipán";
//      flores[4] = "Girasol";
//      FORMA 2
//      String[] flores = {"Margarita", "Rosa", "Violeta", "Tulipán", "Girasol"};
//      System.out.println(flores[1]);
//        String[] estudiantes = new String[3];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < estudiantes.length; i++) {
//            System.out.println("Nombre: ");
//            estudiantes[i] = sc.nextLine();
//        }
//        for (int i = 0; i < estudiantes.length; i++) {
//            System.out.println(estudiantes[i]);
//        }
        int[] numeros = {2, 8, 9, 7};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
            
        }
        System.out.println("La suma es "+ suma);

    }
}

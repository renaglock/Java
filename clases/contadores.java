package clases;


public class contadores {

   
    public static void main(String[] args) {
       int contador = 1;
       
       while (contador <= 10){
           System.out.println("contador : "+contador);
           contador = contador + 1;
       }
       for (int i=1; i <= 10; i++){
           System.out.println("Valor : "+i);
       }
        System.out.println(" ");
        
        for (int i = 10; i >=1; i--){
            System.out.println("Valor : "+i);
        }
    }
    
}

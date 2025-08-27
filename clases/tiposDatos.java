
package clases;

public class tiposDatos {
    public static void main(String[] args) {
       
        //Tipos de datos PRIMITIVOS
        char tipoChar = 'a';
        byte tipoByte = 12;
        short tipoShort = 11562;
        int tipoInt = 569800;
        long tipoLong = 85698000L;
        float tipoFloat = 85.5f;
        double tipoDouble = 85.58416548465;
        boolean tipoBoolean = true;
        
        String frase = "Hola, soy un texto"; // Tipo de dato NO PRIMITIVOS
        
        System.out.println("Ejemplo tipo de dato CHAR" + tipoChar);
        System.out.println("Ejemplo tipo de dato BYTE" + tipoByte);
        System.out.println("Ejemplo tipo de dato SHORT" + tipoShort);
        System.out.println("Ejemplo tipo de dato INT" + tipoInt);
        System.out.println("Ejemplo tipo de dato LONG" + tipoLong);
        System.out.println("Ejemplo tipo de dato FLOAT" + tipoFloat);
        System.out.println("Ejemplo tipo de dato DOUBLE" + tipoDouble);
        System.out.println("Ejemplo tipo de dato BOOLEAN" + tipoBoolean);
        
        System.out.println("Ejemplo tipo de dato STRING" + frase);
        
        //Calcular y mostrar la longitud de la cadena
        int longitudFrase = frase.length();
        System.out.println("Longitud de la frase: "+longitudFrase);
        
    }
}

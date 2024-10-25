import java.util.Scanner;

public class Ejercicio_Bucle_II {
    public static void main (String[]args) {
        float num=0;
        int rep=0;
        while (num>=0) {
            System.out.println("Dime números hasta que sea negativo");
            Scanner nume= new Scanner(System.in);
            num=nume.nextFloat();
            if (num>=0) {
                rep+=1;
            }
        }
        System.out.println("Has escrito " + rep + " números antes de escribir uno negativo.");
    }
}

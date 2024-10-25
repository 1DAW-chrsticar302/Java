import java.util.Scanner;

public class Boletín5_9 {
    public static void main (String[]args) {
        System.out.println("Dime números enteros  positivos y uno negativo para terminar");
        float acumulador=0;
        float i=0;
        float num;
        boolean negativo=false;
        while (!negativo) {
            Scanner nume=new Scanner(System.in);
            num=nume.nextInt();
            if (num<0) {
                negativo=true;
                break;
            }
            else {
                ++i;
                acumulador=acumulador+num;
            }
        }
        System.out.println("La media de la suma de los números positivos (" + acumulador + ") es: " + acumulador/i);
    }
}

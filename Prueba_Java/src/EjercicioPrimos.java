import java.util.Scanner;
import java.lang.Math;

public class EjercicioPrimos {
    public static void main (String[]args) {
        boolean acabar=false;
        boolean primo=false;
        while (!acabar) {
            System.out.println("Dime un número y yo te diré si es primo o no");
            Scanner nume= new Scanner(System.in);
            int num= nume.nextInt();
            int i=2;
            while (i<num) {
                if (num%i == 0) {
                    primo= true;
                }
            }
            if (primo) {
                System.out.println("Tu número es primo");
            }
            else {
                System.out.println("No es primo");
            }
        }
    }
}

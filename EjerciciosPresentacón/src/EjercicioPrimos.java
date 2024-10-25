import java.util.Scanner;

public class EjercicioPrimos {
    public static void main (String[]args) {
        int num;
        boolean primo=true;
        System.out.println("Dime un número y te digo si es primo o no");
        Scanner nume= new Scanner(System.in);
        num= nume.nextInt();

        for(int i=2; i<num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
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

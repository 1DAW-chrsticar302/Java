import java.util.Scanner;

public class Ejercicio_PrimosV2 {
    public static void main (String[]args) {
        int num,i=2;
        boolean primo=true;
        System.out.println("Dime un número y te digo si es primo o no");
        Scanner nume= new Scanner(System.in);
        num= nume.nextInt();

       if (num<0) {
           System.out.println("Los numeros negativos no son primos");
       }
       else {
           while (primo && i<num) {
               if (num % i == 0) {
                   primo = false;
               }
               else {
                   i+=1;
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

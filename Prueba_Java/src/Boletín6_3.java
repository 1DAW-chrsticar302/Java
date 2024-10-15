import java.util.Scanner;

public class Boletín6_3 {
    public static void main (String[]args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un número de 3 cifras");
        num=sc.nextInt();
        if(num<100 || num>999) {
            System.out.println("Tu número tiene que ser de tres cifras. Vuelve a intentarlo");
        }
        else {

        }
    }
}

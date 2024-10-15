import java.util.Scanner;

public class Boletín6_7 {
    public static void main (String[]args) {
        int num;
        Scanner consola=new Scanner(System.in);
        System.out.println("Dime un número de como mucho dos cifras.");
        num=consola.nextInt();
        if (num<100) {
            if (num<10) {
               System.out.println("Para que sea de dos cifras le falta "+(10-num)+" números");
            }
            else {
                System.out.println("Para que sea de tres cifras le falta "+(100-num)+" números");
            }
        }
        else {
            System.out.println("Tienes que poner un número de dos cifras como mucho. Vuelve a intentarlo.");
        }
    }
}

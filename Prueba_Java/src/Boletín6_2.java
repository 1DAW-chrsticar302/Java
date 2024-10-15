import java.util.Scanner;

public class Boletín6_2 {
    public static void main (String[]args) {
        int mes,dia;
        System.out.println("En que més estamos?");
        Scanner meses=new Scanner(System.in);
        mes= meses.nextInt();
        System.out.println("En que día estamos?");
        Scanner dias=new Scanner(System.in);
        dia= dias.nextInt();
        System.out.println("Han pasado un total de "+(dia+mes*30)+" días.");
    }
}

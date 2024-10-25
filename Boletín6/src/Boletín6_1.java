import java.util.Scanner;

public class Boletín6_1 {
    public static void main (String[]args) {
        long segundos;
        int minutos;
        int horas;
        System.out.println("Dime los segundos totales");
        Scanner sc=new Scanner(System.in);
        segundos= sc.nextLong();
        horas =(int) (segundos/3600);
        segundos=segundos-horas*3600;
        minutos=(int) (segundos/60);
        segundos=segundos-(minutos*60);
        System.out.println("En total han pasado "+horas+" h, "+minutos+" min y "+segundos+" segundos.");
    }
}

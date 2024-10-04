import java.util.Scanner;

public class Ejercicio1_11 {
    public static void main(String[] args) {
        int manzanas;
        int peras;
        final double MANZANAS_PRECIO=2.35;
        final double PERAS_PRECIO=1.95;
        float total1;
        float total2;

        System.out.println("Primer semestre:");
        System.out.println("Cuántos kilos de manzana se han vendido?");
        Scanner ma= new Scanner(System.in);
        manzanas= ma.nextInt();
        System.out.println("Cuántos kilos de pera se han vendido?");
        Scanner pe= new Scanner(System.in);
        peras=pe.nextInt();

        total1= (float) (MANZANAS_PRECIO*manzanas+PERAS_PRECIO*peras);


        System.out.println("Segundo semestre:");
        System.out.println("Cuántos kilos de manzana se han vendido?");
        Scanner ma2= new Scanner(System.in);
        manzanas= ma2.nextInt();
        System.out.println("Cuántos kilos de pera se han vendido?");
        Scanner pe2 = new Scanner(System.in);
        peras= pe2.nextInt();

        total2= (float) (MANZANAS_PRECIO*manzanas+PERAS_PRECIO*peras);

        System.out.println("En el primer trimestre has ganado " + total1 + "€, en el segundo semestre " + total2 + "€ y en total " + (total1 + total2));
    }
}

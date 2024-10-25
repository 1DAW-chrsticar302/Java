import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[]args) {
        int num,eliminados=0;
        double cifra,contador=0,acumulador=0;
        boolean espositivo=false;
        Scanner consola=new Scanner(System.in);


            System.out.println("Dame un valor positivo y te quitare las cifras 0 y 8");
            num=consola.nextInt();

            if (num<=0) {
                System.out.println("Tienes que dar un valor positivo");
            }
            else {
                while (num>1) {
                    cifra=num%10;
                    num/=10;
                    if (cifra==0 || cifra==8) {
                        eliminados++;
                    }
                    else {
                        acumulador=acumulador+(cifra*Math.pow(10,contador));
                        contador+=1;
                    }
                }
                System.out.println("Número resultado: "+(int)(acumulador+0.1));
                System.out.println("Números eliminados: "+ eliminados);
            }



}}

import java.util.Scanner;

public class Boletín5_11 {
    public static void main (String[]args) {
        int num=1;
        int i=10;
        int negativos=0;
        int contador=0;
        int positivos=0;
        int cero=0;
        System.out.println("Dime 10 números enteros");
        Scanner sc=new Scanner(System.in);
        while (i>0) {
            num=sc.nextInt();
            if(num<0) {
                negativos=negativos+num;
                ++contador;
            }
            else {
                if(num>0) {
                    positivos=positivos+num;
                }
                else {
                    ++cero;
                }
            }
            i-=1;
        }
        if (cero>0) {
            System.out.println("La suma de los números positivos es " + positivos + " y la media de los negativos es " + negativos/contador);
            System.out.println("Número total de ceros= " + cero);
        }
        else {
            System.out.println("La suma de los números positivos es " + positivos + "y la media de los negativos es " + negativos/contador);
        }
    }
}

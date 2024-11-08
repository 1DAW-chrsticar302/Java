package Boletin6;

import java.util.Scanner;

public class Boletín6_6 {
    public static void main (String[]args) {
        int centena,decena,unidad,num;
        Scanner consola=new Scanner(System.in);
        System.out.println("Dime un número de tres cifras");
        num= consola.nextInt();
        if(num<100 || num>999) {
            System.out.println("Tu número tiene que ser de tres cifras. Vuelve a intentarlo");
        }
        else {
            System.out.print("Tu número "+num);
            centena=(int) num/100;
            num-=(centena*100);
            decena=(int) num/10;
            num-=(decena*10);
            unidad=num;
            System.out.println(" está compuesto por "+centena+" centenas, "+decena+" decenas y "+unidad+" unidades.");
        }
    }
}

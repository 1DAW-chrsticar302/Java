package Boletin5;

import java.util.Scanner;

public class Boletín5_10 {
    public static void main (String[]args) {
        int num=1;
        System.out.println("Dime números y te diré si son pares o impàres");
        Scanner sc=new Scanner(System.in);
        while (num!=0) {
            num=sc.nextInt();
            if(num==0) {
                System.out.println("Cerrando programa...");
                break;
            }
           else {
                if (num%2==0) {
                    System.out.println("Es par");
                }
                else {
                    System.out.println("Es impar");
                }
            }
        }
    }
}

package Boletin5;

import java.util.Scanner;

public class Boletín5_8 {
    public static void main (String[]args) {
        System.out.println("Dime números enteros  positivos y uno negativo para terminar");
        int acumulador=0;
        int num;
        boolean negativo=false;
        while(!negativo) {
            Scanner sc=new Scanner(System.in);
            num= sc.nextInt();
            if(num<0) {
                negativo=true;
                break;
            }
            else {
                acumulador++;
            }
        }
        System.out.println("Has escrito un total de " + acumulador + " números enteros positivos.");
    }
}

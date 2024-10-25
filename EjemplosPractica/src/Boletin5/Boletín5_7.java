package Boletin5;

import java.util.Scanner;

public class Boletín5_7 {
    public static void main (String[]args) {
        System.out.println("Dime números enteros  positivos y uno negativo para terminar");
        int acumulador=0;
        int num;
        boolean negativo=false;
        while (!negativo) {
            Scanner nume=new Scanner(System.in);
            num=nume.nextInt();
            if (num<0) {
                negativo=true;
                break;
            }
            else {
                acumulador=acumulador+num;
            }
        }
        System.out.println("La suma de los números positivos es: " + acumulador);
    }
}

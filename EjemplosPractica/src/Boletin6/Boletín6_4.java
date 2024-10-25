package Boletin6;

import java.util.Scanner;

public class Boletín6_4 {
    public static void main (String[]args) {
        int anyo_nacimiento,dia_nacimiento,mes_nacimiento;
        int anyo,dia,mes,diferencia_mes;
        Scanner consola=new Scanner(System.in);
        System.out.println("Dime que año naciste");
        anyo_nacimiento= consola.nextInt();
        System.out.println("Y el mes");
        mes_nacimiento=consola.nextInt();
        System.out.println("Y el día");
        dia_nacimiento= consola.nextInt();
        System.out.println("Ahora dime en que año estamos");
        anyo= consola.nextInt();
        System.out.println("Y el mes");
        mes= consola.nextInt();
        System.out.println("Y el día");
        dia= consola.nextInt();
        if (dia<dia_nacimiento) {
            mes--;
            dia+=30;
        }
        if (mes<mes_nacimiento) {
            anyo--;
            mes+=12;
        }
        System.out.println("Tienes "+(anyo-anyo_nacimiento)+" años; con "+(mes-mes_nacimiento)+" meses y "+(dia-dia_nacimiento)+" días");
    }
}

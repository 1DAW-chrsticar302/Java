package Boletin6;

import java.util.Scanner;

public class Boletín6_9 {
    public static void main (String[]args){
        float notas_acumulador=0,media,comparacion=0;
        String nombre,nombre_mayor = "";
        Scanner consola=new Scanner(System.in);

        for(int i=0;i<5;i++) {
            System.out.println("Dime el nombre del alumno");
            nombre= consola.next();
            System.out.println("Dime sus tres notas");
            notas_acumulador+= consola.nextFloat();
            notas_acumulador+= consola.nextFloat();
            notas_acumulador+= consola.nextFloat();
            media=notas_acumulador/3;

            if (media>comparacion) {
                comparacion=media;
                nombre_mayor=nombre;
            }
        }
        System.out.println("El alumno "+ nombre_mayor +" es el que tiene mayor media ("+comparacion+")");
    }
}

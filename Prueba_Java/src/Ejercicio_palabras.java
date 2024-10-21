import java.util.Scanner;

public class Ejercicio_palabras {
    public static void main (String[] args) {
        String palabra,acumulador="";
        int num,NUM_MAX;
        Scanner consola=new Scanner(System.in);
        System.out.println("Cuántas palabras quieres escribir?");
        NUM_MAX= consola.nextInt();

        System.out.println("Escribeme las palabras");
        for (num=0;num<NUM_MAX;num++) {
            palabra= consola.next();
            acumulador= palabra +" "+ acumulador;
        }
        System.out.println(acumulador);
    }
}

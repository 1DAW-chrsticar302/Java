import java.util.Scanner;
import java.lang.Math;

public class Ejercicio7_1 {
    public static void main(String[] args) {
        double valor_min=(Math.random() * 100),valor_max=(Math.random() * 100);
        int num;
        boolean estaEntre=false;
        Scanner consola = new Scanner(System.in);

        while (valor_min>=valor_max){
            valor_max=(int)(Math.random() * 100);
        }

        while (!estaEntre) {
            System.out.println("Ingrese un número que se encuentre entre "+(int)valor_min+" y "+(int)valor_max);
            num=consola.nextInt();

            if (num<valor_min || num>valor_max) {
                System.out.println("Ese número no está dentro del rango. Prueba con otro");
            }
            else {
                estaEntre=true;
            }
        }
    }
}

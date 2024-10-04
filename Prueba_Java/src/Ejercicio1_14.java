import java.util.Scanner;

public class Ejercicio1_14 {
    public static void main(String[] args) {
        System.out.println("Dame un número con decimales y te lo redondearé");
        Scanner nume = new Scanner(System.in);
        float num1 = nume.nextFloat();
        float num2 = (num1 - (int)num1);
                //Num1 es para el valor pedido, num2 es para restar num1 y su entero, para que quede la parte decimal y luego compararla.
        int sube=num2>0.5? 1:0;
        System.out.println("La aproximación de tu número es: " + ((int)num1 + sube));
    }
}

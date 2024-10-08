import java.util.Scanner;

public class Boletín5_1 {
    public static void main (String[]args) {
        int num;
        System.out.println("Dame un número entero positivo");
        Scanner nume=new Scanner(System.in);
        num=nume.nextInt();
        System.out.println("Desde el cero hasta tu número, están los siguientes números:");

        for (int cont=0;cont<=num;cont++) {
            System.out.println(cont);
        }
    }
}

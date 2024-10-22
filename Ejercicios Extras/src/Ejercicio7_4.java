import java.util.Scanner;

public class Ejercicio7_4 {
    public static void main(String[] args) {
        int num,acumulador=1;
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular su factorial: ");
        num = consola.nextInt();

        for (int i=num;i>0;i--) {
            acumulador *= i;
        }

        System.out.print("El factorial de "+num+" es "+acumulador);
    }
}

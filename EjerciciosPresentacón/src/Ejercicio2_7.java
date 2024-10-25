import java.util.Scanner;

public class Ejercicio2_7 {
    public static void main(String[] args) {
        float num1, num2, num3;
        System.out.println("Dame tres números y te los ordenaré");
        Scanner nume1= new Scanner(System.in);
        Scanner nume2= new Scanner(System.in);
        Scanner nume3= new Scanner(System.in);
        num1= nume1.nextFloat();
        num2= nume2.nextFloat();
        num3= nume3.nextFloat();
        if (num1>num2 && num1>num3) {
            if (num2>num3) {
                System.out.println("El orden de mayor a menor es: " + num1 + ", " + num2 + ", " + num3);
            }
            else {
                System.out.println("El orden de mayor a menor es: " + num1 + ", " + num3 + ", "+ num2);
            }
        }
        else {
            if (num2>num3) {
                if (num1>num3) {
                    System.out.println("El orden de mayor a menor es: " + num2 + ", " + num1 + ", " + num3);
                }
                else {
                    System.out.println("El orden de mayor a menor es: " + num2 + ", " + num3 + ", " + num1);
                }
            }
            else {
                if (num1>num2) {
                    System.out.println("El orden de mayor a menor es: " + num3 + ", " + num1 + ", " + num2);
                }
                else {
                    System.out.println("El orden de mayor a menor es: " + num3 + ", " + num2 + ", " + num1);
                }
            }
        }
    }
}

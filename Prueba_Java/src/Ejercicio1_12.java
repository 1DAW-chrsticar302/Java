import java.util.Scanner;

import static java.lang.Math.abs;

public class Ejercicio1_12 {
    public static void main(String[] args) {
        System.out.println("Dime un número y te doy su valor absoluto");
        Scanner nume = new Scanner(System.in);
        float num=nume.nextFloat();
        System.out.println("Su valor absoluto es:" + abs(num));
    }
}

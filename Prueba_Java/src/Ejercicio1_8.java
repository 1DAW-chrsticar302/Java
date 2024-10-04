import java.util.Scanner;

public class Ejercicio1_8 {
    public static void main(String[] args) {
        System.out.println("Dime tu edad");
        Scanner ed= new Scanner(System.in);
        int edad=ed.nextInt();
        String mayor;
        mayor=edad>=18?"Eres mayor de edad":"Eres menor de edad";
        System.out.println(mayor);
    }
}

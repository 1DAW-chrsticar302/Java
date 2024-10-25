import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String[] args) {
        int actual;
        System.out.println("Dime en que año estamos");
        Scanner fecha=new Scanner(System.in);
        actual=fecha.nextInt();
        System.out.println("Dime en qué año naciste");
        int anyo_nacimiento;
        Scanner nacimiento= new Scanner(System.in);
        anyo_nacimiento=nacimiento.nextInt();
        System.out.println("Tu edad es " + (actual - anyo_nacimiento));
    }
}

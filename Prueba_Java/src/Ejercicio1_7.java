import java.util.Scanner;

public class Ejercicio1_7 {
    public static void main(String[] args) {
        System.out.println("Dime el radio de tu circunferencia y te calcularé su área y longitud de circunferencia");
        double radio;
        Scanner rad=new Scanner(System.in);
        radio= rad.nextDouble();
        double longitud=  (2*radio*(Math.PI));
        double area= (radio*(Math.PI));

        System.out.println("La longitud de tu circunferencia es " + longitud + " y el área es " + area);

    }
}

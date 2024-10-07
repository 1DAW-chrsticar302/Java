import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Ejercicio2_11 {
    public static void main (String[]args) {
        System.out.println("Dime un número comprendido entre 1 y 7, correspondiente a cada día de la semana");
        Scanner nume=new Scanner(System.in);
        int num=nume.nextInt();

        switch (num) {
            case 1->System.out.println("Es lunes");
            case 2->System.out.println("Es martes");
            case 3->System.out.println("Es miércoles");
            case 4->System.out.println("Es jueves");
            case 5->System.out.println("Es viernes");
            case 6->System.out.println("Es sábado");
            case 7->System.out.println("Es domingo");
            default -> System.out.println("Debe ser un número del 1 al 7");
        }
    }
}

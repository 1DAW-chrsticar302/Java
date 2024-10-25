import java.util.Scanner;

public class Ejercicio1_13 {
    public static void main(String[] args) {
        System.out.println("Dime las notas de los tres trimestres(Deben ser valores enteros)");
        Scanner not1 = new Scanner(System.in);
        Scanner not2 = new Scanner(System.in);
        Scanner not3 = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        nota1 = not1.nextFloat();
        nota2 = not2.nextFloat();
        nota3 = not3.nextFloat();
        media=(nota1 + nota2 + nota3)/3;
        System.out.println("La media es: " + (int)media + " y en el expediente académico aparecerá: " + media);
    }
}


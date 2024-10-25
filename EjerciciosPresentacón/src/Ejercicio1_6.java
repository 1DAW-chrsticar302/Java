import java.util.Scanner;

public class Ejercicio1_6 {
    public static void main(String[] args) {
        System.out.println("Dime el valor de dos notas y te haré la media");
        float nota1;
        float nota2;
        Scanner n1= new Scanner(System.in);
        Scanner n2= new Scanner(System.in);
        nota1=n1.nextFloat();
        nota2=n2.nextFloat();
        float nota_media=((nota1 + nota2)/2);
        System.out.println("Tu nota media es: " + nota_media);

    }
}

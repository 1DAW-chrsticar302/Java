import java.util.Scanner;

public class Ejercicio1_9 {
    public static void main(String[] args) {
        System.out.println("Escribe un número y te diré si es par o no");
        Scanner nume= new Scanner(System.in);
        double num=nume.nextInt();
        String par=num%2 == 0?"Es par" : "No es par";
        System.out.println(par);
    }
}

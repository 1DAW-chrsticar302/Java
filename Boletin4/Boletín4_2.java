import java.util.Scanner;

public class Boletín4_2 {
    public static void main (String[]args) {
        System.out.println("Dame dos números");
        Scanner sc=new Scanner(System.in);
        float num=sc.nextLong();
        float num2=sc.nextLong();
        System.out.println("A. SUMAR");
        System.out.println("B. RESTAR");
        System.out.println("C. MULTIPLICAR");
        System.out.println("D. DIVIDIR");
        float resultado=0;
        boolean fin=false;

        while (!fin) {
            String letra= sc.next();
            switch (letra) {
                case "A" -> {
                    resultado = num + num2;
                    fin=true;
                }
                case "B" -> {
                    resultado = num - num2;
                    fin=true;
                }
                case "C" -> {
                    resultado = num * num2;
                    fin=true;
                }
                case "D" -> {
                    resultado = (num/num2);
                    fin=true;
                }
                default -> {
                    System.out.println("Debes seleccionar una opción");
                    fin=false;
                }
            }
        }
        System.out.println("El resultado de la operación es: " + resultado);
    }
}

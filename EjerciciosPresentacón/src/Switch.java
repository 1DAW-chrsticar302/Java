import java.util.Scanner;

public class Switch {
    public static void main (String []args) {
        String prinum;
        String segnum;
        int acumulador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Muéstrame el primer número");
        prinum = sc.next();
        System.out.println("Muéstrame el segundo número");
        segnum = sc.next();
        boolean siguiente = false;

        while (!siguiente){
            switch (prinum) {
                case "UNO" -> {
                    acumulador = acumulador + 1;
                    siguiente = true;
                }
                case "DOS" -> {
                    acumulador = acumulador + 2;
                    siguiente = true;
                }
                case "TRES" -> {
                    acumulador = acumulador + 3;
                    siguiente = true;
                }
                case "CUATRO" -> {
                    acumulador = acumulador + 4;
                    siguiente = true;
                }
                case "CINCO" -> {
                    acumulador = acumulador + 5;
                    siguiente = true;
                }
                case "SEIS" -> {
                    acumulador = acumulador + 6;
                    siguiente = true;
                }
                default -> {
                    System.out.println("Dime un número del 1 al 6");
                }
            }
        }
        siguiente = false;
        while (!siguiente){
            switch (segnum) {
                case "UNO" -> {
                    acumulador = acumulador + 1;
                    siguiente = true;
                }
                case "DOS" -> {
                    acumulador = acumulador + 2;
                    siguiente = true;
                }
                case "TRES" -> {
                    acumulador = acumulador + 3;
                    siguiente = true;
                }
                case "CUATRO" -> {
                    acumulador = acumulador + 4;
                    siguiente = true;
                }
                case "CINCO" -> {
                    acumulador = acumulador + 5;
                    siguiente = true;
                }
                case "SEIS" -> {
                    acumulador = acumulador + 6;
                    siguiente = true;
                }
                default -> {
                    System.out.println("Dime un número del 1 al 6");
                }
            }
        }
        System.out.println("La suma es : " + acumulador);
    }}

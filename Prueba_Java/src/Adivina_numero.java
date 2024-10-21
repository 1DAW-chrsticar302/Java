import java.util.Scanner;

public class Adivina_numero {
    public static void main (String[]args) {
        double numero;
        int i=6,contador,numeroAdivinar,confirmar;
        boolean hasGanado=false,quieroJugar=true;
        System.out.println("Intenta a divinar el número, tienes "+i+" intentos. Es un número del 1 al 50");
        Scanner consola= new Scanner(System.in);

        while (quieroJugar) {
            contador=0;
            i=6;
            numero= Math.random() * 50;
            while (i>0 && !hasGanado) {
                contador++;
                i--;
                System.out.println("Este es tu intento número "+contador);
                numeroAdivinar=consola.nextInt();
                if (numeroAdivinar<(int) numero) {
                    System.out.println("El número es mayor");
                }
                else {
                    if (numeroAdivinar>(int) numero) {
                        System.out.println("El número es menor");
                    }
                    else {
                        System.out.println("Has acertado");
                        hasGanado=true;
                    }
                }
            }
            System.out.println("El número era "+(int)numero);
            System.out.println("Quieres volver a jugar?     1.Si    2.No");
            confirmar=consola.nextInt();
            switch (confirmar) {
                case 1 ->{
                    System.out.println("Repitiendo partida");
                    hasGanado=false;
                }
                case 2 ->{
                    quieroJugar=false;
                    System.out.println("Gracias por jugar");
                }
            }
        }
    }
}

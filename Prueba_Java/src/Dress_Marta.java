import java.lang.Math;
import java.util.Scanner;

public class Dress_Marta {
    public static void main(String[] args) {

        boolean si_o_no;
        String color_vestido;
        double numero_vestido = Math.random() * 9;

        System.out.println("Quieres saber el color de tu vestido?(Pon true o false)");

        Scanner consola=new Scanner(System.in);
        si_o_no=consola.nextBoolean();
        if(numero_vestido<3){
            color_vestido="verde";
        }
        else {
            if (numero_vestido<6) {
                color_vestido="otro";
            }
            else {
                color_vestido="morado";
            }
        }

        if (si_o_no) {
            System.out.println("El color de tu vestido es "+color_vestido);
        }
        else {
            System.out.println("Entonces para que coño me has hecho hacer el programa, sinverguenza");
        }
    }
}

import java.util.Scanner;

public class Boletín6_3 {
    public static void main (String[]args) {
        int num,num_reves;
        int centena,decena,unidad;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un número de 3 cifras");
        num=sc.nextInt();
        if(num<100 || num>999) {
            System.out.println("Tu número tiene que ser de tres cifras. Vuelve a intentarlo");
        }
        else {
            centena=num/100;
            decena=(num-centena*100)/10;
            unidad=num-centena*100-decena*10;
            num_reves=unidad*100+decena*10+centena;

            System.out.println("Tu número al revés es: "+num_reves);

            if (num==num_reves) {
                System.out.println("Como tu número al revés sigue siendo igual que al principio, es capicúo.");
            }
            else {
                System.out.println("Tu número no es capicúo");
            }
        }
    }
}

import java.util.Scanner;

public class BuclesAnidados_1_5 {
    public static void main (String[]args) {
        Scanner consola=new Scanner(System.in);
        int m,num_ini,num_fin,numero=0;
        System.out.println("Dime dos números y te pintaré las tablas de multiplicar entre ellos");
        num_ini= consola.nextInt();
        num_fin= consola.nextInt();
        int diferencia=(num_fin-num_ini);

        for (int raws=1;raws<=diferencia+1;raws++) {
            m=0;
            for (int cols=1;cols<=11;cols++) {
                System.out.print(num_ini+" x "+m+" = "+(num_ini*m)+" | ");
                m+=1;
            }
            System.out.println("");
            num_ini+=1;
        }
    }
}

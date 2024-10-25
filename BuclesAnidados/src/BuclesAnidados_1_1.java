import java.util.Scanner;

public class BuclesAnidados_1_1 {
    public static void main(String[]args) {
        int n;
        Scanner consola=new Scanner(System.in);
        System.out.println("Dame un valor no negativo");
        n= consola.nextInt();
        int m;

        if (n<0) {
            System.out.println("He dicho no negativo");
        }
        else {
            for (int raws=n;raws>=1;raws--) {
                m=n-1;
                for(int cols=n;cols>=1;cols--) {
                    System.out.print((n-m)+" ");
                    m--;
                }
                System.out.println("");
                n--;
            }
        }
    }
}

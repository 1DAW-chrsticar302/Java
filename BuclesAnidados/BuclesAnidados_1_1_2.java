package BuclesAnidados;

import java.util.Scanner;

public class BuclesAnidados_1_1_2 {
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
            for (int i=1;i<=n;i++) {
                m=n-1;
                for(int j=1;j<=n;j++) {
                    System.out.print((n-m)+" ");
                    m--;
                }
                System.out.println("");
                n--;
                i--;
            }
        }
    }
}

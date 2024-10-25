package BuclesAnidados;

public class BuclesAnidados_1_4 {
    public static void main (String[]args) {
        int m,n=0,numero=0;

        for (int raws=1;raws<=11;raws++) {
            m=0;
            for (int cols=1;cols<=11;cols++) {
                System.out.print(n+" x "+m+" = "+(n*m)+" | ");
                m+=1;
            }
            System.out.println("");
            n+=1;
        }
    }
}

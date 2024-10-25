public class BuclesAnidados_1_3 {
    public static void main(String[]args) {
        int n=1;
        for(int raws=9;raws>=1;raws--) {
            for(int cols=1; cols<=n;cols++) {
                System.out.print("* ");
            }
            System.out.println("");
            n+=1;
        }
    }
}

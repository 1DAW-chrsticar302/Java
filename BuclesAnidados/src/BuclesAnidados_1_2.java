public class BuclesAnidados_1_2 {
    public static void main (String[]args) {
        for(int raws=5;raws>=1;raws--) {
            for (int cols=5;cols>=1;cols--) {
                if (raws - cols == 0) {
                    System.out.print("X ");
                }
                else {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }
}

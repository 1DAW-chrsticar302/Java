
public class Ejercicio1 {
    public static void main (String[]args) {
        int num;

        for (int i=6;i>0;i--) {
            for (int j =11; j>0; j--) {
               if ((j>2 && j<=5) || (j>=9 && j<=11)) {
                   System.out.print("* ");
               }
               else {
                   if((i==1 || i==2) && !(j==6)) {
                       System.out.print("* ");
                   }
                   else {
                       System.out.print("  ");
                   }

               }
            }
            System.out.println("");
        }
    }
}

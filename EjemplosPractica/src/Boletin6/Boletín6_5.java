package Boletin6;

public class Boletín6_5 {
    public static void main (String[]args) {
        int cols,raws,num=9;
        cols=num;
        for (raws=9;raws>=1;raws--) {
            for(cols=num;cols>=1;cols--) {
                System.out.print(num);
            }
            System.out.println("");
            num--;
        }
    }
}

public class Boletín5_5 {
    public static void main (String[]args) {
        System.out.println("La multiplicación de los números del 1 al 20 es:");
        float acumulador=1;
        for (float num = 1; num <=20;num++) {
            acumulador=acumulador*num;
        }
        System.out.println(acumulador);
    }
}

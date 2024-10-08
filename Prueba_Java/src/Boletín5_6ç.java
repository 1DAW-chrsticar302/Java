public class Boletín5_6ç {
    public static void main (String[]args) {
        System.out.println("La suma de los números pares del 1 al 20 es:");
        int acumulador=0;
        for (int num = 1; num <=10;num++) {
            acumulador=acumulador+2*num;
        }
        System.out.println(acumulador);

        System.out.println("La multiplicación de los números impares del 1 al 20 es:");
        float acumulador2=1;
        for (float num2 = 0; num2 <10; num2++) {
            acumulador2=acumulador2*(2* num2 +1);
        }
        System.out.println(acumulador2);
    }
}

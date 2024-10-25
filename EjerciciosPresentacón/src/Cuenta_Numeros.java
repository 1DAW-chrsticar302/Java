public class Cuenta_Numeros {
    public static void main(String[]args) {
        int num,acumulador=0;
        System.out.println("Los números pares del 1 al 30 excepto del 10 al 20 son: ");

        for (int i=1;i<=15;i++) {
            num=2*i;
            if (num<10 || num>20) {
                acumulador+=num;
                System.out.println(num);
            }
        }
        System.out.println("El total de la suma de estos números es: "+acumulador);
    }
}

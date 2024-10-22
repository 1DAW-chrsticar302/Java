public class Ejercicio7_2 {
    public static void main(String[] args) {
        for (int multiplos=7;multiplos<100;multiplos+=7) {
            System.out.println(multiplos);
        }
        System.out.println(" ");

        for (int i=1;i<100;i++) {
            if (i%7==0) {
                System.out.println(i);
            };
        }
    }
}

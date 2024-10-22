public class Ejercicio7_3 {
    public static void main(String[] args) {
        int acumulador=1,impares;

        for (int i=0;i<10;i++) {
            impares=2*i+1;
            acumulador=acumulador*impares;
            System.out.println(impares);
        }
        System.out.println("La suma de esos primeros 10 impares es: "+acumulador);
    }
}

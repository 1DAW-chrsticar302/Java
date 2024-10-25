public class Practica_clase_numeros5 {
    public static void main (String[] args) {
        int contador=0;
        int acumulador=0;
        int contador2=0;
        long acumulador2=1;
        int i;
        for(i=1;i<=20;i++) {
            if(i<=5){
                acumulador=acumulador + i;
                contador++;
            }
            if(i>5){
                acumulador2=acumulador2*i;
                contador2++;
            }
        }
        System.out.println("Hay "+contador+" números menores que 5 y suman "+acumulador);
        System.out.println("Hay "+contador2+" números mayores que 5 y su multiplicación es "+acumulador2);
        System.out.println("El valor de i es "+i);
    }
}

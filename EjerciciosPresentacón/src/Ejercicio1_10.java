import java.util.Scanner;

public class Ejercicio1_10 {
    public static void main(String[] args) {
        //Pregunta de si llueve o no y scanner de la respuesta
        System.out.println("Está lloviendo?");
        Scanner ll=new Scanner(System.in);
        boolean lloviendo=ll.nextBoolean();
        //Pregunta de si has hecho los deberes o no y scanner de la respuesta
        System.out.println("Has acabado los deberes?");
        Scanner deb=new Scanner(System.in);
        boolean deberes=deb.nextBoolean();
        //Pregunta de si necesitas ir a la biblioteca o no y scanner de la respuesta
        System.out.println("Necesitas ir a la biblioteca?");
        Scanner bib= new Scanner(System.in);
        boolean biblio=bib.nextBoolean();

        Boolean poder= biblio || (!lloviendo && deberes);

        String text=poder?"Puedes salir":"No puedes salir";
        System.out.println(text);
    }
}

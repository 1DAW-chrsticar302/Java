import java.util.Scanner;

public class Invitar_amigos {
    public static void main(String[]args) {
        float dinero,costeRefresco;
        int confirmacion,n=0;
        boolean respuestaValida=false,noInvitarMas=false;
        Scanner consola=new Scanner(System.in);

        System.out.println("Cuánto dinero tienes?");
        dinero= consola.nextFloat();

       if (dinero<0) {
           System.out.println("No puedes tener dinero en negativo");
       }
       else {
           System.out.println("Cuánto vale el refresco?");
           costeRefresco= consola.nextFloat();

           if(dinero<costeRefresco) {
               System.out.println("No tienes suficiente dinero para invitar a nadie");
           }
           else {

               System.out.println("Quieres invitar a tu amigo?");
               System.out.println("1. Si");
               System.out.println("2. No");
               confirmacion= consola.nextInt();

               while (!respuestaValida){
                   switch (confirmacion) {
                       case 1 ->{noInvitarMas=false;respuestaValida=true;}
                       case 2 ->{noInvitarMas=true;respuestaValida=true;}
                       default -> {

                           System.out.println("Respuesta no válida. Ingrese un valor correcto");
                       }
                   }
               }


               while (dinero>=costeRefresco && !noInvitarMas) {
                   dinero-=costeRefresco;
                   ++n;
                   System.out.println("Le has invitado a un refresco");
                   System.out.println("Quieres dejar de invitar a otro amigo?");
                   System.out.println("1. Si");
                   System.out.println("2. No");
                   confirmacion= consola.nextInt();
                   while (!respuestaValida){
                       switch (confirmacion) {
                           case 1 ->{noInvitarMas=true;respuestaValida=true;}
                           case 2 ->{noInvitarMas=true;respuestaValida=true;}
                           default -> {

                               System.out.println("Respuesta no válida. Ingrese un valor correcto");
                           }
                       }
                   }
               }
               if (dinero<costeRefresco){
                   System.out.println("No puedes permitirte invitar a otro amigo.");
               }
               System.out.println("Has invitado a "+n+" amigos. Te has quedado con "+dinero+" €.");
           }
       }
    }
}

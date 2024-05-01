import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try {
           int opcion = 0;

           String menu = """
               *** Selecione opcion de la convercion que desea ***
               1 - Dolar ==> Euro
               2 - Euro ==> Dolar
               3 - Peso MX ==> Dolar
               4 - Salir
               """;
           Scanner teclado = new Scanner(System.in);
           while (opcion != 4){
               System.out.println(menu);
               opcion = teclado.nextInt();

               switch (opcion){
                   case 1:
                       System.out.println("¿Cual es el valor que desea convertir?");
                       double valorIntroducido = teclado.nextDouble();
                       double euro = 0.93;
                       double valorTotal = valorIntroducido / euro;
                       System.out.println("El saldo actualizado es: " + valorTotal);
                       break;

                       case 2:
                       System.out.println("¿Cual es el valor que desea convertir?");
                       double valorIntroducido2 = teclado.nextDouble();
                       double dolar = 1.07;
                       double valorTotal2 = valorIntroducido2 * dolar;
                       System.out.println("El el valor convertido es: " + valorTotal2);
                       break;

                       case 3:
                       System.out.println("¿Cual es el valor que desea convertir?");
                       double valorIntroducido3 = teclado.nextDouble();
                       double PesoMX= 0.058;
                       double valorTotal3 = valorIntroducido3 * PesoMX;
                       System.out.println("El Valor convertido es: " + valorTotal3);
                       break;
                   case 4:
                       System.out.println("Saliendo del programa gracias por utilizar nuetros sevicios");
                       break;
                   default:
                       System.out.println("Opcion no valida");
               }
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }

    }
}

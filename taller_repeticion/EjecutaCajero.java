package intropoo.Disenopoo.taller_repeticion;
// Integrantes: Andres Vallejo, Royer Masache, Jordy Alcivar
import java.util.Scanner;

public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el saldo inicial de la cuenta");
        int saldo_inicial = teclado.nextInt();
        teclado.nextLine();
        //Creacion del objeto
        Cajero cajero = new Cajero(saldo_inicial);

        int change = 0;

        while (change != 4) {

            System.out.println("|| CAJERO POO ||");
            System.out.println("|1- para retirar dinero   |");
            System.out.println("|2- para depositar dinero |");
            System.out.println("|3- para consultar saldo |");
            System.out.println("|4- Terminar |");
            System.out.println("-----------------------------");

            change = teclado.nextInt();
            teclado.nextLine();
            switch (change) {
                case 1:
                    System.out.println("ingresar la cantidad a retirar");
                    int valor_retiro = teclado.nextInt();
                    teclado.nextLine();
                    cajero.retirar(valor_retiro);
                    System.out.println("Saldo Total: " + cajero.consultar_saldo());
                    break;

                case 2:
                    System.out.println("Ingresar la cantidad a depositar");
                    int valor_depositar = teclado.nextInt();
                    teclado.nextLine();
                    cajero.depositar(valor_depositar);
                    System.out.println("Saldo Total: " + cajero.consultar_saldo());
                    break;

                case 3:
                    System.out.println("Saldo:" + cajero.consultar_saldo());
                    break;

                case 4:
                    System.out.println("Agradecemos su preferencia");
                    break;
                default:
                    System.out.println("Opcion invalida");

            }

        }

    }
}

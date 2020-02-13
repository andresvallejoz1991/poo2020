package intropoo.Disenopoo.deber_seleccion;
import java.util.Scanner;
public class EjecutaNumeroMayor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        int n1 = scan.nextInt();
        System.out.println("Ingrese numero 2");
        int n2 = scan.nextInt();
        System.out.println("Ingrese numero 3");
        int n3 = scan.nextInt();
        System.out.println("Ingrese numero 4");
        int n4 = scan.nextInt();

        NumeroMayor numeroMayor = new NumeroMayor();
        numeroMayor.setN1(n1);
        numeroMayor.setN2(n2);
        numeroMayor.setN3(n3);
        numeroMayor.setN4(n4);

        System.out.println("El numero mayor es:");
        System.out.println(numeroMayor.obtenerMayor());
    }
}

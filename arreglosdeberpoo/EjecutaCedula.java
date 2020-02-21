package intropoo.Disenopoo.arreglosdeberpoo;
import java.util.Scanner;

public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su numero de cedula: ");
        int cedula = scan.nextInt();
        Cedula ciudadano = new Cedula(cedula);
        ciudadano.validacion();
        System.out.println(ciudadano.obtenerCedula());
        System.out.println(ciudadano.obtenerValidador());
        System.out.println(ciudadano.obtenerEstado());
    }
}

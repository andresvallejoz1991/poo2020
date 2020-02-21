package intropoo.Disenopoo.arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaBinario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero binario");
        String num = scan.nextLine();
        Binario binario = new Binario(num);
        binario.obtenerArray();
        binario.obtenerDecimal();

    }
}

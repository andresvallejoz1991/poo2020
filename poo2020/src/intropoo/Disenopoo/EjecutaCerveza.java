package intropoo.Disenopoo;
import javax.print.DocFlavor;
import java.util.Scanner;
public class EjecutaCerveza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre de cerveza");
        String nombre = scan.nextLine();
        System.out.println("Ingrese nombre tipo de cerveza");
        String tipo = scan.nextLine();
        System.out.println("Ingrese el precio por unidad");
        Double precio = scan.nextDouble();
        System.out.println("Ingrese el numero de unidades vendidas");
        int unidades = scan.nextInt();
        Cerveza cerveza = new Cerveza(precio,unidades,nombre,tipo);
        Double finale = cerveza.valor_final();
        //System.out.println("Cerveza:"+nombre+"\nTipo:"+tipo+"\nPrecio:" +precio+"\nUnidades:"+unidades+"\nTotal-Ventas"+finale);
        String mensaje = cerveza.obtener_mensaje();
        System.out.println(mensaje);

    }
}

package intropoo.Disenopoo.deber_seleccion;
import java.util.Scanner;
public class EjecutaPromedio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = scan.nextLine();
        System.out.println("Ingrese nota 1");
        Double c1 = scan.nextDouble();
        System.out.println("Ingrese nota 2");
        Double c2 = scan.nextDouble();
        System.out.println("Ingrese nota 3");
        Double c3 = scan.nextDouble();
        System.out.println("Ingrese nota 4");
        Double c4 = scan.nextDouble();
        Promedio promedio = new Promedio();
        promedio.setNombre(nombre);
        promedio.setC1(c1);
        promedio.setC2(c2);
        promedio.setC3(c3);
        promedio.setC4(c4);
        System.out.println("Nombre:");
        System.out.println(promedio.getNombre());
        System.out.println("Promedio:");
        System.out.println(promedio.obtenerPromedio());
        System.out.println("Estado:");
        System.out.println(promedio.obtenerEstado());
    }
}

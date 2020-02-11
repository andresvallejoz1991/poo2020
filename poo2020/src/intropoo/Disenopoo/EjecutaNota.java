package intropoo.Disenopoo;
import java.util.Scanner;
public class EjecutaNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre de Estudiante");
        String nombre = scan.nextLine();
        System.out.println("Ingrese Materia");
        String materia = scan.nextLine();
        System.out.println("Ingrese nota Bimestre - 1");
        Double bim1 = scan.nextDouble();
        System.out.println("Ingrese nota Bimestre - 2");
        Double bim2 = scan.nextDouble();
        Nota nota = new Nota(nombre,materia,bim1,bim2);
        Double finale = nota.nota_final();
        String ap_rp = nota.mensaje_final();
        String mensaje = nota.obtener_mensaje();
        System.out.println(mensaje);
    }
}

package intropoo.Disenopoo.taller_repeticion;
// Integrantes: Andres Vallejo, Royer Masache, Jordy Alcivar
import java.util.Scanner;
public class EjecutaDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Inicializar el scanner
        boolean bandera = true;
        int change;
        while (bandera == true){
            System.out.println("Ingrese numero 1");
            int n1 = scan.nextInt();
            System.out.println("Ingrese numero 2");
            int n2 = scan.nextInt();
            Division division = new Division(n1,n2);
            division.division();
            System.out.println(division.obtenerDivision());
            scan.nextLine();
            System.out.println("-Ingrese 1 si desea seguir ingresando numeros");
            System.out.println("-Ingrese 2 si desea cerrar el programa");
            change = scan.nextInt();
            if (change == 2){
                bandera = false;
            }else{
                bandera = true;
            }
        }
    }
}

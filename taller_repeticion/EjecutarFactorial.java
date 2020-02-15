package intropoo.Disenopoo.taller_repeticion;
// Integrantes: Andres Vallejo, Royer Masache, Jordy Alcivar
import java.util.Scanner;//Importacion librerias de Scanner
public class EjecutarFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Inicializar el scanner
        boolean bandera = true;
        int change;
        while (bandera == true){
            System.out.println("Ingrese el numero e evaluar");
            int fact = scan.nextInt();
            Factorial factorial = new Factorial();
            factorial.setFact(fact);
            System.out.println("El factorial es:");
            System.out.println(factorial.factorial(fact));
            System.out.println("-Ingrese 1 si desea seguir ingresando numeros");
            System.out.println("-Ingrese 2 si desea cerrar el programa");
            System.out.println();
            change = scan.nextInt();
            if (change == 2){
                bandera = false;
            }else{
                bandera = true;
            }
        }
    }
}

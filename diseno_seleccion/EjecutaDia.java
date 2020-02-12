package intropoo.Disenopoo.diseno_seleccion;
import java.util.Scanner;//Importacion librerias de java
public class EjecutaDia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Inicializar el scanner
        System.out.println("Ingrese el numero");
        int number = scan.nextInt();
        Dia dia =new Dia();//Constructor
        dia.setNum(number);//Actulizar variable numero
        dia.calcularNombre();
        System.out.println(dia.getNombre());//Impresion Final
    }
}


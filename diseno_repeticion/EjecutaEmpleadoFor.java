package intropoo.Disenopoo.diseno_repeticion;
import java.util.Scanner;//Importacion librerias de Scanner
public class EjecutaEmpleadoFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Inicializar el scanner
        System.out.println("Cuantos empleados desea ingresar?");
        int n = scan.nextInt();
        System.out.println("Ingrese Cuota por hora de los empleados");
        Double cuota = scan.nextDouble();
        scan.nextLine();
        for(int i =1; i<=n;i++){
            System.out.println("Ingrese nombre del Empleado");
            String nombre = scan.nextLine();
            scan.nextLine();
            System.out.println("Ingrese Horas de Trabajo");
            Double horas = scan.nextDouble();
            Empleado empleado = new Empleado();
            //Actualizar los datos
            empleado.setNombre(nombre);
            empleado.setHoras(horas);
            empleado.setCuotas(cuota);
            //Se albergan en variables para imprimirlas
            String name = empleado.getNombre();
            Double sueldo = empleado.calcularSueldo();
            //Impresiones
            System.out.println(name);
            System.out.println(sueldo);
        }

    }
}

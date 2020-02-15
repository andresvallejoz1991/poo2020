package intropoo.Disenopoo.diseno_repeticion;
import intropoo.Disenopoo.diseno_seleccion.Empleado;
import java.util.Scanner;//Importacion librerias de Scanner
public class EjecutaEmpleadoWhile {
    public static void main(String[] args) {//Meotdo Principal
        Scanner scan = new Scanner(System.in);//Inicializar el scanner
        boolean bandera = true;
        int change;
        System.out.println("Ingrese Horas de Trabajo");
        Double horas = scan.nextDouble();
        while(bandera == true){
            System.out.println("Ingrese nombre del Empleado");
            String nombre = scan.nextLine();
            scan.nextLine();
            System.out.println("Ingrese Cuota por hora");
            Double cuota = scan.nextDouble();
            intropoo.Disenopoo.diseno_seleccion.Empleado empleado = new Empleado();//Creacion de Objeto
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
            System.out.println("Ingrese 1 si desea seguir ingresando empleados ,caso contrario ingrese 2");
            change = scan.nextInt();
            if (change == 2){
                bandera = false;
            }else{
                bandera = true;
            }

        }

    }
}

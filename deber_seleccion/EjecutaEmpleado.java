package intropoo.Disenopoo.deber_seleccion;
import intropoo.Disenopoo.diseno_seleccion.Empleado;

import java.util.Scanner;//Importacion librerias de Scanner
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Inicializar el scanner
        System.out.println("Ingrese nombre del Empleado");
        String nombre = scan.nextLine();
        System.out.println("Ingrese Horas de Trabajo");
        Double horas = scan.nextDouble();
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

    }

}

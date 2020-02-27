package intropoo.Disenopoo.herencia_empleado;
import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcion = 0;

        while(opcion!=3){
            System.out.println("-----------------------------");
            System.out.println("|| EMPLEADOS ||");
            System.out.println("|1- Empleados por Horas   |");
            System.out.println("|2- Empleados Asalariados |");
            System.out.println("|3- Salir |");
            System.out.println("-----------------------------");
            opcion= scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese nombre del empleado");
                    String nombre = scan.nextLine();
                    System.out.println("Ingrese edad del empleado");
                    String edad = scan.nextLine();
                    System.out.println("Ingrese dependencia del empleado");
                    String dependencia = scan.nextLine();
                    System.out.println("Ingrese las horas de trabajo");
                    int horas = scan.nextInt();
                    System.out.println("Ingrese el valor por hora");
                    double valor= scan.nextDouble();
                    EmpleadoPorHora emph = new EmpleadoPorHora(nombre, edad,dependencia,horas,valor);
                    System.out.println("\n-----------------------");
                    System.out.println("Datos del estudiante");
                    System.out.println("Nombre:"+emph.getNombre());
                    System.out.println("Edad:"+emph.getEdad());
                    System.out.println("Dependecia:" +emph.getDepedencia());
                    emph.CalcularSueldo(horas,valor);
                    System.out.println("Sueldo:"+emph.getSueldo());
                    break;
                case 2:
                    System.out.println("Ingrese nombre del empleado");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese edad del empleado");
                    edad = scan.nextLine();
                    System.out.println("Ingrese dependencia del empleado");
                    dependencia = scan.nextLine();
                    System.out.println("Ingrese el sueldo fijo del empleado");
                    double sueldo = scan.nextDouble();

                    EmpleadoAsalariado empa = new EmpleadoAsalariado(nombre,edad,dependencia,sueldo);
                    System.out.println("\n-----------------------");
                    System.out.println("Datos del estudiante");
                    System.out.println("Nombre:"+empa.getNombre());
                    System.out.println("Edad:"+empa.getEdad());
                    System.out.println("Dependecia:" +empa.getDepedencia());
                    System.out.println("Sueldo:"+empa.getValor_mensual());
                    break;
                case  3:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        }

    }
}

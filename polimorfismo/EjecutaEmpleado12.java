package intropoo.Disenopoo.polimorfismo;

import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        //Obtener el sueldo quincenal de un empleado por horas
        EmpleadoHoras2 empleadoHoras2 = new EmpleadoHoras2();
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculo sueldo quincenal empleado por hora");
        System.out.println("Ingrese horas trabajadas");
        empleadoHoras2.setHoras(scan.nextDouble());
        System.out.println("Ingrese cuota por hora");
        empleadoHoras2.setCuota_hora(scan.nextDouble());
        empleadoHoras2.calcularQuincena();
        System.out.println("El sueldo quincenal es :"+empleadoHoras2.getSueldo());

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado();
        System.out.println("Calculo del Sueldo quincenal del empleado");
        System.out.println("Ingrese el sueldo mensual");
        empleadoAsalariado.calcularQuincena();
        System.out.println("El sueldo quincenal es"+empleadoAsalariado.getSueldo());
    }
}

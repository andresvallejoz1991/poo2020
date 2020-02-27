package intropoo.Disenopoo.herencia;
import  java.util.Scanner;
public class EjecutaPersonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("CREACOPN DE OBJETO ESTUDIANTE");
        System.out.println("Ingrese el nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese la identificacion:");
        String indent = scan.nextLine();
        System.out.println("Ingrse carrera del estudiante");
        String carrera = scan.nextLine();
        System.out.println("Ingrse estado civil");
        String estado = scan.nextLine();
        System.out.println("Ingrese fecha de nacimiento");
        String fecha = scan.nextLine();

        //Creacion del objeto estudiante
        Estudiante estudiante = new Estudiante(nombre,carrera,indent,estado,fecha);

        System.out.println("-----------------------");
        System.out.println("Datos del estudiante");
        System.out.println("Nombre:"+estudiante.getNombre());
        System.out.println("Identificacion:"+estudiante.getIndentificacion());
        System.out.println("Carrera:" +estudiante.getCarrera());
        System.out.println("Estado Civil:" +estudiante.getEstado_civil());
        System.out.println("Fecha de nacimiento:" +estudiante.getFecha_nacimimento());

        System.out.println("\nCREACOP DE OBJETO Docente");
        System.out.println("Ingrese el nombre del Docente: ");
        nombre = scan.nextLine();
        System.out.println("Ingrese la identificacion del Docente:");
        indent = scan.nextLine();
        System.out.println("Ingrese el area del Docente");
        String area = scan.nextLine();
        System.out.println("Ingrse estado civil del Docente");
        estado = scan.nextLine();
        System.out.println("Ingrese fecha de nacimiento del Docente");
        fecha = scan.nextLine();

        Docente doc = new Docente(nombre,area,indent,estado,fecha);

        System.out.println("\n-----------------------");
        System.out.println("Datos del Docente");
        System.out.println("Nombre: "+doc.getNombre());
        System.out.println("Identificacion: "+doc.getIndentificacion());
        System.out.println("Area: "+doc.getArea());
        System.out.println("Estado Civil: " +doc.getEstado_civil());
        System.out.println("Fecha de nacimiento: " +doc.getFecha_nacimimento());

        System.out.println("\nCREACOP DE OBJETO Adiminstrativo");
        System.out.println("Ingrese el nombre del personal Admimistrativo: ");
        nombre = scan.nextLine();
        System.out.println("Ingrese la identificacion del personal Administrativo:");
        indent = scan.nextLine();
        System.out.println("Ingrese el area Administrativa");
        String depedencia = scan.nextLine();
        System.out.println("Ingrse estado civil del area Administrativo");
        estado = scan.nextLine();
        System.out.println("Ingrese fecha de nacimiento del area Administrativa");
        fecha = scan.nextLine();

        Administrativo administrativo = new Administrativo(nombre,indent,depedencia,estado,fecha);

        System.out.println("\n-----------------------");
        System.out.println("Datos del area Administrativa");
        System.out.println("Nombre: "+administrativo.getNombre());
        System.out.println("Identificacion: "+administrativo.getIndentificacion());
        System.out.println("Dependencia: "+administrativo.getDependencia());
        System.out.println("Estado Civil: " +administrativo.getEstado_civil());
        System.out.println("Fecha de nacimiento: " +administrativo.getFecha_nacimimento());


    }
}

package intropoo.Disenopoo.herencia_automotriz;

import intropoo.Disenopoo.herencia.Administrativo;

import java.util.Scanner;

public class EjecutaAutomotriz extends  Automotriz{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        int n;
        String cadena2 ="";
        String cadena = "REPORTE DE NOMINA QUINCENAL\nRFC\t\t\t\t\tNOMBRE\t\t\tDEPARTAMENTO\t\tPUESTO\t\t\tSUELDO QUINCENAL\n";
        cadena += "-----------------------------------------------------------------------------------------";
        while (opcion!=4){
            System.out.println("-----------------------------");
            System.out.println("|| Empresa Automotriz||");
            System.out.println("|1- Sector Administrativo|");
            System.out.println("|2- Sector de Mecanicos|");
            System.out.println("|3- Sector de Vendedores|");
            System.out.println("|4- Salir|");
            System.out.println("-----------------------------");
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("ADMINISTRATIVO");
                    System.out.println("Ingrese el numero de empleados a ingresar");
                    n = scan.nextInt();
                    System.out.println("-----------------------------------------");
                    for(int i =0; i<n;i++){
                        scan.nextLine();
                        System.out.println("Ingrese nombre del empleado");
                        String nombre = scan.nextLine();
                        System.out.println("Ingrese departamente del empleado");
                        String depart = scan.nextLine();
                        System.out.println("Ingrese puesto del empleado");
                        String puesto = scan.nextLine();
                        System.out.println("Ingrese sueldo mensual del empleado");
                        double sueldo = scan.nextDouble();
                        Administrativos admin = new Administrativos(nombre,depart,puesto,sueldo);
                        cadena2 +="Registro Federal\t"+admin.getNombre()+"\t\t\t"+admin.getDepart()+"\t\t\t\t"
                                +admin.getPuesto()+"\t\t\t\t\t"+admin.calcularSueldoMensual()+"\n";

                    }
                    System.out.println(cadena+"\n" + cadena2 );


                    break;
                case 2:
                    System.out.println("MECANICOS");
                    System.out.println("Ingrese el numero de empleados a ingresar");
                    n = scan.nextInt();
                    System.out.println("-----------------------------------------");
                    for(int i =0; i<n;i++){
                        scan.nextLine();
                        System.out.println("Ingrese nombre del empleado");
                        String nombre = scan.nextLine();
                        System.out.println("Ingrese departamente del empleado");
                        String depart = scan.nextLine();
                        System.out.println("Ingrese puesto del empleado");
                        String puesto = scan.nextLine();
                        System.out.println("Ingrese el precio");
                        double precio = scan.nextDouble();
                        System.out.println("Ingrese numero e trabajos realizados");
                        int trabajos = scan.nextInt();
                        Mecanicos mec = new Mecanicos(nombre,depart,puesto,trabajos,precio);
                        cadena2 +="Registro Federal\t"+mec.getNombre()+"\t\t\t"+mec.getDepart()+"\t\t\t\t"
                                +mec.getPuesto()+"\t\t\t\t\t"+mec.calcularQuincena()+"\n";

                    }
                    System.out.println(cadena+"\n" + cadena2 );

                    break;
                case 3:
                    System.out.println("Vendedores");
                    System.out.println("Ingrese el numero de empleados a ingresar");
                    n = scan.nextInt();
                    System.out.println("-----------------------------------------");
                    for(int i =0; i<n;i++){
                        scan.nextLine();
                        System.out.println("Ingrese nombre del empleado");
                        String nombre = scan.nextLine();
                        System.out.println("Ingrese departamente del empleado");
                        String depart = scan.nextLine();
                        System.out.println("Ingrese puesto del empleado");
                        String puesto = scan.nextLine();
                        System.out.println("Ingrese numero de precio de los autos");
                        double precios = scan.nextDouble();
                        System.out.println("Ingrese el numero de autos vendidos");
                        int autos = scan.nextInt();
                        Vendedores ven = new Vendedores(nombre,depart,puesto,autos,precios);

                        cadena2 +="Registro Federal\t"+ven.getNombre()+"\t\t\t"+ven.getDepart()+"\t\t\t\t"
                                +ven.getPuesto()+"\t\t\t\t\t"+ven.calcularQuincena()+"\n";

                    }
                    System.out.println(cadena+"\n" + cadena2 );

                    break;
                case 4:
                    System.out.println("Salida del sistema");
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }

        }

    }

}

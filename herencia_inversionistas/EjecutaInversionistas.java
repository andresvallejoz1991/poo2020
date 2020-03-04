package intropoo.Disenopoo.herencia_inversionistas;
import  java.util.Scanner;
public class EjecutaInversionistas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena2 = "" ;
        int opcion = 0;
        System.out.println("CALCULO DE INVERSIONISTAS");
        String cadena = "REPORTE DE INVERSIONES\nNO.CLIENTE\t\t\tNOMBRE\t\t\t\tNO.CUENTA\t\t\t\t\tINTERES GANADO\n";
        cadena += "-----------------------------------------------------------------------------------------";
        boolean bandera = true;
        while(bandera == true){
            // Menú para ingreso de datos
            System.out.println("1- Calcular el interes de la Cuenta de Ahorro");
            System.out.println("2- Calcular el interes de la Cuenta de Pagaré");
            System.out.println("3- Calcular el interes de la Cuenta  Maestra");
            System.out.println("Escribe una de las opciones");
            opcion = scan.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Numero  del Cliente: ");
                    scan.nextLine();
                    String num_cli = scan.nextLine();
                    System.out.println("Nombre del Cliente: ");
                    String nombre = scan.nextLine();
                    System.out.println("Numero de Cuenta: ");
                    String num_cuen = scan.nextLine();
                    System.out.println("Capital invertido: ");
                    double capital = scan.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    scan.nextLine();
                    int plazo = scan.nextInt();
                    CuentaAhorros aho = new CuentaAhorros(num_cli,nombre,num_cuen,capital, plazo);
                    cadena2 += ""+aho.getNum_cli()+"\t\t\t"+aho.getNombre()+"\t\t\t\t"
                            +aho.getNum_cuenta()+"\t\t\t\t"+aho.calcularInteres()+"\n";
                    break;
                case 2:
                    System.out.println("Numero  del Cliente: ");
                    scan.nextLine();
                    num_cli = scan.nextLine();
                    System.out.println("Nombre del Cliente: ");
                    nombre = scan.nextLine();
                    System.out.println("Numero de Cuenta: ");
                    num_cuen = scan.nextLine();
                    System.out.println("Capital invertido: ");
                    capital = scan.nextDouble();
                    System.out.println("Tasa de Interes: ");
                    double tasa = scan.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    scan.nextLine();
                    plazo = scan.nextInt();
                    CuentaPagare pag = new CuentaPagare(num_cli,nombre,num_cuen,capital,tasa, plazo);
                    cadena2 += ""+pag.getNum_cli()+"\t\t\t"+pag.getNombre()+"\t\t\t\t"
                            +pag.getNum_cuenta()+"\t\t\t"+pag.calcularInteres()+"\n";
                    break;

                case 3:
                    System.out.println("Numero  del Cliente: ");
                    scan.nextLine();
                    num_cli = scan.nextLine();
                    System.out.println("Nombre del Cliente: ");
                    nombre = scan.nextLine();
                    System.out.println("Numero de Cuenta: ");
                    num_cuen = scan.nextLine();
                    System.out.println("Capital invertido: ");
                    capital = scan.nextDouble();
                    System.out.println("Tasa de Interes: ");
                    tasa = scan.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    scan.nextLine();
                    plazo = scan.nextInt();
                    CuentaMaestra mas = new CuentaMaestra(num_cli,nombre,num_cuen,capital,tasa,plazo);
                    cadena2 += ""+mas.getNum_cli()+"\t\t\t"+mas.getNombre()+"\t\t\t\t"
                            +mas.getNum_cuenta()+"\t\t\t\t"+mas.calcularInteres()+"\n";

                    break;
            }
            scan.nextLine();
            System.out.println("Si desea seguir calculando a los inversionistas presion |Si|");
            System.out.println("Si desea cerrar el proceso presione |No|");
            String cancelar = scan.nextLine().toUpperCase();
            if (cancelar.equals("NO")){
                System.out.println(cadena+"\n" + cadena2 );
                opcion = 5;
                bandera = false;
            }else{
                System.out.println();
                opcion = 4;

            }

        }
    }
}

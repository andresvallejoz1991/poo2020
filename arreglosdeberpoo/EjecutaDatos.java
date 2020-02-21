package intropoo.Disenopoo.arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaDatos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] vectorNombre = new String [5];
        int [] vectorEdad = new int [5];
        String [] vectorUni = new String [5];
        int [] vectorNumero = new int [5];
        Datos datos = new Datos();
        for(int i = 0; i<vectorEdad.length;i++){
            System.out.println("Ingrese el nombre: "+i);
            vectorNombre[i]=scan.nextLine();
            scan.nextLine();
            System.out.println("Ingrese la edad: "+i);
            vectorEdad[i]=scan.nextInt();
            System.out.println("Ingrese la Universidad: "+i);
            vectorUni[i]=scan.nextLine();
            scan.nextLine();
            System.out.println("Ingrese numero de telefono: "+i);
            vectorNumero[i]=scan.nextInt();
            datos.setVectorNombre(vectorNombre);
            datos.setVectorEdad(vectorEdad);
            datos.setVectorUni(vectorUni);
            datos.setVectorNumero(vectorNumero);
        }
        for(int i = 0; i<vectorEdad.length;i++){
            System.out.println("\nNombre:"+vectorNombre[i]+"\nEdad:"
                    +vectorEdad[i]+"\nUniversidad:"+vectorUni[i]+"\nNumero:"+vectorNumero[i]);
        }
    }
}

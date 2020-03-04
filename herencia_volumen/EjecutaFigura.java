package intropoo.Disenopoo.herencia_volumen;
import intropoo.Disenopoo.herenciafigura.Circulo;
import intropoo.Disenopoo.herenciafigura.Cuadrado;
import intropoo.Disenopoo.herenciafigura.Rectangulo;
import intropoo.Disenopoo.herenciafigura.Triangulo;

import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        while (opcion!=5){
            System.out.println("-----------------------------");
            System.out.println("|| Figuras||");
            System.out.println("|1- Cubo|");
            System.out.println("|2- Cilindro|");
            System.out.println("|3- Cono|");
            System.out.println("|4- Esfera|");
            System.out.println("|5- Salir|");
            System.out.println("-----------------------------");
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese nombre figura");
                    String nombre = scan.nextLine();
                    System.out.println("Ingrese la arista del cubo");
                    double arista = scan.nextDouble();
                    Cubo cubo = new Cubo(nombre,arista);
                    System.out.println(cubo.getName());
                    System.out.println("\nEl volumen del cubo  es:"+cubo.calcularVolumen());

                    break;
                case 2:
                    System.out.println("Ingrese nombre figura");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese la altura del Cilindro");
                    double altura = scan.nextDouble();
                    System.out.println("Ingrese el radio del Cilindor");
                    double radio = scan.nextDouble();
                    Cilindro cilindro = new Cilindro(nombre,altura,radio);
                    System.out.println(cilindro.getName());
                    System.out.println("\nEl volumen del cilindro es:"+cilindro.calcularVolumen());
                    break;
                case 3:
                    System.out.println("Ingrese nombre figura");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese la altura del Cono");
                    altura = scan.nextDouble();
                    System.out.println("Ingrese el radio del Cono");
                    radio = scan.nextDouble();
                    Cono cono = new Cono(nombre,altura,radio);
                    System.out.println(cono.getName());
                    System.out.println("\nEl volumen del Cono es:"+cono.calcularVolumen());
                    break;
                case 4:
                    System.out.println("Ingrese nombre figura");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese radio de la Esfera");
                    radio = scan.nextDouble();
                    Esfera esfera = new Esfera(nombre,radio);
                    System.out.println(esfera.getName());
                    System.out.println("\nEl volumen de la Esfera  es:"+esfera.calcularVolumen());

                    break;
                case 5:
                    System.out.println("Salida del sistema");
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }

        }

    }
}

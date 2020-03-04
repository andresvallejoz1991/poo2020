package intropoo.Disenopoo.polimorfismo_figura;
import intropoo.Disenopoo.herenciafigura.Circulo;
import intropoo.Disenopoo.herenciafigura.Cuadrado;
import intropoo.Disenopoo.herenciafigura.Rectangulo;
import intropoo.Disenopoo.herenciafigura.Triangulo;

import java.util.Scanner;
public class EjecutaFigura3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion =0;
        while (opcion!=5){
            System.out.println("-----------------------------");
            System.out.println("|| Figuras||");
            System.out.println("|1- Triangulo   |");
            System.out.println("|2- Cuadrado |");
            System.out.println("|3- Circulo |");
            System.out.println("|4- Rectangulo |");
            System.out.println("|5- Salir |");

            System.out.println("-----------------------------");
            System.out.println("Ingrese la figura que desesa");
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 1:
                    Triangulo3 triangulo3 = new Triangulo3();
                    System.out.println("Ingrese nombre de la figura");
                    triangulo3.setNombre(scan.nextLine());
                    System.out.println("Ingrese la base del triangulo");
                    triangulo3.setBase(scan.nextDouble());
                    System.out.println("Ingrese la altura del triangulo");
                    triangulo3.setAltura(scan.nextDouble());
                    triangulo3.calcularArea();
                    System.out.println("El area de el "+triangulo3.getNombre()
                            +" es:"+triangulo3.getArea());

                    break;
                case 2:
                    Cuadrado3 cuadrado3 = new Cuadrado3();
                    System.out.println("\nIngrese nombre de la figura");
                    cuadrado3.setNombre(scan.nextLine());
                    System.out.println("Ingrese el lado de la figura");
                    cuadrado3.setLado(scan.nextDouble());
                    cuadrado3.calcularArea();
                    System.out.println("El area de el "+cuadrado3.getNombre()
                            +" es:"+cuadrado3.getArea());

                    break;
                case 3:
                    Circulo3 circulo3 = new Circulo3();
                    System.out.println("\nIngrese nombre de la figura");
                    circulo3.setNombre(scan.nextLine());
                    System.out.println("Ingrese el radio de la figura");
                    circulo3.setRadio(scan.nextDouble());
                    circulo3.calcularArea();
                    System.out.println("El area de el "+circulo3.getNombre()
                            +" es:"+circulo3.getArea());

                    break;
                case 4:
                    Rectangulo3 rectangulo3 = new Rectangulo3();
                    System.out.println("\nIngrese nombre de la figura");
                    rectangulo3.setNombre(scan.nextLine());
                    System.out.println("Ingrese el lado de la figura");
                    rectangulo3.setLado(scan.nextDouble());
                    System.out.println("Ingrese la altura de la figura");
                    rectangulo3.setAltura(scan.nextDouble());
                    rectangulo3.calcularArea();
                    System.out.println("El area de el "+rectangulo3.getNombre()
                            +" es:"+rectangulo3.getArea());
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

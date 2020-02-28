package intropoo.Disenopoo.herenciafigura;
import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion =0;
        while (opcion!=5){
            System.out.println("-----------------------------");
            System.out.println("|| Figuras||");
            System.out.println("|1- Triangulo   |");
            System.out.println("|2- Cuadrado |");
            System.out.println("|3- Rectangulo |");
            System.out.println("|4- Circulo |");
            System.out.println("|5- Salir |");

            System.out.println("-----------------------------");
            System.out.println("Ingrese la figura que desesa");
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese nombre figura");
                    String nombre = scan.nextLine();
                    System.out.println("Ingrese base del Triangulo");
                    double base = scan.nextDouble();
                    System.out.println("Ingrese la altura del Triangulo");
                    double altura = scan.nextDouble();
                    Triangulo triangulo = new Triangulo(nombre,base,altura);
                    System.out.println(triangulo.getNombre());
                    System.out.println("\nEl area del triangulo es:"+triangulo.calcularArea());
                    break;
                case 2:
                    System.out.println("Ingrese nombre figura");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese lado del Triangulo");
                    double lado = scan.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(nombre,lado);
                    System.out.println(cuadrado.getNombre());
                    System.out.println("\nEl area del cuadrado es:"+cuadrado.calcularArea());
                    break;
                case 3:
                    System.out.println("Ingrese nombre figura");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese lado del Rectangulo");
                    lado = scan.nextDouble();
                    System.out.println("Ingrese la altura del Rectangulo");
                    altura = scan.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(nombre, lado, altura);
                    System.out.println(rectangulo.getNombre());
                    System.out.println("\nEl area del cuadrado es:"+rectangulo.calcularArea());
                    break;
                case 4:
                    System.out.println("Ingrese nombre figura");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese radio de la figura");
                    double radio = scan.nextDouble();
                    Circulo circulo = new Circulo(nombre,radio);
                    System.out.println(circulo.getNombre());
                    System.out.println("\nEl area del cuadrado es:"+circulo.calcularArea());
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

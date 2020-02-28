package intropoo.Disenopoo.herenciafigura;

public class Rectangulo extends Figura {
    public Rectangulo(String nombre, double lado, double altura){
        this.nombre = nombre;
        this.lado = lado;
        this.altura = altura;
    }
    private double lado;
    private double altura;
    private double area;


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double calcularArea(){
        area = lado*altura;
        return area;
    }

}

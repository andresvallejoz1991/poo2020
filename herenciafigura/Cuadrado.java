package intropoo.Disenopoo.herenciafigura;

public class Cuadrado extends Figura{
    public Cuadrado(String nombre,double lado){
        this.nombre = nombre;
        this.lado = lado;
    }
    private double lado;
    private double area;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double calcularArea(){
        area = lado*lado;
        return area;
    }

}

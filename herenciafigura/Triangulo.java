package intropoo.Disenopoo.herenciafigura;

public class Triangulo extends Figura{
    public Triangulo(String nombre, double base, double altura){
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }
    private double base;
    private double altura;
    private double area;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea(){
        area= (base*altura)/2;
        return area;
    }

}

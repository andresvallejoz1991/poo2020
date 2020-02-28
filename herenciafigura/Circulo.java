package intropoo.Disenopoo.herenciafigura;
import java.lang.Math;
public class Circulo extends Figura {
    public Circulo(String nombre,double radio){
        this.nombre = nombre;
        this.radio = radio;
    }
    private double radio;
    private double area;


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        area = Math.PI*(radio*radio);
        return area;
    }
}

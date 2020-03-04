package intropoo.Disenopoo.polimorfismo_figura;
import java.lang.Math;
public class Circulo3 extends Figura3{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI*(radio*radio);
    }
}

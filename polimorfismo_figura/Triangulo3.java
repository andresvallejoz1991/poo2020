package intropoo.Disenopoo.polimorfismo_figura;

public class Triangulo3 extends Figura3 {
    private double base;
    private double altura;

    @Override
    public void calcularArea() {
        area = (base*altura)/2;
    }

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
}

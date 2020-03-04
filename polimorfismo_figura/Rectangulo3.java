package intropoo.Disenopoo.polimorfismo_figura;

public class Rectangulo3 extends Figura3{
    private double lado;
    private double altura;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        area = lado*altura;
    }
}

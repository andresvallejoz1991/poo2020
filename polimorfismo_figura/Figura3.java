package intropoo.Disenopoo.polimorfismo_figura;

public abstract class Figura3 {
    protected String nombre;
    protected double area;
    /**
     * Metodo abstracto que sera implementado dentro de las clases hijas
     */
    public abstract void calcularArea();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

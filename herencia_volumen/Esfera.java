package intropoo.Disenopoo.herencia_volumen;
import java.lang.Math;
public class Esfera extends Figura{
    public Esfera(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }
    private double radio;
    private double vol;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularVolumen(){
        vol = (Math.PI*(radio*radio*radio))*4/3;
        return vol;
    }
}

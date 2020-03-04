package intropoo.Disenopoo.herencia_volumen;
import java.lang.Math;
public class Cono extends Figura {
    public Cono(String nombre, double altura, double radio){
        this.nombre = nombre;
        this.altura = altura;
        this.radio = radio;
    }
    private double radio;
    private double altura;
    private double vol;


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularVolumen(){
        vol = (Math.PI*(radio*radio)*(altura))*1/3;
        return vol;
    }
}

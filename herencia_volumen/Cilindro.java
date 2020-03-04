package intropoo.Disenopoo.herencia_volumen;
import java.lang.Math;
public class Cilindro extends Figura {
    public Cilindro(String nombre, double altura,double radio){
        this.nombre = nombre;
        this.altura = altura;
        this.radio = radio;
    }
    private double altura;
    private double radio;
    private double vol;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularVolumen(){
        vol = Math.PI*(radio*radio)*(altura);
        return vol;
    }
}

package intropoo.Disenopoo.herencia_volumen;

public class Cubo extends Figura{
    public Cubo(String nombre, double arista){
        this.nombre = nombre;
        this.arista= arista;
    }
    private double arista;
    private  double vol;

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }
    public double calcularVolumen(){
        vol = (arista)*(arista)*(arista);
        return vol;
    }
}

package intropoo.Disenopoo.herencia_automotriz;

public class Mecanicos extends Automotriz{
    public Mecanicos(String nombre, String depart, String puesto,int trabajos, double precio){
        this.nombre = nombre;
        this.depart = depart;
        this.puesto = puesto;
        this.trabajos = trabajos;
        this.precio = precio;
    }
    private int trabajos;
    private double precio;
    private double total;
    private double quincena;

    public int getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(int trabajos) {
        this.trabajos = trabajos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getQuincena() {
        return quincena;
    }

    public void setQuincena(double quincena) {
        this.quincena = quincena;
    }
    public double calcularQuincena(){
        total = precio*trabajos;
        quincena = total*0.4;
        return quincena;
    }
}

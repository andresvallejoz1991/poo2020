package intropoo.Disenopoo.herencia_automotriz;

public class Vendedores extends Automotriz{
    public Vendedores(String nombre, String depart, String puesto,int num_autos,double precio){
        this.nombre = nombre;
        this.depart = depart;
        this.puesto = puesto;
        this.num_autos = num_autos;
        this.precio = precio;
    }
    private double precio;
    private int num_autos;
    private double salario_min;
    private double quincena;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNum_autos() {
        return num_autos;
    }

    public void setNum_autos(int num_autos) {
        this.num_autos = num_autos;
    }

    public double getSalario_min() {
        return salario_min;
    }

    public void setSalario_min(double salario_min) {
        this.salario_min = salario_min;
    }

    public double getQuincena() {
        return quincena;
    }

    public void setQuincena(double quincena) {
        this.quincena = quincena;
    }
    public double calcularQuincena(){
        salario_min = 400;
        quincena = salario_min +((precio*num_autos)*0.2);
        return quincena;
    }


}

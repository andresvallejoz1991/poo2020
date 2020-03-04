package intropoo.Disenopoo.herencia_deudores;

public class Hipotecario extends Deudores{
    public Hipotecario(String num_cli,String nombre,String num_cuenta,double capital,double tasa,int plazo){
        this.num_cli = num_cli;
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.tasa = tasa;
        this.capital = capital;
        this.plazo = plazo;
    }
    private double interes;

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    public double calcularInteres(){
        interes = (capital*plazo*tasa);
        return interes;
    }
}

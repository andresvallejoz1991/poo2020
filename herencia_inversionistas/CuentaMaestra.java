package intropoo.Disenopoo.herencia_inversionistas;

public class CuentaMaestra extends Inversionistas{
    public CuentaMaestra(String num_cli,String nombre,String num_cuenta,double capital,double taza,int plazo){
        this.num_cli = num_cli;
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.capital = capital;
        this.tasa = taza;
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
        interes = capital * tasa*plazo;
        return interes;
    }
}

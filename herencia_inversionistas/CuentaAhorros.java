package intropoo.Disenopoo.herencia_inversionistas;

public class CuentaAhorros extends Inversionistas{
    public CuentaAhorros(String num_cli,String nombre,String num_cuenta,double capital,int plazo){
        this.num_cli = num_cli;
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
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
        interes = (capital*0.02*plazo)/36000;
        return interes;
    }
}

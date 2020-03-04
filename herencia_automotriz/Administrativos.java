package intropoo.Disenopoo.herencia_automotriz;

public class Administrativos extends Automotriz {
    public Administrativos(String nombre, String depart, String puesto, double sueldo_men){
        this.nombre = nombre;
        this.depart = depart;
        this.puesto = puesto;
        this.sueldo_men = sueldo_men;
    }

    private double sueldo_men;
    private double quincena;

    public double getSueldo_men() {
        return sueldo_men;
    }

    public void setSueldo_men(double sueldo_men) {
        this.sueldo_men = sueldo_men;
    }
    public double calcularSueldoMensual(){
        quincena = sueldo_men/2;
        return quincena;
    }
}

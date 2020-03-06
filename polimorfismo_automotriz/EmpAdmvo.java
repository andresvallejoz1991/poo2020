package intropoo.Disenopoo.polimorfismo_automotriz;

public class EmpAdmvo extends Empleado{
    private double sueldo_men;

    public double getSueldo_men() {
        return sueldo_men;
    }

    public void setSueldo_men(double sueldo_men) {
        this.sueldo_men = sueldo_men;
    }
    @Override
    public void sueldoQuincenal() {
        quincena = sueldo_men/2;
    }
}

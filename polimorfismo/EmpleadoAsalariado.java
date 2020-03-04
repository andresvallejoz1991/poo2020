package intropoo.Disenopoo.polimorfismo;

public class EmpleadoAsalariado extends Empleado12{
    private double sueldo_mensual;

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    /**
     * Implementacion del metodo que fue definido en la clase padre
     */
    @Override
    public void calcularQuincena() {
        setSueldo(sueldo_mensual/2);
    }
}

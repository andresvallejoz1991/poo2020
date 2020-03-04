package intropoo.Disenopoo.polimorfismo;

public class EmpleadoHoras2 extends Empleado12{
    //Atributos propios de la clase empleado
    private double horas;
    private double cuota_hora;
    //Tambien se extiende atributos da la clase padre
    public double getCuota_hora() {
        return cuota_hora;
    }
    public void setCuota_hora(double cuota_hora) {
        this.cuota_hora = cuota_hora;
    }
    //Tambien se extiende metodos da la clase padre
    @Override
    public void calcularQuincena() {
        setSueldo(getHoras() *cuota_hora);
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}

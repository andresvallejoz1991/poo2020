package intropoo.Disenopoo.herencia_empleado;

public class EmpleadoPorHora extends Empleado {
    public EmpleadoPorHora(String nombre, String edad, String dependencia, int hora, double valor_hora ){
        this.nombre = nombre;
        this.edad = edad;
        this.depedencia = dependencia;
        this.hora = hora;
        this.valor_hora = valor_hora;
    }

    private int hora;
    private double valor_hora;
    private double sueldo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    public double CalcularSueldo(int hour, double valor_hora){
        setSueldo((hora*valor_hora));
        return getSueldo();
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}

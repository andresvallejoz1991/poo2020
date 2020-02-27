package intropoo.Disenopoo.herencia_empleado;

public class EmpleadoAsalariado extends Empleado{
    public EmpleadoAsalariado(String nombre, String edad, String depedencia, double valor_mensual){
        this.nombre = nombre;
        this.edad = edad;
        this.depedencia = depedencia;
        this.valor_mensual = valor_mensual;

    }
    private double valor_mensual;

    public double getValor_mensual() {
        return valor_mensual;
    }

    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }

}

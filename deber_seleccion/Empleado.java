package intropoo.Disenopoo.deber_seleccion;

public class Empleado {
    private String nombre;
    private Double horas;
    private Double cuotas;
    private Double sueldo;

    /**
     * Meotodo para actualizar el nombre del empleado
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para actulizar las horas de trabajo
     * @param horas
     */
    public void setHoras(Double horas) {
        this.horas = horas;
    }

    /**
     * Metodo para actualizar el la cuota por hora de trabajo
     * @param cuotas
     */
    public void setCuotas(Double cuotas) {
        this.cuotas = cuotas;
    }
    //Metodo para calcular el suelo del Empleado
    public double calcularSueldo(){
        if(horas <=50){//Si las horas son menores a 40
            sueldo = (cuotas*horas);//Se multiplica las horas por la cuota
        }else{//Sino
            //Se multiplica las 40 horas por la cuota y se suma las horas extras por el doble de la cuota
            sueldo = (50*cuotas)+((horas-50)*(cuotas*3));
        }
        return sueldo;//S retorna el sueldo
    }
    public String getNombre() {
        return nombre;
    }

}

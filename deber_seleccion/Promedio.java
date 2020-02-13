package intropoo.Disenopoo.deber_seleccion;

public class Promedio {
    private String nombre;
    private double c1;
    private double c2;
    private double c3;
    private double c4;
    private double promedio;
    private String estado;


    /**
     * Metodo obtener nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo actualizar nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo Obtener nota1
     * @return
     */
    public double getC1() {
        return c1;
    }

    /**
     * Metodo actualizar nota1
     * @return
     */
    public void setC1(double c1) {
        this.c1 = c1;
    }

    /**
     * Metodo Obtener nota2
     * @return
     */
    public double getC2() {
        return c2;
    }

    /**
     * Metodo actualizar nota2
     * @return
     */
    public void setC2(double c2) {
        this.c2 = c2;
    }

    /**
     * Metodo Obtener nota3
     * @return
     */
    public double getC3() {
        return c3;
    }

    /**
     * Metodo actualizar nota3
     * @return
     */
    public void setC3(double c3) {
        this.c3 = c3;
    }

    /**
     * Metodo Obtener nota4
     * @return
     */
    public double getC4() {
        return c4;
    }

    /**
     * Metodo actualizar nota4
     * @return
     */
    public void setC4(double c4) {
        this.c4 = c4;
    }

    /**
     * Metodo Obtener Promedio
     * @return
     */
    public double obtenerPromedio(){
        promedio = (c1+c2+c3+c4)/4;
        return promedio;
    }

    /**
     * Metodo Obtener Estado
     * @return
     */
    public String obtenerEstado(){
        estado = "";
        if (obtenerPromedio()>=6){
            estado = "Aprobado";
        }else{
            estado ="Reprobado";
        }
        return estado;
    }


}

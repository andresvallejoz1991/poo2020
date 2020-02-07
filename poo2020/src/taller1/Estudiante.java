package taller1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private int ciclo;
    private String genero;

    /**
     * Metodo para obtener el valor de la variable nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return this.nombre;
    }

    /**
     * Metodo para obtener el valor de la variable edad
     * @return this.edad
     */
    public int obtener_edad(){
        return this.edad;
    }
    /**
     * Metodo para obtener el valor de la variable carrera
     * @return this.carrera
     */
    public String obtener_carrera(){
        return this.carrera;
    }
    /**
     * Metodo para obtener el valor de la variable ciclo
     * @return this.ciclo
     */
    public int obtener_ciclo(){
        return ciclo;
    }
    /**
     * Metodo para obtener el valor de la variable genero
     * @return this.genero
     */
    public String obtener_genero(){
        return genero;
    }
    /**
     * Metodo para actualizar la variable nombre
     * @param nombre
     */
    public void actualizar_nombre(String nombre){
        // Con el this hacemos referencias a las variables globales.
        this.nombre = nombre;
    }
    /**
     * Metodo para actulizar la variable edad
     * @param edad
     */
    public void actualizar_edad(int edad){
        this.edad = edad;
    }

    /**
     * Meotodo para actulizar la variable carrera
     * @param carrera
     */
    public void actualizar_carrera(String carrera){
        this.carrera = carrera;
    }
    /**
     * Meotodo para actulizar la variable ciclo
     * @param ciclo
     */
    public void actualizar_ciclo(int ciclo){
        this.ciclo = ciclo;
    }
    /**
     * Meotodo para actulizar la variable genero
     * @param genero
     */
    public void actualizar_genero(String genero){
        this.genero = genero;
    }
    /**
     * Metodo para unir las variables de hora,minuto, segundo
     * @return this.segundo
     */
    public String obtener_mensaje(){
        String union = "Nombre:"+nombre+"\nCiclo:"+ciclo+"\nEdad :"+edad+"\nCarrera:"+carrera
                +"\nGenero:"+genero;
        return union;
    }

}

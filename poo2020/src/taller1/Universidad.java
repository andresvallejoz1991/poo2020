package taller1;

public class Universidad {
    private String direccion;
    private String carrera;
    private String docente;
    private String area;

    /**
     * Metodo para obtener el valor de la variable direccion
     * @return this.direccion
     */
    public String obtener_direccion(){
        return this.direccion;
    }

    /**
     * Metodo para obtener el valor de la variable carrera
     * @return this.carrera
     */
    public String obtener_carrera(){
        return this.carrera;
    }
    /**
     * Metodo para obtener el valor de la variable docente
     * @return this.docente
     */
    public String obtener_docente(){
        return this.docente;
    }
    /**
     * Metodo para obtener el valor de la variable area
     * @return this.area
     */
    public String obtener_area(){
        return area;
    }
    /**
     * Metodo para actualizar la variable direccion
     * @param direccion
     */
    public void actualizar_direccion(String direccion){
        // Con el this hacemos referencias a las variables globales.
        this.direccion = direccion;
    }
    /**
     * Metodo para actulizar la variable carrera
     * @param carrera
     */
    public void actualizar_carrera(String carrera){
        this.carrera = carrera;
    }

    /**
     * Meotodo para actulizar la variable docente
     * @param docente
     */
    public void actualizar_docente(String docente){
        this.docente = docente;
    }
    /**
     * Meotodo para actulizar la variable area
     * @param area
     */
    public void actualizar_area(String area){
        this.area = area;
    }
    /**
     * Metodo para unir las variables de hora,minuto, segundo
     * @return this.segundo
     */
    public String obtener_mensaje(){
        String union = "Carrera:"+carrera+"\nDocente:"+docente+"\nArea:"+area+"\nDireccion:"+direccion;
        return union;
    }
}

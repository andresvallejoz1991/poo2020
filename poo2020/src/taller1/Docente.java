package taller1;

public class Docente {
    private String nombre;
    private String materia;
    private String area;

    /**
     * Metodo para obtener el valor de la variable nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return this.nombre;
    }

    /**
     * Metodo para obtener el valor de la variable materia
     * @return this.materia
     */
    public String obtener_materia(){
        return this.materia;
    }
    /**
     * Metodo para obtener el valor de la variable area
     * @return this.area
     */
    public String obtener_area(){
        return area;
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
     * Metodo para actulizar la variable materia
     * @param materia
     */
    public void actualizar_materia(String materia){
        this.materia = materia;
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
        String union = "Nombre:"+nombre+"\nMateria:"+materia+"\nArea:"+area;
        return union;
    }
}

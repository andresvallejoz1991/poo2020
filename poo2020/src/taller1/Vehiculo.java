package taller1;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String procedencia;


    /**
     * Metodo para obtener el valor de la variable marca
     * @return this.marca
     */
    public String obtener_marca(){
        return this.marca;
    }

    /**
     * Metodo para obtener el valor de la variable modelo
     * @return this.modelo
     */
    public String obtener_modelo(){
        return this.modelo;
    }
    /**
     * Metodo para obtener el valor de la variable procedencia
     * @return this.procendencia
     */
    public String obtener_procendecia(){
        return this.procedencia;
    }

    /**
     * Metodo para actualizar la variable marca
     * @param marca
     */
    public void actualizar_marca(String marca){
        // Con el this hacemos referencias a las variables globales.
        this.marca = marca;
    }
    /**
     * Metodo para actulizar la variable carrera
     * @param modelo
     */
    public void actualizar_modelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Meotodo para actulizar la variable docente
     * @param procedencia
     */
    public void actualizar_procendencia(String procedencia){
        this.procedencia = procedencia;
    }

    /**
     * Metodo para unir las variables de hora,minuto, segundo
     * @return this.segundo
     */
    public String obtener_mensaje(){
        String union = "Marca:"+marca+"\nModelo:"+modelo+"\nProcedencia:"+procedencia;
        return union;
    }
}

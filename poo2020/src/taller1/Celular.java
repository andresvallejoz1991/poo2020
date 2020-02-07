package taller1;

public class Celular {
    private String marca;
    private String modelo;
    private String gama;
    private String pantalla;

    /**
     * Metodo para obtener el valor de la variable marca
     * @return this.marca
     */
    public String obtener_direccion(){
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
     * Metodo para obtener el valor de la variable gama
     * @return this.gama
     */
    public String obtener_gama(){
        return this.gama;
    }
    /**
     * Metodo para obtener el valor de la variable pantalla
     * @return this.pantalla
     */
    public String obtener_pantalla(){
        return pantalla;
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
     * Metodo para actulizar la variable modelo
     * @param modelo
     */
    public void actualizar_modelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Meotodo para actulizar la variable gama
     * @param gama
     */
    public void actualizar_gama(String gama){
        this.gama = gama;
    }
    /**
     * Meotodo para actulizar la variable pantalla
     * @param pantalla
     */
    public void actualizar_pantalla(String pantalla){
        this.pantalla = pantalla;
    }
    /**
     * Metodo para unir las variables de hora,minuto, segundo
     * @return this.segundo
     */
    public String obtener_mensaje(){
        String union = "Marca:"+marca+"\nModelo:"+modelo+"\nGama:"+gama+"\nPantalla:"+pantalla;
        return union;
    }
}

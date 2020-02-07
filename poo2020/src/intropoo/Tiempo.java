package intropoo;

public class Tiempo {
    // Definicion de atributos globales
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Metodo para obtener el valor de la variable hora
     * @return this.hora
     */
    public int obtener_hora(){
        return this.hora;
    }

    /**
     * Metodo para obtener el valor de la variable minuto
     * @return this.minuto
     */
    public int obtener_minuto(){
        return this.minuto;
    }

    /**
     * Metodo para obtener el valor de la variable segundo
     * @return
     */
    public int obtener_segundo(){
        return this.segundo;
    }

    /**
     * Metodo para unir las variables de hora,minuto, segundo
     * @return this.segundo
     */
    public String obtener_tiempo(){
      String tiempo = hora+":"+minuto+":"+segundo;
      return tiempo;
    }

    /**
     * Metodo para actualizar la variable hora
     * @param hora
     */
    public void actualizar_hora(int hora){
        // Con el this hacemos referencias a las variables globales.
        this.hora = hora;
    }

    /**
     * Metodo para actulizar la variable minuto
     * @param minuto
     */
    public void actualizar_minuto(int minuto){
        this.minuto = minuto;
    }

    /**
     * Meotodo para actulizar la variable segundo
     * @param segundo
     */
    public void actualizar_segundo(int segundo){
        this.segundo = segundo;
    }
}

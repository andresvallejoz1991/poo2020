package taller1;

public class Computadora {
    private String marca;
    private int precio;
    private String sistema;

    /**
     * Metodo para obtener el valor de la variable marca
     * @return this.marca
     */
    public String obtener_marca(){
        return this.marca;
    }

    /**
     * Metodo para obtener el valor de la variable precio
     * @return this.edad
     */
    public int obtener_precio(){
        return this.precio;
    }
    /**
     * Metodo para obtener el valor de la variable sistema
     * @return this.sistema
     */
    public String obtener_sistema(){
        return this.sistema;
    }

    public void actualizar_marca(String marca){
        // Con el this hacemos referencias a las variables globales.
        this.marca = marca;
    }
    /**
     * Metodo para actulizar la variable precio
     * @param precio
     */
    public void actualizar_precio(int precio){
        this.precio = precio;
    }

    /**
     * Meotodo para actulizar la variable sistema
     * @param sistema
     */
    public void actualizar_sistema(String sistema){
        this.sistema = sistema;
    }

    public String obtener_mensaje(){
        String union = "Marca:"+marca+"\nPrecio:"+precio+"\nSistema :"+sistema;
        return union;
    }
}

package taller1;

public class Animal {
    private String raza;
    private int edad;
    private String especie;

    /**
     * Metodo para obtener el valor de la variable raza
     * @return this.marca
     */
    public String obtener_raza(){
        return this.raza;
    }

    /**
     * Metodo para obtener el valor de la variable edad
     * @return this.edad
     */
    public int obtener_edad(){
        return this.edad;
    }
    /**
     * Metodo para obtener el valor de la variable especie
     * @return this.especie
     */
    public String obtener_especie(){
        return this.especie;
    }

    public void actualizar_raza(String raza){
        // Con el this hacemos referencias a las variables globales.
        this.raza = raza;
    }
    /**
     * Metodo para actulizar la variable edad
     * @param edad
     */
    public void actualizar_edad(int edad){
        this.edad = edad;
    }

    /**
     * Meotodo para actulizar la variable especie
     * @param especie
     */
    public void actualizar_especie(String especie){
        this.especie = especie;
    }

    public String obtener_mensaje(){
        String union = "Especie:"+especie+"\nRaza:"+raza+"\nEdad :"+edad;
        return union;
    }
}

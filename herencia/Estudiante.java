package intropoo.Disenopoo.herencia;

/**
 * Clase que hereda de la clase persona
 * Contendra todos los atributos y metodos definidos en persona
 */
public class Estudiante extends Persona {
    /**
     * Constructor Clase estudiante
     * @param carrera
     * @param identifiacion
     * @param estado
     * @param fecha
     */
    public Estudiante(String nombre,String carrera,String identifiacion, String estado, String fecha){
        this.carrera = carrera;
        this.nombre= nombre;
        this.carrera = carrera;
        this.indentificacion = identifiacion;
        this.estado_civil = estado;
        this.fecha_nacimimento = fecha;
    }

    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void matricular(){
        System.out.println("Metodo para matricular");
    }
    public void aprender(){
        System.out.println("Metodo aprender");
    }
}

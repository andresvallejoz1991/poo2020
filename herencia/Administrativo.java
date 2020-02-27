package intropoo.Disenopoo.herencia;

public class Administrativo extends Persona {
    public Administrativo(String nombre, String dependencia, String identifiacion, String estado,String fecha){
        this.nombre= nombre;
        this.dependencia =dependencia;
        this.indentificacion = identifiacion;
        this.estado_civil = estado;
        this.fecha_nacimimento = fecha;
    }
    private String dependencia;

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    public void gestionar_dependencia(){
        System.out.println("Metodo gestionar dependencia");
    }
}

package intropoo.Disenopoo.herencia;

public class Docente extends Persona{
    public Docente(String nombre,String area,String identifiacion, String estado,String fecha){
        this.nombre= nombre;
        this.area =area;
        this.indentificacion = identifiacion;
        this.estado_civil = estado;
        this.fecha_nacimimento = fecha;
    }
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void ensenar(){
        System.out.println("Metodo Ensenar");
    }
    public void  calificar(){
        System.out.println("Metodo calificar");
    }
}

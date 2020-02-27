package intropoo.Disenopoo.herencia;

import java.util.Date;

public class Persona {
    //Atributos comunes para todas las clases
    protected String nombre;
    protected String indentificacion;
    protected String estado_civil;
    protected String fecha_nacimimento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIndentificacion() {
        return indentificacion;
    }

    public void setIndentificacion(String indentificacion) {
        this.indentificacion = indentificacion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getFecha_nacimimento() {
        return fecha_nacimimento;
    }

    public void setFecha_nacimimento(String fecha_nacimimento) {
        this.fecha_nacimimento = fecha_nacimimento;
    }
}

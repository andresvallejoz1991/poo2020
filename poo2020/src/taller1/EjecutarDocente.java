package taller1;

public class EjecutarDocente {
    public static void main(String[] args) {
        Docente docente = new Docente();
        docente.actualizar_nombre("Rene");
        docente.actualizar_materia("POO");
        docente.actualizar_area("Computacion");
        String mensaje = docente.obtener_mensaje();
        System.out.println(mensaje);
    }
}

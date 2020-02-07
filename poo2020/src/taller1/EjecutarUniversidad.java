package taller1;

public class EjecutarUniversidad {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        universidad.actualizar_carrera("Computacion");
        universidad.actualizar_direccion("Edificio");
        universidad.actualizar_area("Administrativa");
        universidad.actualizar_docente("Jhon Jairo");
        String mensaje = universidad.obtener_mensaje();
        System.out.println(mensaje);
    }
}

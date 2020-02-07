package taller1;

public class Ejecutar_Estudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_nombre("Andres");
        estudiante.actualizar_carrera("Computacion");
        estudiante.actualizar_ciclo(3);
        estudiante.actualizar_edad(19);
        estudiante.actualizar_genero("Masculino");
        String mensaje = estudiante.obtener_mensaje();
        System.out.println(mensaje);
    }
}

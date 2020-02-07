package taller1;

public class EjecutarCelular {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.actualizar_marca("Xiomi");
        celular.actualizar_gama("Alta");
        celular.actualizar_modelo("X-12");
        celular.actualizar_pantalla("Tactil");
        String mensaje = celular.obtener_mensaje();
        System.out.println(mensaje);
    }
}

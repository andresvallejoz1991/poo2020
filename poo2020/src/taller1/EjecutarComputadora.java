package taller1;

public class EjecutarComputadora {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.actualizar_marca("HP");
        computadora.actualizar_precio(1500);
        computadora.actualizar_sistema("Windows");
        String mensaje = computadora.obtener_mensaje();
        System.out.println(mensaje);
    }
}

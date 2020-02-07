package taller1;

public class EjecutarVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.actualizar_marca("BMW");
        vehiculo.actualizar_modelo("M3-GTR");
        vehiculo.actualizar_procendencia("Rockport");
        String mensaje = vehiculo.obtener_mensaje();
        System.out.println(mensaje);
    }
}

package taller1;

public class EjecutarAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.actualizar_especie("Perro");
        animal.actualizar_raza("Meztizo");
        animal.actualizar_edad(1);
        String mensaje = animal.obtener_mensaje();
        System.out.println(mensaje);
    }
}

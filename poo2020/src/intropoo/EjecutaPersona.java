package intropoo;

public class EjecutaPersona {
    public static void main(String[] args) {
        //Creacion de objeto
        Persona persona = new Persona("Femenino","Catolica",21,"Ronnie");
        System.out.println(persona.getNombre());
        System.out.println(persona.getReligion());
        System.out.println(persona.getEdad());
        System.out.println(persona.getGenero());

        Persona persona1 = new Persona("Masculino","Catolica","Pepe");
        Persona persona2 = new Persona("Masculino", "Catolica","Sidgursonn");
        System.out.println("Genero Persona1:"+persona1.getGenero());
        System.out.println("Genero Persona2:"+persona2.getGenero());

    }
}

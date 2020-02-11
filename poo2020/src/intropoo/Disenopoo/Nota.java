package intropoo.Disenopoo;

public class Nota {
    private String nombre;
    private String materia;
    private double bim1;
    private double bim2;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getBim1() {
        return bim1;
    }

    public void setBim1(double bim1) {
        this.bim1 = bim1;
    }

    public double getBim2() {
        return bim2;
    }

    public void setBim2(double bim2) {
        this.bim2 = bim2;
    }
    public Nota(String nombre, String materia, Double bim1, Double bim2){
        this.nombre = nombre;
        this.materia = materia;
        this.bim1 = bim1;
        this.bim2 = bim2;
    }
    public double nota_final(){
        double nota = bim1 + bim2;
        return nota;
    }
    public String mensaje_final(){
        String mensaje = "";
        if(nota_final()>= 28){
            mensaje = "Aprobado";
        }else{
            mensaje = "Reprobado";
        }
          return mensaje;
    }
    public String obtener_mensaje(){
        String union = "Estudiante:-"+nombre+"\nMateria:-"+materia+"\nNota-Bim1:-" +bim1+"\nNota-Bim2:-"+bim2+"\n" +
                "Nota:-"+nota_final()+"\nEstado:-"+mensaje_final();
        return union;
    }
}

package intropoo.Disenopoo.polimorfismo_inversionistas;

public abstract class Inversionistas {
   protected double intereses;
   public abstract  void calcularIntereses();

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }
}

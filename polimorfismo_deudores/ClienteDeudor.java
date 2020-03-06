package intropoo.Disenopoo.polimorfismo_deudores;

public abstract class ClienteDeudor {
    protected double deudas;
    public abstract void calcularDeuda();

    public double getDeudas() {
        return deudas;
    }

    public void setDeudas(double deudas) {
        this.deudas = deudas;
    }
}

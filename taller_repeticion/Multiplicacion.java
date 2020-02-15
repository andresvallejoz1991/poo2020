package intropoo.Disenopoo.taller_repeticion;
// Integrantes: Andres Vallejo, Royer Masache, Jordy Alcivar

public class Multiplicacion {
    private int n1;
    private int n2;
    private int resultado;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public int multiplication(){
        for(int i = 1; i<=n1;i++){
            resultado = resultado+n2;
        }
        return  resultado;
    }
}

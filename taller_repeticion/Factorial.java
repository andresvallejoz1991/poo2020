package intropoo.Disenopoo.taller_repeticion;
// Integrantes: Andres Vallejo, Royer Masache, Jordy Alcivar

public class Factorial {
    private int fact;

    public int getFact() {
        return fact;
    }

    public void setFact(int fact) {
        this.fact = fact;
    }

    public int factorial (int fact) {
        if (fact==0)
            return 1;
        else
            return fact * factorial(fact-1);
    }
}

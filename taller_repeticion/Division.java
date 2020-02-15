package intropoo.Disenopoo.taller_repeticion;

public class Division {
    private int n1;
    private int n2;
    private int i;

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


    public Division (int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public void division(){
        for( i = 0; n1>=n2;i++){
            n1 = n1-n2;
        }
    }
    public int obtenerDivision(){
        return  i;
    }
}

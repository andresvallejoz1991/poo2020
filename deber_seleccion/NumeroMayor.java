package intropoo.Disenopoo.deber_seleccion;

public class NumeroMayor {
  private int n1;
  private int n2;
  private int n3;
  private int n4;
  private int mayor;


    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }
    public int obtenerMayor(){
        if(n1>n2 && n1>n3 && n1>n4){
            mayor = n1;
        }else{
            if(n2>n1 && n2>n3 && n2>n4){
                mayor = n2;
            }else{
                if(n3>n1 && n3>n2 && n3>n4){
                    mayor = n3;
                }else{
                    if(n4>n1 && n4>n2 && n4>n3){
                        mayor = n4;
                    }
                }
            }
        }
        return mayor;
    }
}

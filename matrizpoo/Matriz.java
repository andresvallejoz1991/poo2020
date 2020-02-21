package intropoo.Disenopoo.matrizpoo;

public class Matriz {
    private int [][] matrizA = new int[3][3];
    private int [][] matrizB = new int[3][3];
    private int [][] matrizC = new int[3][3];
    private int i;
    private int j;

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }
    public void sumaMatriz(){
        for (i=0; i<matrizA.length;i++){
            for (j=0; j<matrizB.length;j++){
                matrizC[i][j]= matrizA[i][j]+matrizB[i][j];
            }
        }
    }
    public int[][] obtenerMatriz(){
        return matrizC;
    }

    public void obtenermatrices(int [][] matriz){
        for (i=0; i<matrizA.length;i++){
            for (j=0; j<matrizB.length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

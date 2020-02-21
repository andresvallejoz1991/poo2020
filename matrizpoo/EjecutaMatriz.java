package intropoo.Disenopoo.matrizpoo;
import java.util.Scanner;
public class EjecutaMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] matrizA = new int [3][3];
        int [][] matrizB = new int [3][3];
        Matriz matriz = new Matriz();
        for(int i = 0; i<matrizA.length;i++){
            for(int j =0; j<matrizB.length;j++){
                System.out.println("Ingrese valor de la matriz A");
                matrizA[i][j]= scan.nextInt();
                System.out.println("Ingrese valor de la matriz B");
                matrizB[i][j]= scan.nextInt();

        }
    }
       matriz.setMatrizA(matrizA);
        matriz.setMatrizB(matrizB);

        matriz.sumaMatriz();
        System.out.println("Matriz-A");
        matriz.obtenermatrices(matrizA);
        System.out.println("Matriz-B");
        matriz.obtenermatrices(matrizB);
        System.out.println("Matriz-C");
        matriz.obtenermatrices(matriz.obtenerMatriz());






}
}


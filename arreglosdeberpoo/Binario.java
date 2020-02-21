package intropoo.Disenopoo.arreglosdeberpoo;
import java.lang.Math;

public class Binario {
 private String num;
 private int i;
 private int conversion;


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    public Binario(String binario){
        this.num = binario;
    }
    public void obtenerArray(){
        int numeroint = Integer.parseInt(num);
        int[] array = new int[6];
        int a = 5;
        for (int i = 0; i < array.length ; i++) {
            array[a] = (int)((numeroint/Math.pow(10,i))%10);
            a--;
        }
        a =5;
        for (int i = 0; i < array.length; i++) {
            // suma de los resultados
            conversion = (int) (conversion+(array[i] * Math.pow(2, a)));
            // decremento del contador
            a--;
        }
    }
    public void obtenerDecimal(){
        System.out.println("El numero binario:"+num+" en decimal es = "+ getConversion() +" en decimal");
    }


    public int getConversion() {
        return conversion;
    }

    public void setConversion(int conversion) {
        this.conversion = conversion;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}

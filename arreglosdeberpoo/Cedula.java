package intropoo.Disenopoo.arreglosdeberpoo;

public class Cedula {
    private int cedula;
    private String status;
    int val = 0;//Variable para realizar el retorno
    //Establecer y obtener los datos ingresados por el usuario
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    // Constructor
    public Cedula(int cedula){
        this.cedula = cedula;
    }
    //validacion de la cedula
    public void validacion() {
        int[] coeficientes = {2,1,2,1,2,1,2,1,2};
        status = "Cédula incorrecta";//Estado cedula incorrecta
        // Arreglo para separar los valores de la cedula
        int[] cedulaArray = new int[10];//Total de posiciones para la cedula
        int contador = 9;//Contador con el total de numeros de la cedula
        for (int i = 0; i < cedulaArray.length ; i++) {//Ciclo para recorrer el arreglo
            cedulaArray[contador] = (int)((cedula/Math.pow(10,i))%10);//Calcular valor de la cedula
            // El contador se decrementa
            contador--;
        }
        int suma = 0;//Declaracion e inicializacion de variable para obtner suma de digitos
        // declaracion de variables local
        int resultado;
        for (int i = 0; i < (cedulaArray.length-1); i++){
            resultado = coeficientes[i] * cedulaArray[i];
            if (resultado > 9){//Si son mayores a 9 se le restara la misma cantidad
                resultado -= 9;
            }
            suma += resultado;
        }
        int residuo = suma%10;//Declaracion e inicializacion de variable para obtener los residuos
        if(residuo != 0){// condicional para obtener el valor del ultimo dijito
            val = 10 - residuo;
        }
        // condicional para validar si tiene igualdad el ultimo dijito con el valor encontrado
        if(val == cedulaArray[9]){
            status = "El numer de cedula es correcto";
        }
    }
    public int obtenerCedula(){
        return cedula;
    }
    public int obtenerValidador(){
        return val;
    }
    public String obtenerEstado(){
        return status;
    }

}

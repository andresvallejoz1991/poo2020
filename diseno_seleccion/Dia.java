package intropoo.Disenopoo.diseno_seleccion;

public class Dia {
    private int num;
    private String nombre;

    /**
     * Metodo para actualizar el numero del dia
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * Metodo para calcular el nombre
     * @return
     */
    public String calcularNombre(){
        nombre ="";
        switch (num){//Dependiendo del numero ingresado se daran estos casos
            case 1:
                nombre ="Domingo";//Dia 1
                break;
            case 2:
                nombre ="Lunes";//Dia 2
                break;
            case 3:
                nombre = "Martes";//Dia 3
                break;
            case 4:
                nombre = "Miercoles";//Dia 4
                break;
            case 5:
                nombre = "Jueves";//Dia 5
                break;
            case 6:
                nombre ="Viernes";//Dia 6
                break;
            case 7:
                nombre ="Sabado";//Dia 7
                break;
            default://Defautl en caso de que se escriba un numero superior a 7
                System.out.println("Fuera de rango");//Mensaje de error
        }
        return nombre;//Se retorna nombre
    }

    /**
     * Metodo para obtener el nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

}

package intropoo.Disenopoo.taller_repeticion;
// Integrantes: Andres Vallejo, Royer Masache, Jordy Alcivar
public class Cajero {
    private int saldo;

    /**
     * constructor para la clase Cajero
     * @param saldo
     */
    public Cajero (int saldo){
        this.saldo = saldo;

    }
    public int consultar_saldo() {
        return saldo;
    }

    /**
     * metodo para realizar un deposito
     * @param valor
     */
    public void depositar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }else{
            System.out.println("El valor ingresado es incorrecto");
        }
/**
 * metodo para retirar dinero
 */
    }
    public void retirar(int retirar){
        if (retirar <= saldo) {
            saldo = saldo - retirar;

        }else{
            System.out.println("El valor ingresado es incorrecto");
        }

    }
}

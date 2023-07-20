import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    //atributos
    private int numero;
    private double saldo,limite;
    private boolean especial;
    List<String> extrato = new ArrayList<>();
    //construtores
    public ContaCorrente(){

    }

    public ContaCorrente(int numero, double saldo, double limite, boolean especial) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.especial = especial;
    }

    //métodos

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    

    @Override
    public String toString() {
        return "\nContaCorrente\nnumero: " + numero + "\nsaldo: " + saldo + "\nlimite: " + limite + "\nespecial: " + especial+"\n";
    }

    //movimentações
    
}

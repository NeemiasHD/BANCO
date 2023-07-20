import javax.swing.JOptionPane;

public class Movimentacao {

    private String descricao;
    private char CreditoOuDebito;
    private double valor;
    private ContaCorrente contaCorrente;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getCreditoOuDebito() {
        return CreditoOuDebito;
    }

    public void setCreditoOuDebito(char creditoOuDebito) {
        this.CreditoOuDebito = creditoOuDebito;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    void saque(double valor, char CreditoOuDebito, ContaCorrente contaCorrente) {

        if (CreditoOuDebito == 'C' || CreditoOuDebito == 'c') {
            if (valor > contaCorrente.getLimite()) {
                JOptionPane.showMessageDialog(null, "Limite Insuficiente!");
            } else {

                contaCorrente.setLimite(contaCorrente.getLimite() - valor);
            }

        } else if (CreditoOuDebito == 'd' || CreditoOuDebito == 'D') {
            if (valor > contaCorrente.getSaldo()) {
                JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
            } else {
                contaCorrente.setSaldo(contaCorrente.getSaldo() - valor);
            }
        }
        contaCorrente.extrato.add("\nSaque no valor de: "+valor+"na opção: "+CreditoOuDebito+"\n");

    }

    void deposito(double valor, ContaCorrente contaCorrente) {

        contaCorrente.setSaldo(contaCorrente.getSaldo() + valor);
        contaCorrente.extrato.add("\nDeposito no valor de: "+valor+"\n");
    }

}

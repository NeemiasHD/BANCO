import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Banco {
    List<ContaCorrente> contas = new ArrayList<>();
    List<String> extrato = new ArrayList<>();

    public void CriarConta() {
        String input = JOptionPane.showInputDialog(null,"CRIAR CONTA\nQual numero da conta:");
        int numero = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null,"CRIAR CONTA\nQual o saldo da conta?");
        double saldo = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null,"CRIAR CONTA\nQual o limite da conta?");
        double limite = Double.parseDouble(input);
        ContaCorrente conta1 = new ContaCorrente(numero, saldo, limite, false);
        contas.add(conta1);
    }

    public void saque(int numero, double valor, char CreditoOuDebito) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero)
            {
                Movimentacao mov = new Movimentacao();
                mov.saque(valor, CreditoOuDebito, contas.get(i));
            }
        }
    }

    public void deposito(int numero, double valor) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero)
            {
                Movimentacao mov = new Movimentacao();
                mov.deposito(valor, contas.get(i));
            }
        }
    }

    public void transferencia(int numero, int numero2, double valor) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero)
            {
                for (int i2 = 0; i2 < contas.size(); i2++) {
                    if (contas.get(i2).getNumero() == numero2)
                    {
                        contas.get(i).setSaldo(contas.get(i).getSaldo()-valor);
                        contas.get(i2).setSaldo(contas.get(i2).getSaldo()+valor);
                        contas.get(i).extrato.add("\ntransferencia para a conta: "+numero2+" no valor de: "+valor+"\n");
                        contas.get(i2).extrato.add("\ntransferencia recebida da conta: "+numero+" no valor: "+valor+"\n");
                    }
                }
            }
        }
    }

    public void remove(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero)
            {
                contas.remove(i);
            }
        }

    }
    
    public void saldo(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero)
            {
                JOptionPane.showMessageDialog(null, "SALDO:\n\n" + contas.get(i).getSaldo());
                contas.get(i).extrato.add("\nSolicitação de saldo\n");

            }
        }
    }
    
    public void extrato(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero)
            {
                JOptionPane.showMessageDialog(null, "extrato:\n\n" + contas.get(i).extrato);
            }
        }
    }

    @Override
    public String toString() {
        return "contas:\n" + contas;
    }

}

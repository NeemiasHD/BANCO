import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        Banco banco_do_brasil = new Banco();
        String input = "";
        while (!input.equals("sair")) {
            input = JOptionPane.showInputDialog(null, "MENU BB\ndigite:\n\n(abrir conta)  -  para abrir uma conta\n(saque)  -  para fazer saque\n(extrato)  -  para ver extrato\n(saldo)  -  para ver o saldo\n(deposito)  -  para fazer depositos\n(transferencias)  -  para fazer transferencias\n(remover)  -  para fazer remover contas\n(sair)  -  para sair");
            if(input.equals("abrir conta")){
                banco_do_brasil.CriarConta();

            }
            // tenho que fazer o resto das funçoes mais é isso aí!
        }

    }

}

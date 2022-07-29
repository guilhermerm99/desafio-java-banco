package moduloJava.projetobanco;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Cliente guilherme = new Cliente();
        guilherme.setNome("guilherme ribeiro");
        Conta contaCorrente = new ContaCorrente(guilherme);
        Conta contaPoupanca = new ContaPoupanca(guilherme);
        contaCorrente.depositar(300);
        contaPoupanca.depositar(300);

        contaCorrente.transferir(300, contaPoupanca);
        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
        System.out.println("-----------------");
        Banco banco = new Banco("Santander", List.of(contaCorrente, contaPoupanca));
        banco.listarClientes();
    }
}

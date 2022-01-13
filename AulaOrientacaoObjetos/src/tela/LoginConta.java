package tela;

import modelo.ContaGenerica;
import repositorio.ContaRepositorio;

import java.util.Scanner;

public class LoginConta {

    public void mostrarTela(Scanner entrada, ContaGenerica conta) {
        mostrarOpcoes(conta);
        Integer escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                depositar(entrada, conta);
                break;
            case 2:
                sacar(entrada, conta);
                break;
            case 3:
                transferir(entrada, conta);
                break;
            case 9:
                AplicacaoBanco.main(null);
                break;
        }
    }

    private void transferir(Scanner entrada, ContaGenerica conta) {
        System.out.println("Informe o valor a ser transferido:");
        Double valor = entrada.nextDouble();

        System.out.println("Informe o numero da conta de destino:");
        Integer numeroContaDestino = entrada.nextInt();

        ContaRepositorio contaRepositorio = new ContaRepositorio();
        ContaGenerica contaDestino = contaRepositorio.buscarPeloNumero(numeroContaDestino);

        conta.transferir(valor, contaDestino);

        mostrarTela(entrada, conta);
    }

    private void sacar(Scanner entrada, ContaGenerica conta) {}

    private void depositar(Scanner entrada, ContaGenerica conta) {
        System.out.println("Informe o valor a ser depositado:");
        Double valor = entrada.nextDouble();

        conta.depositar(valor);

        System.out.println("Saldo atual: " + conta.getSaldo());

        mostrarTela(entrada, conta);
    }

    private void mostrarOpcoes(ContaGenerica conta) {
        System.out.println("Bem vindo a sua conta " + conta.getTitular().getNome());
        System.out.println("+------------------------+");
        System.out.println("|-Operações da Conta-----|");
        System.out.println("|------------------------|");
        System.out.println("| 1 - Depositar----------|");
        System.out.println("| 2 - Sacar--------------|");
        System.out.println("| 3 - Transferir---------|");
        System.out.println("| 9 - Voltar-------------|");
        System.out.println("+------------------------+");
        System.out.println("");
        System.out.println("Escolha a opção desejada: ");
    }
}

package tela;

import modelo.ContaCorrente;
import modelo.ContaGenerica;
import modelo.ContaPoupanca;
import modelo.Pessoa;
import repositorio.ContaRepositorio;
import repositorio.PessoaRepositorio;

import java.util.Scanner;

public class ContaTela {

    public void mostrarTela(Scanner entrada) {
        mostrarOpcoes();
        Integer opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                cadastrarConta(entrada);
                break;
            case 9:
                AplicacaoBanco.main(null);
                break;
        }
    }

    private void cadastrarConta(Scanner entrada) {
        System.out.println("Você é um cliente do banco? (S/N)");
        String resposta = entrada.next();

        if (resposta.equalsIgnoreCase("n")) {
            ClienteTela clienteTela = new ClienteTela();
            clienteTela.mostrarTela(entrada);
        }

        System.out.println("Informe o nome do cliente:");
        String nomeCliente = entrada.next();

        PessoaRepositorio clienteRepositorio = new PessoaRepositorio();
        Pessoa cliente = clienteRepositorio.buscarPorNome(nomeCliente);

        if (cliente == null) {
            System.out.println("CLIENTE NÃO ENCONTRADO");
            cadastrarConta(entrada);
        }

        System.out.println("Qual o tipo de conta desejas criar?");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("Opção desejada:");
        Integer tipoConta = entrada.nextInt();

        ContaGenerica conta = null;
        if (tipoConta == 1) {
            System.out.println("Informe o limite da conta:");
            Double limite = entrada.nextDouble();
            conta = new ContaCorrente(cliente, limite);
        } else if (tipoConta == 2) {
            conta = new ContaPoupanca(cliente);
        } else {
            System.out.println("Opção inválida / Repita a operação!!!");
            cadastrarConta(entrada);
        }

        ContaRepositorio contaRepositorio = new ContaRepositorio();
        contaRepositorio.salvar(conta);
        System.out.println(contaRepositorio.buscarTodos());

        mostrarTela(entrada);
    }

    private void mostrarOpcoes() {
        System.out.println("+------------------------+");
        System.out.println("|-Conta------------------|");
        System.out.println("|------------------------|");
        System.out.println("| 1 - Cadastrar----------|");
        System.out.println("| 2 - Cancelar-----------|");
        System.out.println("| 3 - Entrar-------------|");
        System.out.println("| 9 - Voltar-------------|");
        System.out.println("+------------------------+");
        System.out.println("");
        System.out.println("Escolha a opção desejada: ");
    }

}

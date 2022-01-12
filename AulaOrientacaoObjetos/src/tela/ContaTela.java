package tela;

import modelo.ContaCorrente;
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
        }
    }

    private void cadastrarConta(Scanner entrada) {
        System.out.println("Informe o nome do cliente:");
        String nomeCliente = entrada.next();

        PessoaRepositorio clienteRepositorio = new PessoaRepositorio();

        Pessoa cliente = clienteRepositorio.buscarPorNome(nomeCliente);

        ContaCorrente contaCorrente = new ContaCorrente(cliente, 0.0);

        ContaRepositorio contaRepositorio = new ContaRepositorio();

        contaRepositorio.salvar(contaCorrente);

        System.out.println(contaRepositorio.buscarTodos());

        mostrarTela(entrada);
    }

    private void mostrarOpcoes() {
        System.out.println("|========================|");
        System.out.println("|-Conta------------------|");
        System.out.println("|========================|");
        System.out.println("| 1 - Cadastrar----------|");
        System.out.println("| 2 - Cancelar-----------|");
        System.out.println("| 3 - Entrar-------------|");
        System.out.println("| 9 - Voltar-------------|");
        System.out.println("|========================|");
        System.out.println("");
        System.out.println("Escolha a opção desejada: ");
    }

}

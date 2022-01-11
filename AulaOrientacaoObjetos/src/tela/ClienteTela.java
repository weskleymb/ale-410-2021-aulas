package tela;

import modelo.Pessoa;
import modelo.Sexo;
import repositorio.PessoaRepositorio;

import java.util.Scanner;

public class ClienteTela {

    public void mostrarTela(Scanner entrada) {

        this.mostrarOpcoes();
        Integer escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                cadastrarCliente(entrada);
                break;
            case 3:
                removerCliente(entrada);
                break;
            case 5:
                buscarTodos(entrada);
                break;
            case 9:
                AplicacaoBanco.main(null);
                break;
        }
    }

    private void removerCliente(Scanner entrada) {
        PessoaRepositorio clienteRepositorio = new PessoaRepositorio();

        System.out.println("Informe o nome do cliente a ser removido:");
        String nomeCliente = entrada.next();

        Pessoa cliente = clienteRepositorio.buscarPorNome(nomeCliente);

        System.out.println(cliente);

        if (cliente != null) {
            System.out.println("entrou");
            clienteRepositorio.remover(cliente);
        }

        mostrarTela(entrada);
    }

    private void buscarTodos(Scanner entrada) {
        PessoaRepositorio clienteRepositorio = new PessoaRepositorio();
        for (Pessoa cliente : clienteRepositorio.buscarTodos()) {
            System.out.println(cliente);
        }
        mostrarTela(entrada);
    }

    private void cadastrarCliente(Scanner entrada) {
        System.out.println("Informe o nome do cliente:");
        String nomeCliente = entrada.next();

        System.out.println("Informe a idade do cliente:");
        Integer idadeCliente = entrada.nextInt();

        System.out.println("Informe o sexo do cliente (M/F):");
        String sexoEscolhido = entrada.next();

        Sexo sexoCliente = Sexo.MASCULINO;
        if (sexoEscolhido.equalsIgnoreCase("f")) {
            sexoCliente = Sexo.FEMININO;
        }

        Pessoa cliente = new Pessoa(nomeCliente, idadeCliente, sexoCliente);

        PessoaRepositorio clienteRepositorio = new PessoaRepositorio();
        clienteRepositorio.salvar(cliente);

        mostrarTela(entrada);
    }

    private void mostrarOpcoes() {
        System.out.println("|========================|");
        System.out.println("|-Cliente----------------|");
        System.out.println("|========================|");
        System.out.println("| 1 - Cadastrar----------|");
        System.out.println("| 2 - Modificar----------|");
        System.out.println("| 3 - Remover------------|");
        System.out.println("| 4 - Buscar por nome----|");
        System.out.println("| 5 - Listar todos-------|");
        System.out.println("| 9 - Voltar-------------|");
        System.out.println("|========================|");
        System.out.println("");
        System.out.println("Escolha a opção desejada: ");
    }

}

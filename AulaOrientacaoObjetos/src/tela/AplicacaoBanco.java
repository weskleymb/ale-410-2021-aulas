package tela;

import java.util.Scanner;

public class AplicacaoBanco {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        mostrarOpcoes();
        Integer opcaoEscolhida = entrada.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                // ir para opções de cliente
                ClienteTela clienteTela = new ClienteTela();
                clienteTela.mostrarTela(entrada);
                break;
            case 2:
                // ir para opções de conta
                ContaTela contaTela = new ContaTela();
                contaTela.mostrarTela(entrada);
                break;
            case 9:
                System.out.println("ATE MAIS");
                System.exit(0);
                break;
        }

    }

    private static void mostrarOpcoes() {
        System.out.println("+------------------------+");
        System.out.println("|-----Banco do Senac-----|");
        System.out.println("|------------------------|");
        System.out.println("| 1 - Cliente------------|");
        System.out.println("| 2 - Conta--------------|");
        System.out.println("| 9 - Sair---------------|");
        System.out.println("+------------------------+");
        System.out.println("");
        System.out.println("Escolha a opção desejada: ");
    }

}

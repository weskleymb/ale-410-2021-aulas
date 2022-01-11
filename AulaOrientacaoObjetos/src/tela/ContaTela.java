package tela;

import java.util.Scanner;

public class ContaTela {

    public void mostrarTela(Scanner entrada) {
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
        Integer opcao = entrada.nextInt();
    }

}

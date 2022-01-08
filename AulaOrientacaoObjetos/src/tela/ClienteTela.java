package tela;

import java.util.Scanner;

public class ClienteTela {

    public void mostrarTela(Scanner entrada) {
        System.out.println("|========================|");
        System.out.println("|-Cliente----------------|");
        System.out.println("|========================|");
        System.out.println("| 1 - Cadastrar----------|");
        System.out.println("| 2 - Modificar----------|");
        System.out.println("| 3 - Remover------------|");
        System.out.println("| 9 - Voltar-------------|");
        System.out.println("|========================|");
        System.out.println("");
        System.out.println("Escolha a opção desejada: ");
        Integer escolha = entrada.nextInt();


        switch (escolha) {
            case 9:
                AplicacaoBanco.main(null);
                break;
        }
    }

}

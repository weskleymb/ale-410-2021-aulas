package tela;

import modelo.ContaGenerica;

import java.util.Scanner;

public class LoginConta {

    public void mostrarTela(Scanner entrada, ContaGenerica conta) {
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

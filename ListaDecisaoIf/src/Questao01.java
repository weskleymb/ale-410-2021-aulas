import java.util.Scanner;

public class Questao01 {

    /*
    Faça um Programa que peça dois números
    e imprima o maior deles.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // solicitação do 1º número
        System.out.println("Informe o número 1:");
        Integer numero1 = entrada.nextInt();

        // solicitação do 2º número
        System.out.println("Informe o número 2:");
        Integer numero2 = entrada.nextInt();

        // atribui o 2º número ao maior de todos
        Integer maiorDeTodos = numero2;

        // troca o maior de todos para o número 1 se for maior
        if (numero1 >= numero2) {
            maiorDeTodos = numero1;
        }

        // imprime o maior de todos
        System.out.println("O número maior é " + maiorDeTodos);

    }

}

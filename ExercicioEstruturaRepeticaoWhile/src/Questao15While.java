import java.util.Scanner;

public class Questao15While {

    /*
    A série de Fibonacci é formada pela
    seqüência 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...
    Faça um programa capaz de gerar a série até o n−ésimo termo.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer anterior = 1;
        Integer atual = 1;
        Integer proximo = 0;

        String resultado = "";

        System.out.println("Informe a quantidade de termos da série:");
        Integer quantidadeDeTermos = scanner.nextInt();

        Integer i = 1;

        while (i <= quantidadeDeTermos) {

            anterior = atual;
            atual = proximo;
            proximo = anterior + atual;

            if (i < quantidadeDeTermos) {
                resultado += proximo + ", ";
            } else {
                resultado += proximo;
            }

            i++;

        }

        System.out.println(resultado);

    }

}

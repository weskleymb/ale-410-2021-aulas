import java.util.Scanner;

public class Questao01 {

    /*
    Faça um programa que peça uma nota,
    entre zero e dez. Mostre uma mensagem
    caso o valor seja inválido e continue
    pedindo até que o usuário
    informe um valor válido.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        Integer numero = scanner.nextInt();

        Boolean numeroInvalido = numero < 0 || numero > 10;

        while (numeroInvalido) {
            System.out.println("Valor invalido");
            System.out.println("Digite novamente um número");
            numero = scanner.nextInt();
            numeroInvalido = numero < 0 || numero > 10;
        } // fim do while

        System.out.println("Parabéns!! Número válido");

    }

}

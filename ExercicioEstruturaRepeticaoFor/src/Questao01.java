import java.util.Scanner;

public class Questao01 {

    /*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido e
    continue pedindo até que o usuário informe um valor válido.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota:");
        Double nota = entrada.nextDouble();

        for (Integer contador = 1; nota < 0.0 || nota > 10.0; contador++) {

            System.out.println("Nota Inválida!!! Tentativa " + contador);

            System.out.println("Digite a nota novamente:");
            nota = entrada.nextDouble();

        }

    }

}

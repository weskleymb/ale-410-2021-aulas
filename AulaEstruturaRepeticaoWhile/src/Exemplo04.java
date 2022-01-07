import java.util.Scanner;

public class Exemplo04 {

    /*
    Faça um programa que some todos os números
    de entrada até o usuário digitar ZERO (0) e
    exiba o resultado da soma.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer numeroDigitado = 0;
        Integer soma = 0;

        do {
            System.out.println("Digite um número:");
            numeroDigitado = scanner.nextInt();
            soma += numeroDigitado;
        } while (numeroDigitado != 0);

        System.out.println(soma);

    }

}
